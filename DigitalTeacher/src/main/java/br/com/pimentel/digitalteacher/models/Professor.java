package br.com.pimentel.digitalteacher.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Professor extends Funcionario implements Serializable{

	private static final long serialVersionUID = 3049864645251880989L;
	
	@Column(length = 5, unique = true)
	private Integer idProfessor;
	
	private String[] turmas;
	private String[] disciplinas;
	private Boolean dedicacaoExclusiva;
	
	public Professor() {
	}

	public Professor(String[] turmas, String[] disciplinas, Boolean dedicacaoExclusiva, Funcionario funcionario) {
		
		super(funcionario.getMatricula(), funcionario.getFuncao(), funcionario.getSalario(), funcionario.getDataAdmissao(), 
				funcionario.getDataDemisao(), funcionario.getAlocacao(), funcionario);
		
		this.turmas = turmas;
		this.disciplinas = disciplinas;
		this.dedicacaoExclusiva = dedicacaoExclusiva;
	}

	public Integer getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Integer idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String[] getTurmas() {
		return turmas;
	}

	public void setTurmas(String[] turmas) {
		this.turmas = turmas;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Boolean getDedicacaoExclusiva() {
		return dedicacaoExclusiva;
	}

	public void setDedicacaoExclusiva(Boolean dedicacaoExclusiva) {
		this.dedicacaoExclusiva = dedicacaoExclusiva;
	}
	
	
}
