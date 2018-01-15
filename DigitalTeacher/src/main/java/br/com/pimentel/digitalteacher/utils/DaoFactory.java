package br.com.pimentel.digitalteacher.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.pimentel.digitalteacher.daos.FuncionarioDao;
import br.com.pimentel.digitalteacher.daos.PessoaDao;

public class DaoFactory {
	
	private DaoFactory() { }

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
	
	private static PessoaDao pessoaDaoInstance;

	public static PessoaDao pessoaInstance() {
		if (pessoaDaoInstance == null) {
			pessoaDaoInstance = new PessoaDao();
		}

		return pessoaDaoInstance;
	}
	
	private static FuncionarioDao funcionarioDaoInstance;

	public static FuncionarioDao funcionarioInstance() {
		if (funcionarioDaoInstance == null) {
			funcionarioDaoInstance = new FuncionarioDao();
		}

		return funcionarioDaoInstance;
	}

}
