package edu.fema.financeiro.util;

import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class CriaTabelas {

	public static void main(String[] args) {
		// Criar as tabelas no banco de dados relacional

		try {
			Persistence.createEntityManagerFactory("FinanceiroPU");
			JOptionPane.showMessageDialog(null, "Tabelas criadas");
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro - " + ex.getMessage());
			;
		}

	}

}
