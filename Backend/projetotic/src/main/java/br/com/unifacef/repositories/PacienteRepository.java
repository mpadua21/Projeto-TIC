package br.com.unifacef.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.unifacef.model.Paciente;

//terá todos os métodos da classe JpaRepository
@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
	
	//teremos todos os métodos de banco de dados
	//save,findAll,remove,etc
	
	public Paciente findByEmail(String email);
	

}
