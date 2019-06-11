package auto.evaluacion;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JASONUnMarshall {

	private static final Logger log = LoggerFactory.getLogger(JASONUnMarshall.class);

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

		try {
			Programa programa = mapper.readValue(new File("programa.json"), Programa.class);

			log.info("Datos del programa");
			log.info("Codigo: " + programa.getCodigo());
			log.info("Nombre: " + programa.getNombre());
			log.info("Modulos: " + programa.getModulos());
			log.info("FechaInicio: " + programa.getFechaInicio());
			log.info("FechaFin: " + programa.getFechaFin());
			log.info("codigoLocal: " + programa.getCodigoLocal());
			
		} catch (Exception e) {
			log.error("Error al generar el archivo", e);
		}
	}

}
