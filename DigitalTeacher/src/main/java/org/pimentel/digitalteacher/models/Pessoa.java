package org.pimentel.digitalteacher.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.pimentel.digitalteacher.utils.BaseBean;
import org.pimentel.digitalteacher.utils.Documento;
import org.pimentel.digitalteacher.utils.Endereco;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa extends BaseBean implements Serializable {

	private static final long serialVersionUID = -6890586650010394127L;

	@Id
	@TableGenerator(name = "PESSOA_GER_SEQ", table = "GER_SEQ_IDPESSOA", pkColumnName = "GER_NOME", valueColumnName = "GER_VALOR", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PESSOA_GER_SEQ")
	@Column(length = 5, unique = true)
	private Integer idPessoa;
		
	@NotNull(message = "O NOME não pode ser nulo")
	@NotBlank(message = "O NOME não pode ser em branco")
	@Length(max = 70, message = "O NOME não pode ter mais do que {max} caracteres")
	@Column(length = 71)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@Column(length = 20)
	private String naturalidade;

	@Lob
	private byte[] foto;
	
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
	
	@Embedded
	@ElementCollection
	private List<Endereco> endereco;
	
	@Embedded
	private Documento documentos;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public Pessoa() {
		super();
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	public Documento getDocumentos() {
		return documentos;
	}

	public void setDocumentos(Documento documentos) {
		this.documentos = documentos;
	}
	
}
