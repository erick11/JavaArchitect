package modulo01.auto.evaluacion;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class JAXBUnMarshall {

	private static final Logger log = LoggerFactory.getLogger(JAXBUnMarshall.class);

    public static void main(String[] args) {

        try {

            File profesorXML = new File("profesor.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Profesor.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Profesor profesor = (Profesor) jaxbUnmarshaller.unmarshal(profesorXML);

            log.info("Datos del profesor");
            log.info("Codigo: " + profesor.getCodigo());
            log.info("Nombre: " + profesor.getNombre());
            log.info("Apellido: " + profesor.getApellido());
            log.info("FechaIngreso: " + profesor.getFechaIngreso());
            log.info("Telefono: " + profesor.getTelefono());
                      
        } catch (JAXBException e) {
            log.error("Error al realizar el marshalling", e);
        }
    }

	
}
