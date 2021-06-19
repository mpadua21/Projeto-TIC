package br.com.unifacef.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

//Classe Pai é abstrata -- esta tabela não será criada
@Entity
@Table(name="pagamento")
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public abstract class Pagamento implements Serializable{

	private static final long serialVersionUID = 7903177725891040309L;
	
	@Id
	//o table vai criar um ID que servirá para as tabelas filhas
	//Mesma sequencia para todas as tabelas filhas
	@GeneratedValue(strategy= GenerationType.TABLE)
	protected Long id;
	protected float valor;
	protected Date data_pagamento;
	protected String autor_pagamento;
	
	public Pagamento() {
		
	}
	public Pagamento(float valor, Date data_pagamento, String autor_pagamento) {
		this.valor = valor;
		this.data_pagamento = data_pagamento;
		this.autor_pagamento = autor_pagamento;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getData_pagamento() {
		return data_pagamento;
	}
	public void setData_pagamento(Date data_pagamento) {
		this.data_pagamento = data_pagamento;
	}
	public String getAutor_pagamento() {
		return autor_pagamento;
	}
	public void setAutor_pagamento(String autor_pagamento) {
		this.autor_pagamento = autor_pagamento;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
