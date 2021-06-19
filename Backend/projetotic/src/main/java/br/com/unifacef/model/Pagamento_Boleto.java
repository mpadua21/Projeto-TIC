package br.com.unifacef.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Pagamento_Boleto")
public class Pagamento_Boleto extends Pagamento implements Serializable{

	private static final long serialVersionUID = -2253827608664620966L;
	
	private float desconto;
	
	public Pagamento_Boleto() {
		super();
	}
	
	public Pagamento_Boleto(float valor, Date data_pagamento, String autor_pagamento, float desconto) {
		
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
