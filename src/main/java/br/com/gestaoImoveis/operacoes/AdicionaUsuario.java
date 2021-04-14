package br.com.gestaoImoveis.operacoes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.gestaoImoveis.modelos.Usuario;

public class AdicionaUsuario {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proprietario");
		EntityManager em = emf.createEntityManager();

		List<Usuario> lista_usuario = new ArrayList<Usuario>();

		Usuario usuario = new Usuario("teste", "testeSenha", "teste@gmail.com");
		Usuario usuario2 = new Usuario("teste2", "testeSenha", "teste2@gmail.com");
		Usuario usuario3 = new Usuario("teste3", "testeSenha", "teste3@gmail.com");
		Usuario usuario4 = new Usuario("teste4", "testeSenha", "teste4@gmail.com");
		Usuario usuario5 = new Usuario("teste5", "testeSenha", "teste5@gmail.com");
		Usuario usuario6 = new Usuario("teste6", "testeSenha", "teste6@gmail.com");

		lista_usuario.add(usuario);
		lista_usuario.add(usuario2);
		lista_usuario.add(usuario3);
		lista_usuario.add(usuario4);
		lista_usuario.add(usuario5);
		lista_usuario.add(usuario6);

		usuario.adicionandoUsuario(em, lista_usuario);

	}

}
