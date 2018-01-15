package br.com.pimentel.digitalteacher.teste;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import br.com.pimentel.digitalteacher.models.Pessoa;

@Entity
public class Funcionario extends Pessoa {

	private static final long serialVersionUID = 1L;
		
	@NotNull(message = "O campo não pode ser nulo")
	@Column(length = 20)
	private String matricula;
	private String funcao;
	private Double salario;
	
	@Temporal(TemporalType.DATE)
	private Date dataAdmissao;
	
	@Temporal(TemporalType.DATE)
	private Date dataDemisao;
	private String alocacao;
	
	private Pessoa pessoa;
	
	public Funcionario() {
		
	}

	public Funcionario(String matricula, String funcao, Double salario, Date dataAdmissao, Date dataDemisao,
			String alocacao) {
		super();
		this.matricula = matricula;
		this.funcao = funcao;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.dataDemisao = dataDemisao;
		this.alocacao = alocacao;
	}

	public Funcionario(String matricula, String funcao, Double salario, Date dataAdmissao, Date dataDemisao,
			String alocacao, Pessoa pessoa) {
		super();
		this.matricula = matricula;
		this.funcao = funcao;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.dataDemisao = dataDemisao;
		this.alocacao = alocacao;
		this.pessoa = pessoa;
	}

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

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
