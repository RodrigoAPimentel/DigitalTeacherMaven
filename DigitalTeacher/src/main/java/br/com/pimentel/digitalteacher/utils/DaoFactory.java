package br.com.pimentel.digitalteacher.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.pimentel.digitalteacher.daos.EmpresaDao;
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
			entityManagerFactoryInstance = Persistence.createEntityManagerFactory("DigitalTeacherPersistenceUnit");
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
	
//	private static EmpresaDao empresaDaoInstance;
//
//	public static EmpresaDao empresaInstance() {
//		if (empresaDaoInstance == null) {
//			empresaDaoInstance = new EmpresaDao();
//		}
//
//		return empresaDaoInstance;
//	}

//	///////////////////////////////////////////////////////////////////
//	// PRODUCT
//	///////////////////////////////////////////////////////////////////
//
//	private static ProductDao productDaoInstance;
//
//	public static ProductDao productInstance() {
//		if (productDaoInstance == null) {
//			productDaoInstance = new ProductDao();
//		}
//
//		return productDaoInstance;
//	}
//
//	///////////////////////////////////////////////////////////////////
//	// ORDER
//	///////////////////////////////////////////////////////////////////
//
//	private static OrderDao orderDaoInstance;
//
//	public static OrderDao orderInstance() {
//		if (orderDaoInstance == null) {
//			orderDaoInstance = new OrderDao();
//		}
//
//		return orderDaoInstance;
//	}
//
//	///////////////////////////////////////////////////////////////////
//	// ORDER DETAIL
//	///////////////////////////////////////////////////////////////////
//
//	private static OrderDetailDao orderDetailDaoInstance;
//
//	public static OrderDetailDao orderDetailInstance() {
//		if (orderDetailDaoInstance == null) {
//			orderDetailDaoInstance = new OrderDetailDao();
//		}
//
//		return orderDetailDaoInstance;
//	}

}
