package br.com.unifacef.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacef.model.Usuario;
import br.com.unifacef.repositories.UsuarioRepository;

@RestController
public class UsuarioController {

	@Autowired
	UsuarioRepository injecao;
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@GetMapping("/usuario/email/{email}")
	public Usuario getByEmail(@PathVariable String email) {
		return injecao.findByEmail(email);
	}
	
}
