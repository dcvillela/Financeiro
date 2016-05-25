package edu.fema.managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TarefaBean {
	
	private String nomeUsuario;
	private String qtdeTarefasPendentes;
	
	public TarefaBean() {
		super();
		this.nomeUsuario = "Domingos";
		this.qtdeTarefasPendentes = "14";
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getQtdeTarefasPendentes() {
		return qtdeTarefasPendentes;
	}

	public void setQtdeTarefasPendentes(String qtdeTarefasPendentes) {
		this.qtdeTarefasPendentes = qtdeTarefasPendentes;
	}

}
