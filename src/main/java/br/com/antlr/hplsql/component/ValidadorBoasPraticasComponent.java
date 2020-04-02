package br.com.antlr.hplsql.component;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.antlr.hplsql.dto.BoasPraticasDto;
import br.com.antlr.hplsql.dto.RegraPraticaDto;

@Component
public class ValidadorBoasPraticasComponent {

	private RegraPraticaDto regraPratica = new RegraPraticaDto();

	public String validarBoasPraticas(List<BoasPraticasDto> listaParser) {
		boolean script = false;
		listaParser.forEach(x -> x.getRegra().equalsIgnoreCase(regraPratica.getTipoScript()));

		for (int i = 0; i < listaParser.size() - 1; i++) {
			if (regraPratica.getTipoScript().equalsIgnoreCase(listaParser.get(i).getRegra())) {

			}
		}

		return "Comando cumpriu as boas praticas";
	}
}
