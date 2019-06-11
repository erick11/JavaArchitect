package com.bamainick.persistence.jpa.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import com.bemainick.persistence.entity.Persona;

public class PersonaJPA extends GenericoJPA {

	private static final long serialVersionUID = 1L;

	public Persona get(Integer id) throws Exception {
		return em.find(Persona.class, id);
	}

	public List<Persona> getAll() throws Exception {
		
		TypedQuery<Persona> query = em.createQuery("FROM Persona", Persona.class);
		return query.getResultList();
	}
	
	/**
	 public List<Persona> getAll() throws Exception {
		
		String query = "SELECT o FROM Empleado o ORDER BY o.id";
		Query emquery = em.createQuery(query, Persona.class);
		List<Persona> personas = emquery.getResultList();
		
		return personas;
	} 
	 */
	
	public void registrar(Persona persona) throws Exception {
		em.persist(persona);
	}
	
	public void actualizar(Persona persona) throws Exception {
		em.merge(persona);
	}
	
	public void eliminar(Integer id) throws Exception {
		Persona personaEliminar = (Persona) em.getReference(Persona.class, id);
		em.remove(personaEliminar);
	}

	

}
