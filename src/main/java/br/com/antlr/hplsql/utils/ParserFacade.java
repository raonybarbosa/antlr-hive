package br.com.antlr.hplsql.utils;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import br.com.antlr.hplsql.antlr.HplsqlLexer;
import br.com.antlr.hplsql.antlr.HplsqlParser;

public class ParserFacade {

	public ParserRuleContext parse(String conteudo) {
		HplsqlLexer lexer = new HplsqlLexer(new ANTLRInputStream(conteudo));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		HplsqlParser parser = new HplsqlParser(tokens);
		return parser.program();
		// return parser.alter_table_stmt();
	}
}
