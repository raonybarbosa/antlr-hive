package br.com.antlr.hplsql.dto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegraPraticaDto {

	private List<RegrasDto> listaOrdenadaDeRegras;

	public RegraPraticaDto() {
		listaOrdenadaDeRegras = new ArrayList();
		RegrasDto regras1 = new RegrasDto();
		regras1.setNomeRepresentativoRegra("create_table");
		regras1.setNivelVerticalOrdem(0);
		RegrasDto regras2 = new RegrasDto();
		regras2.setNomeRepresentativoRegra("column_def_table_constraints");
		regras2.setNivelVerticalOrdem(1);
		RegrasDto regras3 = new RegrasDto();
		regras3.setNomeRepresentativoRegra("column_def_table_constraint");
		regras3.setNivelVerticalOrdem(2);
		RegrasDto regras4 = new RegrasDto();
		regras4.setNomeRepresentativoRegra("column_definition");
		regras4.setNivelVerticalOrdem(3);
		RegrasDto regras5 = new RegrasDto();
		regras5.setNomeRepresentativoRegra("null_notnull");
		regras5.setNivelVerticalOrdem(4);

		listaOrdenadaDeRegras.add(regras1);
		listaOrdenadaDeRegras.add(regras2);
		listaOrdenadaDeRegras.add(regras3);
		listaOrdenadaDeRegras.add(regras4);
		listaOrdenadaDeRegras.add(regras5);
		listaOrdenadaDeRegras = listaOrdenadaDeRegras.stream()
				.sorted(Comparator.comparing(RegrasDto::getNivelVerticalOrdem)).collect(Collectors.toList());
	}
}
