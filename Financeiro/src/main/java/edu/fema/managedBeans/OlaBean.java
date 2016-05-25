package edu.fema.managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "ola")
public class OlaBean {

	private String nome;
	private String sobrenome;
	private String nomeCompleto;

	public String dizerOla() {
		this.nomeCompleto = this.nome.toUpperCase() + " " + this.sobrenome;
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

}
