package br.com.unifacef.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paciente")
public class Paciente implements Serializable{
	
	private static final long serialVersionUID = -284253751188183642L;
	
	@Id//Identifica a Chave da Tabela
	@GeneratedValue(strategy=GenerationType.IDENTITY)//AutoIncremento
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private String cpf;
	private String rg;
	private String endereco;
	
	public Paciente() {
		
	}
	

	public Paciente(Long id, String nome, String email, String senha, String cpf, String rg, String endereco) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}
