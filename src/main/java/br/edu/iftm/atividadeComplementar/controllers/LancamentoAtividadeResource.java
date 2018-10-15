package br.edu.iftm.atividadeComplementar.controllers;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.atividadeComplementar.domains.LancamentoAtividade;
import br.edu.iftm.atividadeComplementar.services.LancamentoAtividadeService;

@RestController
@RequestMapping(value="/lancAtividades")
public class LancamentoAtividadeResource {
	
	private LancamentoAtividadeService service;
	
	@RequestMapping(value="{codigoLancamento}",method=RequestMethod.GET)
	public ResponseEntity<?> findByCodigo(@PathVariable Integer codigo) {
		Optional<LancamentoAtividade> lancAtividade = service.buscarCodigo(codigo);
		return ResponseEntity.ok().body(lancAtividade);
	}

}
