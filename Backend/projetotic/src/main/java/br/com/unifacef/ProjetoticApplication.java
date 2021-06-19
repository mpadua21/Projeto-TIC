package br.com.unifacef;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.unifacef.model.Comentarios_Feedback;
import br.com.unifacef.model.Feedback_NPS;
import br.com.unifacef.model.Pagamento_Cartao;
import br.com.unifacef.model.Usuario;
import br.com.unifacef.model.Pagamento_Boleto;
import br.com.unifacef.repositories.Feedback_NPSRepository;
import br.com.unifacef.repositories.Pagamento_BoletoRepository;
import br.com.unifacef.repositories.Pagamento_CartaoRepository;
import br.com.unifacef.repositories.UsuarioRepository;

@SpringBootApplication
public class ProjetoticApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProjetoticApplication.class, args);
	}

	@Autowired
	Feedback_NPSRepository injecao;
	
	@Autowired
	Pagamento_CartaoRepository injecaoCartao;
	
	@Autowired
	Pagamento_BoletoRepository injecaoBoleto;
	
	@Autowired 
	UsuarioRepository injecaoUsuario;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = sdf.parse("01/06/2021");
		// criamos o feedback_nps
		Feedback_NPS feedback_nps = new Feedback_NPS("Qual sua Avaliação sobre nosso Site?", "Equipe Health+", data);
		
		//criamos 3  comentarios_feedback
		
		
		Comentarios_Feedback comment1 = new Comentarios_Feedback("Gostei Muito", "Cliente1", "Nota 9", data);
		Comentarios_Feedback comment2 = new Comentarios_Feedback("OK", "Cliente2", "Nota 7", data);
		Comentarios_Feedback comment3 = new Comentarios_Feedback("Ruim", "Cliente3", "Nota 1", data);
		
		
		// associar  a pergunta as avaliações
		feedback_nps.getComentarios().add(comment1);
		feedback_nps.getComentarios().add(comment2);
		feedback_nps.getComentarios().add(comment3);
		
		injecao.save(feedback_nps);
		
		
		
		Pagamento_Cartao  pc1 = new Pagamento_Cartao(500, new Date(),"José Da Silva", "Visa");
		injecaoCartao.save(pc1);
		Pagamento_Cartao  pc2 = new Pagamento_Cartao(700, new Date(),"Matheus Da Silva", "Elo");
		injecaoCartao.save(pc2);
		Pagamento_Boleto  pb1 = new Pagamento_Boleto(1500, new Date(),"Lauani Da Silva", 100);
		injecaoBoleto.save(pb1);
	
		Usuario usu = new Usuario("matheuspolivera@gmail.com", "123senha", "TestedeLogin");
		injecaoUsuario.save(usu);
	}

}
