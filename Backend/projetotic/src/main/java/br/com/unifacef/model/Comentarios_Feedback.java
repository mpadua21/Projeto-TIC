package br.com.unifacef.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comentarios_feedback")
public class Comentarios_Feedback implements Serializable{
	private static final long serialVersionUID = -6843979527482454806L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String texto;
	private String autor;
	private String nota;
	private Date data_comentario;
	
	
	
	
	public Comentarios_Feedback(String texto, String autor, String nota, Date data_comentario) {
		super();

		this.texto = texto;
		this.autor = autor;
		this.data_comentario = data_comentario;
	}
	
	
	public Date getData_comentario() {
		return data_comentario;
	}


	public void setData_comentario(Date data_comentario) {
		this.data_comentario = data_comentario;
	}


	public String getNota() {
		return nota;
	}


	public void setNota(String nota) {
		this.nota = nota;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
