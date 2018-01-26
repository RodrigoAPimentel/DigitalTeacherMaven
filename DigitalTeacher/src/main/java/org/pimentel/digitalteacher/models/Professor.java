package org.pimentel.digitalteacher.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import org.pimentel.digitalteacher.teste.Turma;

@Entity
public class Professor extends Funcionario implements Serializable{

	private static final long serialVersionUID = 3049864645251880989L;
	
	@ManyToMany(mappedBy = "professores")
	private List<Turma> turmas;
	@ElementCollection
	private List<String> disciplinas;
	private Boolean dedicacaoExclusiva;
	
	@Transient
	private Funcionario funcionario;
	
	public Professor() {
		super();
	}

	public Professor(List<Turma> turmas, List<String> disciplinas, Boolean dedicacaoExclusiva,	Funcionario funcionario) {
		
		super(funcionario.getMatricula(),funcionario.getFuncao(),funcionario.getSalario(),funcionario.getDataAdmissao(),
				funcionario.getDataDemisao(),funcionario.getAlocacao(),funcionario.getPessoa());
		
		this.turmas = turmas;
		this.disciplinas = disciplinas;
		this.dedicacaoExclusiva = dedicacaoExclusiva;
		this.funcionario = funcionario;
	}

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

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
}
