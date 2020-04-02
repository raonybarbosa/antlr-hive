package br.com.pyinkr.hplsql.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegrasDto {

	private String nomeRepresentativoRegra;
	private int nivelVerticalOrdem;
	private boolean check = false;
}
