package edu.fema.financeiro.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class TestaConexao {

	public static void main(String[] args) {
		// Teste de conexão
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("FinanceiroPU");
			em = emf.createEntityManager();
			JOptionPane.showMessageDialog(null, "Conexão bem sucedida!\nBanco de dados relacional MySQL Server version: 5.7.11 (Ubuntu)\nSchema Financeiro");
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro 1: " + ex.getMessage());
		} finally {
			em.close();
			emf.close();
		}

	}

}
