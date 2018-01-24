package org.pimentel.digitalteacher.teste;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.pimentel.digitalteacher.models.Professor;
import org.pimentel.digitalteacher.utils.BaseBean;

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
	
	@OneToMany
	private List<Aluno> alunos;
	
	@OneToMany
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
	
	
	
	
	
	
	
	
	
	
	
	
	

	public Turma() {
	}

}
