package br.com.gestaoImoveis.operacoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteCriaTabelas {

	public static void main(String args[]) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proprietario");
		EntityManager creatEntityManager = emf.createEntityManager();
		emf.close();
	}

}
