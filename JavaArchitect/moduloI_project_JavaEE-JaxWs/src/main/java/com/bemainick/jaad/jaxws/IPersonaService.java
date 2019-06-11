package com.bemainick.jaad.jaxws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.bemainick.persistence.entity.Persona;

@WebService
public interface IPersonaService {
	
	@WebMethod(operationName = "getPersona")
	Persona  getPersona(@WebParam String codigo);
	
	@WebMethod(operationName = "getPersonas")
	List<Persona>  getPersonas();
	
	@WebMethod(operationName = "agregar")
	//@WebResult(name="personaResponse", partName="partPersonaResponse")
	String  agregarPersona(@WebParam Persona per);

	@WebMethod(operationName = "modificar")
	// @WebResult(name="clienteResponse", partName="partClienteResponse")
	String modificar(@WebParam Persona per);
	
	@WebMethod(operationName = "eliminar")
	// @WebResult(name="clienteResponse", partName="partClienteResponse")
	String eliminar(@WebParam String codigo);

}
