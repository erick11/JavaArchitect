package modulo01.auto.evaluacion;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JAXBMarshall {

	
    private static final Logger log = LoggerFactory.getLogger(JAXBMarshall.class);

    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Profesor profesor = new Profesor();

        profesor.setCodigo(452334);
        profesor.setNombre("Juan");
        profesor.setApellido("Perez");
        profesor.setFechaIngreso(new GregorianCalendar(2010, 10, 21).getTime());
        /** autoEvaluacion*/
        profesor.setTelefono("991013813");
        
        try {

            File profesorXML = new File("profesor.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Profesor.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(profesor, profesorXML);
            jaxbMarshaller.marshal(profesor, baos);

            log.info("\n" + new String(baos.toByteArray()));

        } catch (Exception e) {
            log.error("Error al realizar el marshalling", e);
        }
    }


}
