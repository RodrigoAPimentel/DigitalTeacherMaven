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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import br.com.pimentel.digitalteacher.utils.BaseBean;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa extends BaseBean implements Serializable {
	
	private static final long serialVersionUID = -6890586650010394127L;
	
	@Id
	@NotNull(message = "O campo não pode ser nulo")
	@NotBlank(message = "O campo não pode ser em branco")
	@Length(max = 11, message = "O campo não pode ter mais do que {max} caracteres")
	private String cpf;
	private String nome;	
	
	private String identidade;
	private String identidadeOrgaoEmissor;
	private Boolean identidade2Via;
	
	private String enderecoRua;
	private String enderecoNr;
	private String enderecoBairro;
	private String enderecoCidade;
	private String enderecoEstado;
	private String enderecoComplemento;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	private String naturalidade;
	
	@Lob
	private byte[] foto;
	
	private String telefone;
	
	private String email;
	private char sexo;
	private String tipoSanguineo;	
	private String escolaridade;
	private String profissao;
	private Boolean status;
	private String filiacaoMae;
	private String filiacaoPai;
	private String estadoCivil;	
	private String outro;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String cpf, String identidade, String identidadeOrgaoEmissor, Boolean identidade2Via,
			String enderecoRua, String enderecoNr, String enderecoBairro, String enderecoCidade, String enderecoEstado,
			String enderecoComplemento, Date dataNascimento, String naturalidade, byte[] foto, String telefone,
			String email, char sexo, String tipoSanguineo, String escolaridade, String profissao, Boolean status,
			String filiacaoMae, String filiacaoPai, String estadoCivil, String outro) {
		super();
		this.cpf = cpf.replaceAll("[^0-9]", "");
		this.nome = nome;
		this.identidade = identidade.replaceAll("[^0-9]", "");
		this.identidadeOrgaoEmissor = identidadeOrgaoEmissor;
		this.identidade2Via = identidade2Via;
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
		return identidade.replaceAll("[^0-9]", "");
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
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
