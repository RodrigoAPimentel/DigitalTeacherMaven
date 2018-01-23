package br.com.pimentel.digitalteacher.utils;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

public abstract class GenericDAO<T, PK> {

	protected final EntityManager entityManager;

	private final EntityManagerFactory factory;

	private Class<?> clazz;

	///////////////////////////////////////////////////////////////////
	// CONSTRUCTOR
	///////////////////////////////////////////////////////////////////

	public GenericDAO() {
		this(DaoFactory.entityManagerFactorInstance());
	}

	public GenericDAO(EntityManagerFactory factory) {
		this.factory = factory;
		this.entityManager = factory.createEntityManager();
		this.clazz = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	///////////////////////////////////////////////////////////////////
	// CRUD Methods
	///////////////////////////////////////////////////////////////////

	public Object executeQuery(String query, Object... params) {
		Query createdQuery = this.entityManager.createQuery(query);
		
		for (int i = 0; i < params.length; i++) {
			createdQuery.setParameter(i, params[i]);
		}

		return createdQuery.getResultList();
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return this.entityManager.createQuery(("FROM " + this.clazz.getName())).getResultList();
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@SuppressWarnings("unchecked")
	public T findById(PK pk) {
			return (T) this.entityManager.find(this.clazz, pk);				
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void save(T entity) {
		try {
			this.beginTransaction();
			
			Validator validador = Validation.buildDefaultValidatorFactory().getValidator();
			Set<ConstraintViolation<T>> erros = validador.validate(entity);
			if (erros.size() > 0) {
				for (ConstraintViolation<T> constraintViolation : erros) {
					System.out.println("Erro: " + constraintViolation.getMessage());
				}
			}else {
				this.entityManager.persist(entity);				
			}
			
			this.commit();
		} catch (Exception e) {
			this.rollBack();
			throw e;
		}
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void update(T entity) {
		try {
			this.beginTransaction();
			
			Validator validador = Validation.buildDefaultValidatorFactory().getValidator();
			Set<ConstraintViolation<T>> erros = validador.validate(entity);
			if (erros.size() > 0) {
				for (ConstraintViolation<T> constraintViolation : erros) {
					System.out.println("Erro: " + constraintViolation.getMessage());
				}
			}else {
				this.entityManager.merge(entity);				
			}			
			
			this.commit();
		} catch (Exception e) {
			this.rollBack();
			throw e;
		}
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void delete(T entity) {
		try {
			this.beginTransaction();
			this.entityManager.remove(entity);
			this.commit();
		} catch (Exception e) {
			this.rollBack();
			throw e;
		}
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void deleteForPK(PK pk) {
		try {
			this.beginTransaction();
			this.entityManager.remove(this.entityManager.find(this.clazz, pk));
			this.commit();
		} catch (Exception e) {
			this.rollBack();
			throw e;
		}
	}

	///////////////////////////////////////////////////////////////////
	// Transaction Methods
	///////////////////////////////////////////////////////////////////

	public void beginTransaction(){
		this.entityManager.getTransaction().begin();
	}

	public void commit(){
		this.entityManager.getTransaction().commit();
	}

	public void close(){
		this.entityManager.close();
		this.factory.close();
	}

	public void rollBack(){
		this.entityManager.getTransaction().rollback();
	}

	public EntityManager getEntityManager(){
		return this.entityManager;
	}

}
