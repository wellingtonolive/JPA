package br.com.gestaoImoveis.operacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.gestaoImoveis.modelos.Endereco;
import br.com.gestaoImoveis.modelos.Genero;
import br.com.gestaoImoveis.modelos.PerfilUsuario;
import br.com.gestaoImoveis.modelos.Pessoas;
import br.com.gestaoImoveis.modelos.Usuario;

public class AdicionaPessoa {

	public static void main(String[] args) throws ParseException {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proprietario");
		EntityManager em = emf.createEntityManager();

		List<Pessoas> lista_pessoas = new ArrayList<Pessoas>();

		SimpleDateFormat formataData = new SimpleDateFormat("dd/mm/yyyy");
		Date dataNascimento = formataData.parse("09/10/1999");

		Usuario usuario = new Usuario(10005L, "NomeTeste", "teste", "teste@gmail.com");

		Endereco endereco = new Endereco(3l, "Rua Teste Teste", "343", "Casa", "021548765", "São Paulo", "SP");

		Pessoas pessoa1 = new Pessoas(usuario, "Teste", "32564484654", dataNascimento, Genero.FEMININO,
				"4002-8922", "977186928", PerfilUsuario.PROPRIETARIO, endereco);

		lista_pessoas.add(pessoa1);
		pessoa1.adicionaPessoa(em, lista_pessoas);
	}

}
