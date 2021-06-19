package br.com.unifacef.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacef.model.SolicitarAtendimento;
import br.com.unifacef.repositories.SolicitarAtendimentoRepository;

@RestController
public class SolicitarAtendimentoController {
	
	@Autowired
	SolicitarAtendimentoRepository injecao;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/atendimento")
	public List<SolicitarAtendimento> get(){
		return injecao.findAll();
		}
	@CrossOrigin(origins = "*")
	@PostMapping("/atendimento")
	public String add(@RequestBody SolicitarAtendimento solicitaratendimento) {
		injecao.save(solicitaratendimento);
		return "Atendimento Solicitado com sucesso";
	}
	@CrossOrigin(origins = "*")
	@DeleteMapping("/atendimento/{id}")
	public String remove(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Atendimento Removido com sucesso";
	}
	@CrossOrigin(origins = "*")
	@PutMapping("/atendimento")
	public String update(@RequestBody SolicitarAtendimento solicitaratendimento) {
		injecao.save(solicitaratendimento); // paciente virá como id
		return "Atendimento Atualizado com sucesso";
	}

}
