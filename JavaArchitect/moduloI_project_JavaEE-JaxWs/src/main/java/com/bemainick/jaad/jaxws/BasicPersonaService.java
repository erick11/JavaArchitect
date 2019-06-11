package com.bemainick.jaad.jaxws;

import java.util.List;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bemainick.persistence.entity.Persona;
import com.bemainick.persistence.service.PersonaServiceImpl;
import com.bemainick.util.JPAUtil;

@WebService(endpointInterface = "com.bemainick.jaad.jaxws.IPersonaService")
public class BasicPersonaService implements IPersonaService {
	
	private static final Logger LOG = LoggerFactory.getLogger(BasicPersonaService.class);
	
	PersonaServiceImpl perImpl = new PersonaServiceImpl();

	@Override
	public Persona getPersona(String codigo) {
		LOG.info("inicio - getPersona");
		Persona persona = null;

		try {

			persona = perImpl.getPersona(Integer.parseInt(codigo));

		} catch (Exception e) {

		}
		
		LOG.info("fin - getPersona");

		return persona;
	}

	@Override
	public List<Persona> getPersonas() {
		
		LOG.info("inicio - getPersonas");
		
		List<Persona> personas = null;

		try {
			personas = perImpl.getPersonas();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LOG.info("fin - getPersonas");
		
		return personas;
	}

	@Override
	public String agregarPersona(Persona per) {
   
		LOG.info("inicio - agregarPersona");
		
		String rpta = "No se agrego la persona";

		try {
			perImpl.registrar(per);
			rpta = "Se agrego la persona";

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		LOG.info("fin - agregarPersona");

		return rpta;
	}

	@Override
	public String modificar(Persona per) {

		String rpta = "No se modifico la persona";

		try {

			perImpl.actualizar(per);
			rpta = "Se modifico la persona";

		} catch (Exception e) {

			e.printStackTrace();
		}

		return rpta;
	}

	@Override
	public String eliminar(String codigo) {

		String rpta = "No se elinino la persona";

		try {

			perImpl.eliminar(Integer.parseInt(codigo));
			rpta = "Se elinino la persona";

		} catch (Exception e) {
			e.printStackTrace();
		}

		return rpta;
	}

}
