package org.pimentel.digitalteacher.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
	
//	private static PessoaBeanDAO pessoaDaoInstance;
//
//	public static PessoaBeanDAO pessoaInstance() {
//		if (pessoaDaoInstance == null) {
//			pessoaDaoInstance = new PessoaBeanDAO();
//		}
//
//		return pessoaDaoInstance;
//	}
	
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
	
	private static TurmaDAO turmaDaoInstance;

	public static TurmaDAO turmaDaoInstance() {
		if (turmaDaoInstance == null) {
			turmaDaoInstance = new TurmaDAO();
		}

		return turmaDaoInstance;
	}
	
	private static AlunoDAO alunoDaoInstance;

	public static AlunoDAO alunoDaoInstance() {
		if (alunoDaoInstance == null) {
			alunoDaoInstance = new AlunoDAO();
		}

		return alunoDaoInstance;
	}
	
	

}
