package br.com.pimentel.digitalteacher.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.caelum.stella.bean.validation.CPF;
import br.com.pimentel.digitalteacher.utils.BaseBean;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa extends BaseBean implements Serializable {

	private static final long serialVersionUID = -6890586650010394127L;

	@Column(length = 5, unique = true)
	private Integer idPessoa;
	
	@Id
	@CPF
	@NotNull(message = "O CPF não pode ser nulo")
	@NotBlank(message = "O CPF não pode ser em branco")
	@Length(max = 11, message = "O campo não pode ter mais do que {max} caracteres")
	@Column(length = 12)
	private String cpf;
	
	@NotNull(message = "O NOME não pode ser nulo")
	@NotBlank(message = "O NOME não pode ser em branco")
	@Length(max = 70, message = "O NOME não pode ter mais do que {max} caracteres")
	@Column(length = 71)
	private String nome;	

	@Column(length = 20, unique = true)
	private String identidade;
	@Column(length = 20)
	private String identidadeOrgaoEmissor;
	private Boolean identidade2Via;

	@Length(max = 8, message = "O CEP não pode ter mais do que {max} caracteres")
	@Column(length = 9)
	private String cep;
	@Column(length = 70)
	private String enderecoRua;
	@Column(length = 10)
	private String enderecoNr;
	@Column(length = 20)
	private String enderecoBairro;
	@Column(length = 20)
	private String enderecoCidade;
	@Column(length = 20)
	private String enderecoEstado;
	@Column(length = 30)
	private String enderecoComplemento;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	@Column(length = 20)
	private String naturalidade;

	@Lob
	private byte[] foto;

	@Length(max = 11, message = "O TELEFONE não pode ter mais do que {max} caracteres")
	@Column(length = 12)
	private String telefone;

	@Email
	@Column(length = 30)
	private String email;
	private char sexo;
	@Column(length = 3)
	private String tipoSanguineo;	
	@Column(length = 20)
	private String escolaridade;
	@Column(length = 20)
	private String profissao;
	private Boolean status;
	@Column(length = 70)
	private String filiacaoMae;
	@Column(length = 70)
	private String filiacaoPai;
	@Column(length = 15)
	private String estadoCivil;	
	@Column(length = 255)
	private String outro;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String cpf, String identidade, String identidadeOrgaoEmissor, Boolean identidade2Via,
			String cep, String enderecoRua, String enderecoNr, String enderecoBairro, String enderecoCidade, String enderecoEstado,
			String enderecoComplemento, Date dataNascimento, String naturalidade, byte[] foto, String telefone,
			String email, char sexo, String tipoSanguineo, String escolaridade, String profissao, Boolean status,
			String filiacaoMae, String filiacaoPai, String estadoCivil, String outro) {
		super();
		this.cpf = cpf.replaceAll("[^0-9]", "");
		this.nome = nome;
		this.identidade = identidade.replaceAll("[^0-9]", "");
		this.identidadeOrgaoEmissor = identidadeOrgaoEmissor;
		this.identidade2Via = identidade2Via;
		this.cep = cep.replaceAll("[^0-9]", "");
		this.enderecoRua = enderecoRua;
		this.enderecoNr = enderecoNr;
		this.enderecoBairro = enderecoBairro;
		this.enderecoCidade = enderecoCidade;
		this.enderecoEstado = enderecoEstado;
		this.enderecoComplemento = enderecoComplemento;
		this.dataNascimento = dataNascimento;
		this.naturalidade = naturalidade;
		this.foto = foto;
		this.telefone = telefone.replaceAll("[^0-9]", "");
		this.email = email;
		this.sexo = sexo;
		this.tipoSanguineo = tipoSanguineo;
		this.escolaridade = escolaridade;
		this.profissao = profissao;
		this.status = status;
		this.filiacaoMae = filiacaoMae;
		this.filiacaoPai = filiacaoPai;
		this.estadoCivil = estadoCivil;
		this.outro = outro;
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {		
		this.cpf = cpf.replaceAll("[^0-9]", "");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep.replaceAll("[^0-9]", "");
	}

	public String getEnderecoRua() {
		return enderecoRua;
	}

	public void setEnderecoRua(String enderecoRua) {
		this.enderecoRua = enderecoRua;
	}

	public String getEnderecoNr() {
		return enderecoNr;
	}

	public void setEnderecoNr(String enderecoNr) {
		this.enderecoNr = enderecoNr;
	}

	public String getEnderecoBairro() {
		return enderecoBairro;
	}

	public void setEnderecoBairro(String enderecoBairro) {
		this.enderecoBairro = enderecoBairro;
	}

	public String getEnderecoCidade() {
		return enderecoCidade;
	}

	public void setEnderecoCidade(String enderecoCidade) {
		this.enderecoCidade = enderecoCidade;
	}

	public String getEnderecoEstado() {
		return enderecoEstado;
	}

	public void setEnderecoEstado(String enderecoEstado) {
		this.enderecoEstado = enderecoEstado;
	}

	public String getEnderecoComplemento() {
		return enderecoComplemento;
	}

	public void setEnderecoComplemento(String enderecoComplemento) {
		this.enderecoComplemento = enderecoComplemento;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone.replaceAll("[^0-9]", "");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getFiliacaoMae() {
		return filiacaoMae;
	}

	public void setFiliacaoMae(String filiacaoMae) {
		this.filiacaoMae = filiacaoMae;
	}

	public String getFiliacaoPai() {
		return filiacaoPai;
	}

	public void setFiliacaoPai(String filiacaoPai) {
		this.filiacaoPai = filiacaoPai;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getOutro() {
		return outro;
	}

	public void setOutro(String outro) {
		this.outro = outro;
	}

}
