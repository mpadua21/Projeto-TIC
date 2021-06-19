package br.com.unifacef.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="avaliacoes_feedback")
public class Feedback_NPS implements Serializable{

	private static final long serialVersionUID = 2539411884256755515L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String pergunta;
	private String autor;
	private Date data;
	
	// 1 pergunta para varias avaliações/comentarios
	//cascadeType.ALL
	@OneToMany(cascade = CascadeType.ALL)
	//dentro do array haverá comentarios com chave estrangeira 
	//chamada id_post que está ligada no id do post
	@JoinColumn(name="id_post", referencedColumnName = "id")
	private List<Comentarios_Feedback> comentarios_feedback =  new ArrayList<>();

	public Feedback_NPS(String pergunta, String autor, Date data) {
		super();
		this.pergunta = pergunta;
		this.autor = autor;
		this.data = data;

	}
	
	

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public List<Comentarios_Feedback> getComentarios() {
		return comentarios_feedback;
	}

	public void setComentarios(List<Comentarios_Feedback> comentarios_feedback) {
		this.comentarios_feedback = comentarios_feedback;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
