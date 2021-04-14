package br.com.gestaoImoveis.modelos;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pessoas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	@OneToOne
	@JoinColumn(unique = true)
	private Usuario user;
	private String nome;
	private String cpf;
	private Date dtNascimento;
	@Enumerated(EnumType.STRING)
	private Genero genero;
	private String numTelefoneFixo;
	private String numCelular;
	@Enumerated(EnumType.STRING)
	private PerfilUsuario perfilUsuario;
	@OneToOne
	private Endereco endereco;

	public Pessoas(Usuario user, String nome, String cpf, Date dtNascimento, Genero genero, String numTelefoneFixo,
			String numCelular, PerfilUsuario perfilUsuario, Endereco endereco) {
		this.user = user;
		this.nome = nome;
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		this.genero = genero;
		this.numTelefoneFixo = numTelefoneFixo;
		this.numCelular = numCelular;
		this.perfilUsuario = perfilUsuario;
		this.endereco = endereco;
	}

	public void adicionaPessoa(EntityManager em, List<Pessoas> lista_pessoas) {
		if (!lista_pessoas.isEmpty()) {
			em.getTransaction().begin();
			for (Pessoas pessoa : lista_pessoas) {
				em.persist(pessoa);
			}
			em.getTransaction().commit();
			em.close();
		}
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getNumTelefoneFixo() {
		return numTelefoneFixo;
	}

	public void setNumTelefoneFixo(String numTelefoneFixo) {
		this.numTelefoneFixo = numTelefoneFixo;
	}

	public String getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}

	public PerfilUsuario getPerfilUsuario() {
		return perfilUsuario;
	}

	public void setPerfilUsuario(PerfilUsuario perfilUsuario) {
		this.perfilUsuario = perfilUsuario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
