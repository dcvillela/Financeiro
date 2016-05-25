package edu.fema.financeiro.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import edu.fema.financeiro.model.Pessoa;

public class BuscaPessoa {

	public static void main(String[] args) {
		// Teste para recuperar do banco de dados uma pessoa
		
		Pessoa p1;
		// Recuperar pessoa
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FinanceiroPU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			p1 = em.find(Pessoa.class, Long.parseLong("2"));
			tx.commit();
			JOptionPane.showMessageDialog(null, "id = " + p1.getId() +
					"\nPessoa = " + p1.getNome());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro 1: " + ex.getMessage());
		} finally {
			em.close();
			emf.close();
		}

	}

}
