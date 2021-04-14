package br.com.gestaoImoveis.operacoes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.gestaoImoveis.modelos.Endereco;

public class AdicionaEndereco {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proprietario");
		EntityManager em = emf.createEntityManager();

		Endereco endereco = new Endereco("Rua Doutor Mário Scaff", "29", "Casa", "03945060", "São Paulo", "SP");
		Endereco endereco2 = new Endereco("Rua Maestro Isaias Savio", "71", "Casa 01", "03154875", "São Paulo", "SP");
		Endereco endereco3 = new Endereco("Rua Ministro Apolonio Salves", "864", "Casa 01", "036987841", "São Paulo", "SP");
		
		List<Endereco> listaEnderecos = new ArrayList<Endereco>();
		listaEnderecos.add(endereco);
		listaEnderecos.add(endereco2);
		listaEnderecos.add(endereco3);
		
		endereco.adicionaEndereco(em, listaEnderecos);
		

	}

}
