package br.com.pimentel.digitalteacher.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Empresa {
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Integer id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pessoa_cpf")
	@Lob
	private Pessoa pessoa_cpf;
	private String razaoSocial;
	private String nomeFantasia;
	@Id
	private String cnpj;
	private String inscricaoEstadual;
	private String inscricaoMunicipal;
	
	@Temporal(TemporalType.DATE)
	private Date dataCriacao;
	
	private String enderecoRua;
	private String enderecoNr;
	private String enderecoBairro;
	private String enderecoCidade;
	private String enderecoEstado;
	private String enderecoComplemento;
	
	@Lob
	private byte[] logo;
	private String telefone;
	private String email;
	private String outro;
	private String contato;
	private Boolean status;
	
	public Empresa() {		
	}

	public Empresa(Integer id, Pessoa pessoa_cpf, String razaoSocial, String nomeFantasia, String cnpj,
			String inscricaoEstadual, String inscricaoMunicipal, Date dataCriacao, String enderecoRua,
			String enderecoNr, String enderecoBairro, String enderecoCidade, String enderecoEstado,
			String enderecoComplemento, byte[] logo, String telefone, String email, String outro, String contato,
			Boolean status) {
		super();
		this.id = id;
		this.pessoa_cpf = pessoa_cpf;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.inscricaoMunicipal = inscricaoMunicipal;
		this.dataCriacao = dataCriacao;
		this.enderecoRua = enderecoRua;
		this.enderecoNr = enderecoNr;
		this.enderecoBairro = enderecoBairro;
		this.enderecoCidade = enderecoCidade;
		this.enderecoEstado = enderecoEstado;
		this.enderecoComplemento = enderecoComplemento;
		this.logo = logo;
		this.telefone = telefone;
		this.email = email;
		this.outro = outro;
		this.contato = contato;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pessoa getPessoa_cpf() {
		return pessoa_cpf;
	}

	public void setPessoa_cpf(Pessoa pessoa_cpf) {
		this.pessoa_cpf = pessoa_cpf;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
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

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOutro() {
		return outro;
	}

	public void setOutro(String outro) {
		this.outro = outro;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}