package org.pimentel.digitalteacher.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity	
public class Aluno extends Pessoa implements Serializable {

	private static final long serialVersionUID = 5394557366937910100L;
	
	@NotNull(message = "A MATRICULA não pode ser nulo")
	@NotBlank(message = "A MATRICULA não pode ser em branco")
	@Length(max = 11, message = "O campo não pode ter mais do que {max} caracteres")
	@Column(length = 20, unique = true)
	private String matricula;
	
	@NotNull(message = "A SERIE não pode ser nulo")
	@NotBlank(message = "A SERIE não pode ser em branco")
	@Length(max = 10, message = "A SERIE não pode ter mais do que {max} caracteres")
	@Column(length = 11)
	private String serie;
	
	@NotNull(message = "O TURNO não pode ser nulo")
	@NotBlank(message = "O TURNO não pode ser em branco")
	@Length(max = 10, message = "O TURNO não pode ter mais do que {max} caracteres")
	@Column(length = 11)
	private String turno;
	
	@NotNull(message = "A DATA DE MATRICULA não pode ser nulo")
	@Temporal(TemporalType.DATE)
	private Date dataMatricula;
	
	@Temporal(TemporalType.DATE)
	private Date dataDesligamento;
	
	private Boolean statusMatricula;
	
	@ManyToOne
	@JoinColumn(name= "turma_id")
	private Turma turma; 
	
	@ElementCollection
	private List<String> notas;

	public Aluno() {
		super();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public Date getDataDesligamento() {
		return dataDesligamento;
	}

	public void setDataDesligamento(Date dataDesligamento) {
		this.dataDesligamento = dataDesligamento;
	}

	public Boolean getStatusMatricula() {
		return statusMatricula;
	}

	public void setStatusMatricula(Boolean statusMatricula) {
		this.statusMatricula = statusMatricula;
	}

	public List<String> getNotas() {
		return notas;
	}

	public void setNotas(List<String> notas) {
		this.notas = notas;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
}
