package org.pimentel.digitalteacher.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.pimentel.digitalteacher.model.Professor;
import org.pimentel.digitalteacher.util.BaseBean;

@Entity
public class Turma extends BaseBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 5)
	private Integer idTurma;

	@NotNull(message = "O NOME DA TURMA não pode ser nulo")
	@NotBlank(message = "O NOME DA TURMA não pode ser em branco")
	@Length(max = 20, message = "O NOME DA TURMA não pode ter mais do que {max} caracteres")
	@Column(length = 21)
	private String nomeTurma;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy= "turma")
	private List<Aluno> alunos;
	
	@ManyToMany
	@JoinTable(name = "turma_professor", 
				joinColumns = @JoinColumn(name = "turma_id"), 
				inverseJoinColumns = @JoinColumn(name = "professor_id"))
	private List<Professor> professores;
	
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
	
	@NotNull(message = "A SALA não pode ser nulo")
	@NotBlank(message = "A SALA não pode ser em branco")
	@Length(max = 10, message = "A SALA não pode ter mais do que {max} caracteres")
	@Column(length = 11)
	private String sala;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public Turma() {
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public Integer getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(Integer idTurma) {
		this.idTurma = idTurma;
	}

	public String getNomeTurma() {
		return nomeTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
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

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}
	
}
