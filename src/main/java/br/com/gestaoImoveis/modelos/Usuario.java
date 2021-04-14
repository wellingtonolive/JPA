package br.com.gestaoImoveis.modelos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	private String nm_usuario;
	private String senha;
	private String email;

	public Usuario() {

	}

	public Usuario(String nm_usuario, String senha, String email) {
		this.nm_usuario = nm_usuario;
		this.senha = senha;
		this.email = email;
	}

	public Usuario(Long iD, String nm_usuario, String senha, String email) {
		ID = iD;
		this.nm_usuario = nm_usuario;
		this.senha = senha;
		this.email = email;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getUser() {
		return nm_usuario;
	}

	public void setUser(String nm_usuario) {
		this.nm_usuario = nm_usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void adicionandoUsuario(EntityManager em, List<Usuario> lista_usuario) {
		if (!lista_usuario.isEmpty()) {
			em.getTransaction().begin();
			for (Usuario usuario : lista_usuario) {
				em.persist(usuario);
			}
		}

		em.getTransaction().commit();
		em.close();
	}

}
