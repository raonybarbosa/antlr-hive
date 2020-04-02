package br.com.antlr.hplsql.utils;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import br.com.antlr.hplsql.antlr.HplsqlParser;
import br.com.antlr.hplsql.dto.BoasPraticasDto;

public class AstPrinter {

	private boolean ignoringWrappers = true;
	List<BoasPraticasDto> lista = new ArrayList();

	public List<BoasPraticasDto> print(RuleContext ctx) {
		return listaBoasPraticas(ctx, 0);
	}

	private List<BoasPraticasDto> listaBoasPraticas(RuleContext ctx, int indentation) {
		BoasPraticasDto boasPraticas = new BoasPraticasDto();
		boolean toBeIgnored = ignoringWrappers && ctx.getChildCount() == 1
				&& ctx.getChild(0) instanceof ParserRuleContext;
		if (!toBeIgnored) {
			boasPraticas.setFragmento(ctx.getText());
			boasPraticas.setRegra(HplsqlParser.ruleNames[ctx.getRuleIndex()]);
			lista.add(boasPraticas);
		}
		for (int i = 0; i < ctx.getChildCount(); i++) {
			ParseTree element = ctx.getChild(i);
			if (element instanceof RuleContext) {
				System.out.println("RuleContext	" + HplsqlParser.ruleNames[((RuleContext) element).getRuleIndex()]);
				System.out.println("Context		" + HplsqlParser.ruleNames[ctx.getRuleIndex()]);
				listaBoasPraticas((RuleContext) element, indentation + (toBeIgnored ? 0 : 1));
			}
		}
		return lista;
	}
}
