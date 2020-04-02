package br.com.pyinkr.hplsql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pyinkr.hplsql.dto.BoasPraticasDto;
import br.com.pyinkr.hplsql.dto.EntradaComandoDto;
import br.com.pyinkr.hplsql.service.BoasPraticasService;

@RestController
@RequestMapping("/boaspraticas")
public class BoasPraticasController {

    @Autowired
    private BoasPraticasService boasPraticasService;

    @PostMapping
    public List<BoasPraticasDto> validaoBoasPraticas(@RequestBody EntradaComandoDto entrada) {
        return boasPraticasService.preencheEntrada(entrada);
    }

}
