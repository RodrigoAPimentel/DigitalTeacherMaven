package org.pimentel.digitalteacher.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Funcionario extends Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
		
	@NotNull(message = "A MATRICULA não pode ser nulo")
	@NotBlank(message = "A MATRICULA não pode ser em branco")
	@Length(max = 11, message = "O campo não pode ter mais do que {max} caracteres")
	@Column(length = 20, unique = true)
	private String matricula;
	@NotNull(message = "A FUNÇÃO não pode ser nulo")
	@NotBlank(message = "A FUNÇÃO não pode ser em branco")
	@Column(length = 35)
	private String funcao;
	@Column(length = 10)
	private Double salario;
	
	@NotNull(message = "A DATA DE ADIMISSÃO não pode ser nulo")
	@Temporal(TemporalType.DATE)
	private Date dataAdmissao;
	
	@Temporal(TemporalType.DATE)
	private Date dataDemisao;
	@Column(length = 20)
	private String alocacao;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public Funcionario() {
		super();
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Date getDataDemisao() {
		return dataDemisao;
	}

	public void setDataDemisao(Date dataDemisao) {
		this.dataDemisao = dataDemisao;
	}

	public String getAlocacao() {
		return alocacao;
	}

	public void setAlocacao(String alocacao) {
		this.alocacao = alocacao;
	}
}
