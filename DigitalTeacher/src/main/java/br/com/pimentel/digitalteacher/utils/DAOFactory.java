package br.com.pimentel.digitalteacher.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.pimentel.digitalteacher.daos.FuncionarioDAO;
import br.com.pimentel.digitalteacher.daos.PessoaDAO;
import br.com.pimentel.digitalteacher.daos.ProfessorDAO;

public class DAOFactory {
	
	private DAOFactory() { }

	///////////////////////////////////////////////////////////////////
	// ENTITY MANAGER FACTORY
	///////////////////////////////////////////////////////////////////

	private static final String PERSISTENCE_UNIT_NAME = "DigitalTeacherPersistenceUnit";

	private static EntityManagerFactory entityManagerFactoryInstance;

	public static EntityManagerFactory entityManagerFactorInstance() {
		if (entityManagerFactoryInstance == null) {
			entityManagerFactoryInstance = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}

		return entityManagerFactoryInstance;
	}
	
	private static PessoaDAO pessoaDaoInstance;

	public static PessoaDAO pessoaInstance() {
		if (pessoaDaoInstance == null) {
			pessoaDaoInstance = new PessoaDAO();
		}

		return pessoaDaoInstance;
	}
	
	private static FuncionarioDAO funcionarioDaoInstance;

	public static FuncionarioDAO funcionarioInstance() {
		if (funcionarioDaoInstance == null) {
			funcionarioDaoInstance = new FuncionarioDAO();
		}

		return funcionarioDaoInstance;
	}
	
	private static ProfessorDAO professorDaoInstance;

	public static ProfessorDAO professorDaoInstance() {
		if (professorDaoInstance == null) {
			professorDaoInstance = new ProfessorDAO();
		}

		return professorDaoInstance;
	}

}
