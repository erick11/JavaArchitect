package edu.cibertec.jaad.json;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder(value={"nombre", "codigo", "modulos"})
public class Programa {

	private Integer codigo;
	@JsonProperty("nombreComercial")
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private List<String> modulos;
		
	public Programa() {
		
	}

	public Programa(Integer codigo, String nombre, Date fechaInicio, Date fechaFin, List<String> modulos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.modulos = modulos;
	}

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

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public List<String> getModulos() {
		return modulos;
	}

	public void setModulos(List<String> modulos) {
		this.modulos = modulos;
	}
	

}
