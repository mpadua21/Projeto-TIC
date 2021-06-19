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

import br.com.unifacef.model.Paciente;
import br.com.unifacef.repositories.PacienteRepository;

@RestController
public class PacienteController {
	//injeção de dependencia
	@Autowired //permite utilizar os métodos da classe sem instancia-la
	PacienteRepository injecao;
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@GetMapping("/paciente")
	public List<Paciente> get(){
		return injecao.findAll();
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@GetMapping("/paciente/email/{email}")
	public String getByEmail(@PathVariable String email){
		Paciente paciente =  injecao.findByEmail(email);
		if(paciente == null) {
			return null;
		}
		else{
			return paciente.getSenha();
		}
		
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@PostMapping("/paciente")
	public String add(@RequestBody Paciente paciente) {
		injecao.save(paciente);
		return "Inserção com sucesso";
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@DeleteMapping("/paciente/{id}")
	public String remove(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Remoção com sucesso";
	}
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@PutMapping("/paciente")
	public String update(@RequestBody Paciente paciente) {
		injecao.save(paciente); // paciente virá como id
		return "Atualizado com sucesso";
	}
	
	

}
