package edu.cibertec.jaad.json;

import java.io.File;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class JSONMarshall {

	private static final Logger LOG = LoggerFactory.getLogger(JSONMarshall.class);

	public static void main(String[] args) {
		LOG.info("Starting...");
		Programa programa = new Programa();
		programa.setCodigo(123);
		programa.setNombre("Java Architect Application Developer");

		List<String> modulos = new ArrayList<String>();
		modulos.add("Fundamentos de Comunicacion de Sistemas Distribuidos");
		modulos.add("Arquitectura de Web Services y Estandares Relacionados");
		programa.setModulos(modulos);
		programa.setFechaInicio(new GregorianCalendar(2016, 3, 1).getTime());
		programa.setFechaFin(new GregorianCalendar(2016, 6, 20).getTime());

		try {
			File programaJson = new File("programa.json");
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(Feature.INDENT_OUTPUT, true);
			mapper.writeValue(programaJson, programa);
			LOG.info("Resultado:\n" + mapper.writeValueAsString(programa));
		} catch (Exception ex) {
			LOG.error("Error al generar el archivo", ex);
		}
	}

}
