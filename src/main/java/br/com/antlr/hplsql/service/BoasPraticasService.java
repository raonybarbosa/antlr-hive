package br.com.antlr.hplsql.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import br.com.antlr.hplsql.antlr.HplsqlLexer;
import br.com.antlr.hplsql.antlr.HplsqlParser;
import br.com.antlr.hplsql.dto.ArvoreSintaticaDto;
import br.com.antlr.hplsql.dto.EntradaComandoDto;
import br.com.antlr.hplsql.dto.RegraPraticaDto;
import br.com.antlr.hplsql.dto.RegrasDto;

@Service
public class BoasPraticasService {

	private boolean ignoringWrappers = true;
	private List<ArvoreSintaticaDto> lista;
	private RegraPraticaDto regraPratica = new RegraPraticaDto();

	public String preencheEntrada(EntradaComandoDto entrada) {
		lista = new ArrayList();
		if (StringUtils.trimAllWhitespace(entrada.getScript()).toUpperCase().contains("CREATEEXTERNALTABLE")
				|| StringUtils.trimAllWhitespace(entrada.getScript()).toUpperCase().contains("CREATETABLE")) {
			HplsqlLexer lexer = new HplsqlLexer(new ANTLRInputStream(entrada.getScript().toUpperCase()));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			HplsqlParser parser = new HplsqlParser(tokens);
			return this.validarBoasPraticas(this.print(parser.program()));
		}
		return "Não existe regra para esse comando";
	}

	private List<ArvoreSintaticaDto> print(RuleContext ctx) {
		return listaBoasPraticas(ctx, 0);
	}

	private List<ArvoreSintaticaDto> listaBoasPraticas(RuleContext ctx, int indentation) {
		ArvoreSintaticaDto boasPraticas = new ArvoreSintaticaDto();
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

	private String validarBoasPraticas(List<ArvoreSintaticaDto> listaArvoreSintatica) {
		List<RegrasDto> retorno = regraPratica.getListaOrdenadaDeRegras().stream()
				.filter(x -> listaArvoreSintatica.stream()
						.filter(y -> y.getRegra().equalsIgnoreCase(x.getNomeRepresentativoRegra())).count() != 0)
				.collect(Collectors.toList());
		if (retorno.isEmpty()) {
			return "Comando não cumpriu as boas praticas";
		}
		return "Comando cumpriu as boas praticas";
	}
}
