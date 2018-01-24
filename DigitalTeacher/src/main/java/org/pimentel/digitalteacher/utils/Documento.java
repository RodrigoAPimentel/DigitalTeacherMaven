package org.pimentel.digitalteacher.utils;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.caelum.stella.bean.validation.CPF;
import br.com.caelum.stella.bean.validation.TituloEleitoral;

@Embeddable
public class Documento extends BaseBean implements Serializable{
	
	private static final long serialVersionUID = -419238069448572979L;
	
	@CPF
	@NotNull(message = "O CPF não pode ser nulo")
	@NotBlank(message = "O CPF não pode ser em branco")
	@Length(max = 11, message = "O campo não pode ter mais do que {max} caracteres")
	@Column(length = 12)
	private String cpf;
	@Column(length = 20)
	private String identidade;
	@Column(length = 20)
	private String identidadeOrgaoEmissor;
	private Boolean identidade2Via;
	
	@TituloEleitoral
	@Length(max = 12, message = "O campo não pode ter mais do que {max} caracteres")
	@Column(length = 13)
	private String tituloEleitor;
	
	@Column(length = 20)
	private String certificadoReservista;

	public Documento() {
	}
	
	public Documento(
			@NotNull(message = "O CPF não pode ser nulo") @NotBlank(message = "O CPF não pode ser em branco") @Length(max = 11, message = "O campo não pode ter mais do que {max} caracteres") String cpf,
			String identidade, String identidadeOrgaoEmissor, Boolean identidade2Via,
			@Length(max = 12, message = "O campo não pode ter mais do que {max} caracteres") String tituloEleitor,
			String certificadoReservista) {
		this.cpf = cpf.replaceAll("[^0-9]", "");
		this.identidade = identidade.replaceAll("[^0-9]", "");
		this.identidadeOrgaoEmissor = identidadeOrgaoEmissor;
		this.identidade2Via = identidade2Via;
		this.tituloEleitor = tituloEleitor.replaceAll("[^0-9]", "");
		this.certificadoReservista = certificadoReservista.replaceAll("[^0-9]", "");
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf.replaceAll("[^0-9]", "");
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade.replaceAll("[^0-9]", "");
	}

	public String getIdentidadeOrgaoEmissor() {
		return identidadeOrgaoEmissor;
	}

	public void setIdentidadeOrgaoEmissor(String identidadeOrgaoEmissor) {
		this.identidadeOrgaoEmissor = identidadeOrgaoEmissor;
	}

	public Boolean getIdentidade2Via() {
		return identidade2Via;
	}

	public void setIdentidade2Via(Boolean identidade2Via) {
		this.identidade2Via = identidade2Via;
	}

	public String getTituloEleitor() {
		return tituloEleitor;
	}

	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor.replaceAll("[^0-9]", "");
	}

	public String getCertificadoReservista() {
		return certificadoReservista;
	}

	public void setCertificadoReservista(String certificadoReservista) {
		this.certificadoReservista = certificadoReservista.replaceAll("[^0-9]", "");
	}	

}
