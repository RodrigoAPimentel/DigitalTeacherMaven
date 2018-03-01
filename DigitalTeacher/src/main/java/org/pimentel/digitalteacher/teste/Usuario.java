package org.pimentel.digitalteacher.teste;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.pimentel.digitalteacher.model.Pessoa;

@Entity
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = -6669775507125437015L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 5, unique = true)
	private Integer id;
	@NotNull(message = "O LOGIN não pode ser nulo")
	@NotBlank(message = "O LOGIN não pode ser em branco")
	@Length(max = 20, message = "O LOGIN não pode ter mais do que {max} caracteres")
	@Column(length = 21)
	private String login;
	@NotNull(message = "A SENHA não pode ser nula")
	@NotBlank(message = "A SENHA não pode ser em branco")
	@Length(max = 20, message = "A SENHA não pode ter mais do que {max} caracteres")
	@Column(length = 21)
	private String senha;
	private Integer nivelAcesso;
	private String grupoAcesso;
	
	@OneToOne(optional = true, orphanRemoval = true)
	private Pessoa pessoa;
	
	private boolean status;
	
	public Usuario() {
		super();
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(Integer nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	public String getGrupoAcesso() {
		return grupoAcesso;
	}

	public void setGrupoAcesso(String grupoAcesso) {
		this.grupoAcesso = grupoAcesso;
	}

	public Integer getId() {
		return id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
