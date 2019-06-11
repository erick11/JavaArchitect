package com.bemainick.test;

import java.util.GregorianCalendar;
import java.util.List;

import com.bemainick.persistence.entity.Persona;
import com.bemainick.persistence.service.PersonaServiceImpl;

public class PersonaTest {

	public static void main(String[] args) throws Exception {

		PersonaServiceImpl perImpl = new PersonaServiceImpl();
		
		imprimirTodo();
		
		Persona per1 = new Persona();
		per1.setNombre("Erick Eduardo");
		per1.setApellido("Navarrete Guerrero");
		per1.setFechaNacimiento(new GregorianCalendar(1997,6,6).getTime());
		/**Insertar DATOS*/
		perImpl.registrar(per1);
		
		imprimirTodo();
		
		
	
	}
	
	@SuppressWarnings("unused")
	private static void imprimirTodo() {
		try {
			
			PersonaServiceImpl perImpl = new PersonaServiceImpl();
			List<Persona> listPersonas = perImpl.getPersonas();
			System.out.println("Empleados en el Sistema: " + listPersonas.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
