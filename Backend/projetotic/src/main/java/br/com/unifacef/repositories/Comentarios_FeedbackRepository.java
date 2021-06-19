package br.com.unifacef.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.unifacef.model.Comentarios_Feedback;

@Repository
public interface Comentarios_FeedbackRepository extends JpaRepository<Comentarios_Feedback, Long> {

}
