package br.com.pimentel.digitalteacher.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Funcionario extends Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(length = 5, unique = true)
	private Integer idFuncionario;
	
	@NotNull(message = "A MATRICULA não pode ser nulo")
	@NotBlank(message = "A MATRICULA não pode ser em branco")
	@Length(max = 11, message = "O campo não pode ter mais do que {max} caracteres")
	@Column(length = 20, unique = true)
	private String matricula;
	@NotNull(message = "A FUNÇÃO não pode ser nulo")
	@NotBlank(message = "A FUNÇÃO não pode ser em branco")
	@Column(length = 15)
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
	
	@Transient
	private Pessoa pessoa;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String matricula, String funcao,	Double salario, Date dataAdmissao, Date dataDemisao, String alocacao, Pessoa pessoa) {
		
		super(null, pessoa.getNome(),pessoa.getDataNascimento(),pessoa.getNaturalidade(),pessoa.getFoto(),pessoa.getSexo(),pessoa.getTipoSanguineo(),
				pessoa.getEscolaridade(),pessoa.getProfissao(),pessoa.getStatus(),pessoa.getFiliacaoMae(),pessoa.getFiliacaoPai(),pessoa.getEstadoCivil(),
				pessoa.getOutro(), pessoa.getEndereco(), pessoa.getDocumentos());
		
		this.matricula = matricula;
		this.funcao = funcao;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.dataDemisao = dataDemisao;
		this.alocacao = alocacao;
		this.pessoa = pessoa;
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
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
