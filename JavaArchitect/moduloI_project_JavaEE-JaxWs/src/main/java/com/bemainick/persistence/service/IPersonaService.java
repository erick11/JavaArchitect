package com.bemainick.persistence.service;

import java.util.List;

import com.bemainick.persistence.entity.Persona;

public interface IPersonaService {

	public Persona getPersona(Integer codigo) throws Exception;
	
	public List<Persona> getPersonas() throws Exception;
	
	public void registrar(Persona persona) throws Exception;
	
	public void	actualizar(Persona persona) throws Exception;
	
	public void eliminar(Integer codigo) throws Exception;
}
