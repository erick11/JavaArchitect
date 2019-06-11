package com.bemainick.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//@EntityListeners(Persona.class)

@XmlRootElement(namespace= "http://www.bemainick.com/bemainick/persistence/entity/persona")
@XmlType(propOrder = { "idCodigo", "nombre", "apellido", "fechaNacimiento" })
@EntityListeners(Persona.class)
@Entity
@Table(		
		name="tb_Persona"
		//,schema = "jpatutorial"
)
public class Persona implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idCodigo;
	
	@Column(name="nombres", nullable= false, length= 50)
	private String nombre;
	
	@Column(name="apellido", nullable= false, length= 50)
	private String apellido;
	
	@Column(name="FechaNacimiento", nullable= false, length= 50)
	private Date fechaNacimiento;
	
	public Persona() {
		
	}
	
	public Persona(int idCodigo, String nombre, String apellido, Date fechaNacimiento) {
		super();
		this.idCodigo = idCodigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getIdCodigo() {
		return idCodigo;
	}

	public void setIdCodigo(int idCodigo) {
		this.idCodigo = idCodigo;
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


	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	
	@Override
	public String toString() {
		return "Persona [idCodigo=" + idCodigo + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

	
}
