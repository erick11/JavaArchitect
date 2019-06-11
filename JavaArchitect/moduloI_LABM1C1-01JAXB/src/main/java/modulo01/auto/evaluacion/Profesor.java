package modulo01.auto.evaluacion;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
@XmlRootElement: ruta del elemento 
@XmlType: La estructura del objeto
*/
@XmlRootElement(namespace="http://www.cibertec.edu/jaad/objeto/profesor")
@XmlType(propOrder = { "codigo", "nombre", "apellido", "fechaIngreso","telefono"})
public class Profesor {

	private Integer codigo;
	private String nombre;
	private String apellido;
	private Date fechaIngreso;
	/** autoEvaluacion*/
	private String telefono;
	
	public Profesor() {
		
	}
	
	@XmlAttribute
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	
	/** autoEvaluacion*/
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
