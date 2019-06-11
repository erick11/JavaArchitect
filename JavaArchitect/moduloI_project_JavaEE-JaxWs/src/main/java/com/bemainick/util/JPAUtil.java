package com.bemainick.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JPAUtil {

	private static final Logger LOG = LoggerFactory.getLogger(JPAUtil.class);
	
	private static final EntityManagerFactory emf;
	
	static{
		
		try{
			emf=Persistence.createEntityManagerFactory("Persistencia");					
			
			LOG.info("emf.getProperties().size(): " + emf.getProperties().size());
			LOG.info("emf.getProperties().toString(): " + emf.getProperties().toString());
			
			LOG.info("Se cargo la Persistencia");
		} catch(Exception e){
			
			LOG.error("ERROR solo : " +  e);			
			LOG.info("ERROR e.getMessage(): " +  e.getMessage());
			LOG.error("ERROR: " +  e.getMessage());
			System.out.println("Error Servidor");
			e.printStackTrace();			
			throw new ExceptionInInitializerError();			
		}
	}

	public static EntityManagerFactory getEmf() {
		return emf;
	}
	
}
