package edu.fema.managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastroTorcedorBean {

	private String timeFavorito;
	private String[] timesFavoritos;
	private boolean termoAceito;
	private Integer[] assuntosInteresse;
	
	public String teste() {
		System.out.println(this.timeFavorito);
		System.out.println(this.timesFavoritos.length);
		
		if (this.termoAceito) {
			System.out.println("Termo aceito");
		} else {
			System.out.println("Termo rejeitado");
		}
		return null;
	}

	public String getTimeFavorito() {
		return timeFavorito;
	}

	public void setTimeFavorito(String timeFavorito) {
		this.timeFavorito = timeFavorito;
	}

	public String[] getTimesFavoritos() {
		return timesFavoritos;
	}

	public void setTimesFavoritos(String[] timesFavoritos) {
		this.timesFavoritos = timesFavoritos;
	}

	public boolean isTermoAceito() {
		return termoAceito;
	}

	public void setTermoAceito(boolean termoAceito) {
		this.termoAceito = termoAceito;
	}

	public Integer[] getAssuntosInteresse() {
		return assuntosInteresse;
	}

	public void setAssuntosInteresse(Integer[] assuntosInteresse) {
		this.assuntosInteresse = assuntosInteresse;
	}

}
