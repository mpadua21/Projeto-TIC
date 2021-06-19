package br.com.unifacef.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifacef.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	
	public Usuario findByEmail(String email);
}
