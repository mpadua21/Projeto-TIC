package br.com.unifacef.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.unifacef.model.Feedback_NPS;

@Repository
public interface Feedback_NPSRepository extends JpaRepository<Feedback_NPS, Long> {
	

}
