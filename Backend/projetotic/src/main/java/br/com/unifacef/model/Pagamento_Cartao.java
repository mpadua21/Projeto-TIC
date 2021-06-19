package br.com.unifacef.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Pagamento_Cartao")
public class Pagamento_Cartao extends Pagamento implements Serializable{
	
	private static final long serialVersionUID = 6518302687439917470L;
	
	private String bandeira;
	
	public Pagamento_Cartao() {
		super();
	}
	public Pagamento_Cartao(float valor, Date data_pagamento, String autor_pagamento, String bandeira) {
		super(valor, data_pagamento, autor_pagamento);
		this.bandeira = bandeira;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
