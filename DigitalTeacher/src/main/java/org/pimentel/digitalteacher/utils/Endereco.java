package org.pimentel.digitalteacher.utils;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.Length;

@Embeddable
public class Endereco extends BaseBean implements Serializable{
	
	private static final long serialVersionUID = 4999140494858284162L;
	
	@Length(max = 8, message = "O CEP não pode ter mais do que {max} caracteres")
	@Column(length = 9)
	private String cep;
	@Column(length = 70)
	private String rua;
	@Column(length = 10)
	private String numero;
	@Column(length = 20)
	private String bairro;
	@Column(length = 20)
	private String cidade;
	@Column(length = 20)
	private String estado;
	@Column(length = 30)
	private String complemento;
	@Column(length = 20)
	private String pais;

	@Length(max = 11, message = "O TELEFONE não pode ter mais do que {max} caracteres")
	@Column(length = 12)
	private String telefone1;
	
	@Length(max = 11, message = "O TELEFONE não pode ter mais do que {max} caracteres")
	@Column(length = 12)
	private String telefone2;
	
	@Length(max = 11, message = "O TELEFONE não pode ter mais do que {max} caracteres")
	@Column(length = 12)
	private String telefone3;

	@Email
	@Column(length = 30)
	private String email1;
	
	@Email
	@Column(length = 30)
	private String email2;
	
	@Column(length = 20)
	private String caixaPostal;

	public Endereco() {
	}

	public Endereco(@Length(max = 8, message = "O CEP não pode ter mais do que {max} caracteres") String cep,
			String rua, String numero, String bairro, String cidade, String estado, String complemento, String pais,
			@Length(max = 11, message = "O TELEFONE não pode ter mais do que {max} caracteres") String telefone1,
			@Length(max = 11, message = "O TELEFONE não pode ter mais do que {max} caracteres") String telefone2,
			@Length(max = 11, message = "O TELEFONE não pode ter mais do que {max} caracteres") String telefone3,
			@Email String email1, @Email String email2, String caixaPostal) {
		this.cep = cep.replaceAll("[^0-9]", "");
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.complemento = complemento;
		this.pais = pais;
		this.telefone1 = telefone1.replaceAll("[^0-9]", "");
		this.telefone2 = telefone2.replaceAll("[^0-9]", "");
		this.telefone3 = telefone3.replaceAll("[^0-9]", "");
		this.email1 = email1;
		this.email2 = email2;
		this.caixaPostal = caixaPostal;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep.replaceAll("[^0-9]", "");
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1.replaceAll("[^0-9]", "");
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2.replaceAll("[^0-9]", "");
	}

	public String getTelefone3() {
		return telefone3;
	}

	public void setTelefone3(String telefone3) {
		this.telefone3 = telefone3.replaceAll("[^0-9]", "");
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getCaixaPostal() {
		return caixaPostal;
	}

	public void setCaixaPostal(String caixaPostal) {
		this.caixaPostal = caixaPostal;
	}
	
}
