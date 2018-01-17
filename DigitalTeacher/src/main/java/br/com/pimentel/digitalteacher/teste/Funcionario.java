package br.com.pimentel.digitalteacher.teste;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.pimentel.digitalteacher.models.Pessoa;

@Entity
public class Funcionario extends Pessoa {

	private static final long serialVersionUID = 1L;
	
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
//	@NotBlank(message = "A DATA DE ADIMISSÃO não pode ser em branco")
	@Temporal(TemporalType.DATE)
	private Date dataAdmissao;
	
	@Temporal(TemporalType.DATE)
	private Date dataDemisao;
	@Column(length = 20)
	private String alocacao;
	
	public Funcionario() {
		super();
	}

	public Funcionario(
			@NotNull(message = "A MATRICULA não pode ser nulo") @NotBlank(message = "A MATRICULA não pode ser em branco") @Length(max = 11, message = "O campo não pode ter mais do que {max} caracteres") String matricula,
			@NotNull(message = "A FUNÇÃO não pode ser nulo") @NotBlank(message = "A FUNÇÃO não pode ser em branco") String funcao,
			Double salario, @NotNull(message = "A DATA DE ADIMISSÃO não pode ser nulo") Date dataAdmissao,
			Date dataDemisao, String alocacao) {
		this.matricula = matricula;
		this.funcao = funcao;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.dataDemisao = dataDemisao;
		this.alocacao = alocacao;
	}
	
	public Funcionario(
			@NotNull(message = "A MATRICULA não pode ser nulo") @NotBlank(message = "A MATRICULA não pode ser em branco") @Length(max = 11, message = "O campo não pode ter mais do que {max} caracteres") String matricula,
			@NotNull(message = "A FUNÇÃO não pode ser nulo") @NotBlank(message = "A FUNÇÃO não pode ser em branco") String funcao,
			Double salario, @NotNull(message = "A DATA DE ADIMISSÃO não pode ser nulo") Date dataAdmissao,
			Date dataDemisao, String alocacao, Pessoa pessoa) {
		this.matricula = matricula;
		this.funcao = funcao;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.dataDemisao = dataDemisao;
		this.alocacao = alocacao;
		
		String nome, String cpf, String identidade, String identidadeOrgaoEmissor, Boolean identidade2Via,
		String cep, String enderecoRua, String enderecoNr, String enderecoBairro, String enderecoCidade, String enderecoEstado,
		String enderecoComplemento, Date dataNascimento, String naturalidade, byte[] foto, String telefone,
		String email, char sexo, String tipoSanguineo, String escolaridade, String profissao, Boolean status,
		String filiacaoMae, String filiacaoPai, String estadoCivil, String outro
		
		super.setNome(pessoa.getNome());
		super.setCpf(pessoa.getCpf());
		
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

	
	
}
