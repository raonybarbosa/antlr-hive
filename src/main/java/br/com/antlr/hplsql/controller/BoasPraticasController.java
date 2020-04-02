package br.com.antlr.hplsql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.antlr.hplsql.dto.EntradaComandoDto;
import br.com.antlr.hplsql.service.BoasPraticasService;

@RestController
@RequestMapping("/boaspraticas")
public class BoasPraticasController {

	@Autowired
	private BoasPraticasService boasPraticasService;

	@PostMapping
	public String validaoBoasPraticas(@RequestBody EntradaComandoDto entrada) {
		return boasPraticasService.preencheEntrada(entrada);
	}

}
