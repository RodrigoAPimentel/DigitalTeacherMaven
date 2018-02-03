package org.pimentel.digitalteacher.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.pimentel.digitalteacher.daos.FuncionarioBeanDAO;
import org.pimentel.digitalteacher.daos.ProfessorBeanDAO;

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
	
	private static FuncionarioBeanDAO funcionarioDaoInstance;

	public static FuncionarioBeanDAO funcionarioInstance() {
		if (funcionarioDaoInstance == null) {
			funcionarioDaoInstance = new FuncionarioBeanDAO();
		}

		return funcionarioDaoInstance;
	}
	
	private static ProfessorBeanDAO professorDaoInstance;

	public static ProfessorBeanDAO professorDaoInstance() {
		if (professorDaoInstance == null) {
			professorDaoInstance = new ProfessorBeanDAO();
		}

		return professorDaoInstance;
	}

}
