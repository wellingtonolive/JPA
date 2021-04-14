package br.com.gestaoImoveis.operacoes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.gestaoImoveis.modelos.Usuario;

public class BuscaUsuarios {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proprietario");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "SELECT u from Usuario u  where u.ID = 10002";
		
		Query query = em.createQuery(jpql);
		
		List<Usuario> resultList = query.getResultList();
		
		for(Usuario usuario : resultList) {
			System.out.println("Usuário :" + usuario.getUser());
		}
	}

}
