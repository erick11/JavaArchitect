
package com.bemainick.publisherws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.bemainick.jaad.jaxws.IPersonaService;
import com.bemainick.persistence.entity.Persona;



public class PersonaServiceClient {
	
	//private static final Logger LOG =  LoggerFactory.getLogger(PersonaServiceClient.class);
	
	public static void main(String[] args) throws MalformedURLException {
		
		
		//URL url = new URL("http://localhost:8085/personaService?wsdl");
		URL url = new URL("http://localhost:8080/moduloI_project_JavaEE-JaxWs-0.0.1-SNAPSHOT/BasicPersonaService?wsdl");
		                 //http://localhost:8080/moduloI_project_JavaEE-JaxWs-0.0.1-SNAPSHOT/BasicPersonaService?wsdl		
		QName qname = new QName( "http://jaxws.jaad.bemainick.com/", "BasicPersonaServiceService");
        Service service = Service.create(url, qname);
        //CalculatorService servicePort = service.getPort(CalculatorService.class);
        IPersonaService servicePort = service.getPort(IPersonaService.class);
        
        /** Declaracion y asisgnacion de valores para variables*/
        Persona per1 = new Persona();        
        per1.setNombre("Erick");
        per1.setApellido("Navarrete");
        per1.setFechaNacimiento(new GregorianCalendar().getTime());
        
        Persona per2 = new Persona();
        per2.setNombre("Ryan");
        per2.setApellido("Giggs");
        per2.setFechaNacimiento(new GregorianCalendar().getTime());
        
        Persona per3 = new Persona();
        per3.setNombre("Marco");
        per3.setApellido("Reus");
        per3.setFechaNacimiento(new GregorianCalendar().getTime());
        
        
        servicePort.agregarPersona(per1);
        servicePort.agregarPersona(per2);     
        servicePort.agregarPersona(per3);
        System.out.println("Se agregaron Personas");
        
        System.out.println("Buscando personas");
        List<Persona> personas = servicePort.getPersonas();
        for (Persona persona : personas) {
			System.out.println(persona.toString());
		}
	}
	
	
}
