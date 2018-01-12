package br.com.pimentel.digitalteacher.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Funcionario extends Pessoa {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String matricula;
	private String funcao;
	private Double salario;
	
	@Temporal(TemporalType.DATE)
	private Date dataAdmissao;
	
	@Temporal(TemporalType.DATE)
	private Date dataDemisao;
	private String alocacao;
	
	private String fkFuncionario;
}
