package edu.fema.managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class LivrosBean {

	private Livro novoLivro;
	private List<Livro> livros;

	public LivrosBean() {
		this.novoLivro = new Livro();
		this.livros = new ArrayList<>();
		this.livros.add(new Livro("Java e Orientação a Objetos", "Thiago Faria"));
		this.livros.add(new Livro("JPA 2 e Hibernate", "Thiago Faria"));
		this.livros.add(new Livro("JavaServer Faces", "Thiago Faria"));
		this.livros.add(new Livro("Test Driven Development", "Kent Beck"));
		this.livros.add(new Livro("Start Small, Stay Small", "Rob Walling"));
		this.livros.add(new Livro("Trabalhe 4 Horas Por Semana", "Timothy Ferris"));
		this.livros.add(new Livro("Getting Real", "Jason Fried"));
		this.livros.add(new Livro("Rework", "Jason Fried"));
	}

	public String adicionar() {
		this.livros.add(this.novoLivro);
		this.novoLivro = new Livro();
		return null;
	}

	public Livro getNovoLivro() {
		return novoLivro;
	}

	public void setNovoLivro(Livro novoLivro) {
		this.novoLivro = novoLivro;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

}
