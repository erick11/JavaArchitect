package com.bemainick.persistence.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bamainick.persistence.jpa.dao.PersonaJPA;
import com.bemainick.persistence.entity.Persona;

public class PersonaServiceImpl implements IPersonaService {

	private static final Logger LOG = LoggerFactory.getLogger(PersonaServiceImpl.class);
	
	PersonaJPA personaJpaDao = new PersonaJPA();

	@Override
	public List<Persona> getPersonas() throws Exception { 
		
		LOG.info(" ****************  inicio getPersonas() **************** ");
		
		List<Persona> personas = null;

		personaJpaDao.createEM();
		personas = personaJpaDao.getAll();
		personaJpaDao.releaseEM();
		
		LOG.info(" **************** fin getPersonas() ****************");
		
		return personas;
	}

	@Override
	public void eliminar(Integer codigo) throws Exception {
		
		try {
			
			personaJpaDao.createEM();
			
			personaJpaDao.beginTransaction();
			personaJpaDao.eliminar(codigo);
			personaJpaDao.flush();
			personaJpaDao.endTransaction();
			
		} catch (Exception e) {
			personaJpaDao.rollbackTransaction();
			e.printStackTrace();
		}

	}

	@Override
	public Persona getPersona(Integer codigo) throws Exception {
		
		
		Persona persona = null;
		
		personaJpaDao.createEM();
		persona = personaJpaDao.get(codigo);
		personaJpaDao.releaseEM();

		
		return persona;
	}

	@Override
	public void actualizar(Persona persona) throws Exception {
		
		try {
			
			personaJpaDao.createEM();
			personaJpaDao.beginTransaction();
			personaJpaDao.actualizar(persona);
			personaJpaDao.flush();
			personaJpaDao.endTransaction();
			
		} catch (Exception e) {
			
			personaJpaDao.rollbackTransaction();
			e.printStackTrace();
		}
			
	}

	@Override
	public void registrar(Persona persona) throws Exception {

		LOG.info(" ***************** inicio registrar()  *****************");
		
		try {

			personaJpaDao.createEM();
			personaJpaDao.beginTransaction();
			personaJpaDao.registrar(persona);
			personaJpaDao.flush();
			personaJpaDao.endTransaction();

		} catch (Exception e) {
			personaJpaDao.rollbackTransaction();
			e.printStackTrace();
		}
		
		LOG.info("fin registrar()");

	}

}
