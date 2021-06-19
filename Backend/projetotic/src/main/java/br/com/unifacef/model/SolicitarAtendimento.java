package br.com.unifacef.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="atendimento")
public class SolicitarAtendimento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1608432397659072005L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;//ID do Atendimento
	private String hospitalpreferencia; // Hospital de Preferencia do usuario
	private String convenio; //Caso o Cliente possua Convênio
	private String usuario_email;
	private String urgencia;
	private String gravidade;
	private String comentario;
	
	
	
	public String getUrgencia() {
		return urgencia;	
	}
	public void setUrgencia(String urgencia) {
		this.urgencia = urgencia;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getGravidade() {
		return gravidade;
	}
	public void setGravidade(String gravidade) {
		this.gravidade = gravidade;
	}
	public String getUsuario_email() {
		return usuario_email;
	}
	public void setUsuario_email(String usuario_email) {
		this.usuario_email = usuario_email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHospitalpreferencia() {
		return hospitalpreferencia;
	}
	public void setHospitalpreferencia(String hospitalpreferencia) {
		this.hospitalpreferencia = hospitalpreferencia;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
