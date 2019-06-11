package com.bamainick.persistence.jpa.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bemainick.util.JPAUtil;



public abstract class GenericoJPA implements Serializable{
	
	private static final Logger LOG = LoggerFactory.getLogger(GenericoJPA.class);
	
	private static final long serialVersionUID = 1L;
	protected EntityManager em;

	public void createEM() {
		
				
		em = JPAUtil.getEmf().createEntityManager();
		LOG.info("Se captura el entityManager.xml");
	}

	public void releaseEM() {
		em.close();
	}

	public void beginTransaction() {
		
		LOG.info("em.getTransaction().begin();");
		em.getTransaction().begin();
	}

	public void endTransaction() {
		em.getTransaction().commit();
		releaseEM();
	}
	
	public void rollbackTransaction() {
		em.getTransaction().rollback();
		releaseEM();
	}
	
	public void flush() {
		em.flush();
	}
	
	public void setEM(EntityManager em){
		this.em=em;
	}
	public EntityManager getEM(){
		return em;
	}
}
