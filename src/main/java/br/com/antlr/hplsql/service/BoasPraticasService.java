package br.com.antlr.hplsql.service;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.antlr.hplsql.antlr.HplsqlLexer;
import br.com.antlr.hplsql.antlr.HplsqlParser;
import br.com.antlr.hplsql.component.ValidadorBoasPraticasComponent;
import br.com.antlr.hplsql.dto.BoasPraticasDto;
import br.com.antlr.hplsql.dto.EntradaComandoDto;

@Service
public class BoasPraticasService {

	private boolean ignoringWrappers = true;
	private List<BoasPraticasDto> lista;

	@Autowired
	private ValidadorBoasPraticasComponent validadorBoasPraticasComponent;

	public String preencheEntrada(EntradaComandoDto entrada) {
		lista = new ArrayList();
		HplsqlLexer lexer = new HplsqlLexer(new ANTLRInputStream(entrada.getScript().toUpperCase()));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		HplsqlParser parser = new HplsqlParser(tokens);
		List<BoasPraticasDto> listaParser = this.print(parser.program());
		return validadorBoasPraticasComponent.validarBoasPraticas(listaParser);
	}

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
				listaBoasPraticas((RuleContext) element, indentation + (toBeIgnored ? 0 : 1));
			}
		}
		return lista;
	}
}
