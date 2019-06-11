package com.bemainick.persistence.entity.listener;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bemainick.persistence.entity.Persona;

public class PersonaListener {
	
	private static final Logger LOG = LoggerFactory.getLogger(PersonaListener.class);
	
	
	@PrePersist
	public void listener_before_insert(Persona persona){
		LOG.info("@PrePersist" + persona.toString());
	}
	
	@PreUpdate
	public void listener_before_update(Persona persona){
		LOG.info("@PreUpdate" + persona.toString());
	}
	
	@PreRemove
	public void listener_before_delete(Persona persona){
		System.out.println("@PreRemove");
	}
		
	@PostLoad
	public void listener_after_query(Persona persona){
		LOG.info("@PostLoad");
	}
	
	@PostPersist
	public void listener_after_insert(Persona persona){
		LOG.info("@PostPersist" + persona.toString());
	}
	
	@PostUpdate
	public void listener_after_update(Persona persona){
		LOG.info("@PostUpdate"+ persona.toString());
	}
	
	@PostRemove
	public void listener_after_delete(Persona persona){
		LOG.info("@PostRemove");
	}	
	
}
