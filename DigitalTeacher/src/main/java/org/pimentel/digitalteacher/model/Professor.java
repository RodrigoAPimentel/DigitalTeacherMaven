package org.pimentel.digitalteacher.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Professor extends Funcionario implements Serializable{

	private static final long serialVersionUID = 3049864645251880989L;
	
	@ManyToMany(mappedBy = "professores")
	private List<Turma> turmas;
	
	@ElementCollection
	private List<String> disciplinas;
	
	private Boolean dedicacaoExclusiva;
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public Professor() {
		super();
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	public List<String> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<String> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Boolean getDedicacaoExclusiva() {
		return dedicacaoExclusiva;
	}

	public void setDedicacaoExclusiva(Boolean dedicacaoExclusiva) {
		this.dedicacaoExclusiva = dedicacaoExclusiva;
	}
}
