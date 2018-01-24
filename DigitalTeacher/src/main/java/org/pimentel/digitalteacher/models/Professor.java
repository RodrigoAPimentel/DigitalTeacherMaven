package org.pimentel.digitalteacher.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Professor extends Funcionario implements Serializable{

	private static final long serialVersionUID = 3049864645251880989L;
	
	@Column(length = 5)
	private Integer idProfessor;
	
	@ElementCollection
	private List<String> turmas;
	@ElementCollection
	private List<String> disciplinas;
	private Boolean dedicacaoExclusiva;
	
	@Transient
	private Funcionario funcionario;
	
	public Professor() {
		super();
	}

	public Professor(Integer idProfessor, List<String> turmas, List<String> disciplinas, Boolean dedicacaoExclusiva,
			Funcionario funcionario) {
		
		super(funcionario.getMatricula(),funcionario.getFuncao(),funcionario.getSalario(),funcionario.getDataAdmissao(),
				funcionario.getDataDemisao(),funcionario.getAlocacao(),funcionario.getPessoa());
		
		this.idProfessor = idProfessor;
		this.turmas = turmas;
		this.disciplinas = disciplinas;
		this.dedicacaoExclusiva = dedicacaoExclusiva;
		this.funcionario = funcionario;
	}

	public Integer getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Integer idProfessor) {
		this.idProfessor = idProfessor;
	}

	public List<String> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<String> turmas) {
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

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
}
