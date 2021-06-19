package br.com.unifacef.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.unifacef.model.SolicitarAtendimento;
@Repository
public interface SolicitarAtendimentoRepository extends JpaRepository<SolicitarAtendimento, Long> {

}
