package br.com.gestaoImoveis.operacoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.gestaoImoveis.modelos.Usuario;

public class CriaProprietario {
	
	public static void main(String args[]) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proprietario");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = new Usuario("teste","senha","email");
		
		em.getTransaction().begin();
		em.persist(usuario);
		
		em.getTransaction().commit();
		
		
		
		
	}

}
