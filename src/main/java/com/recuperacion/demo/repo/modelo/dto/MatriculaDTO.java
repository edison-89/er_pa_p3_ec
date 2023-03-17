package com.recuperacion.demo.repo.modelo.dto;

public class MatriculaDTO {

	private String cedula;
	private String nombre;
	private String apellido;
	private String nombreMateria;
	private String codigoMateria;

	public MatriculaDTO() {

	}

	public MatriculaDTO(String cedula, String nombre, String apellido, String nombreMateria, String codigoMateria) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.cedula = cedula;
		this.nombreMateria = nombreMateria;
		this.codigoMateria = codigoMateria;
	}

	// Metodos SET y GET
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public String getCodigoMateria() {
		return codigoMateria;
	}

	public void setCodigoMateria(String codigoMateria) {
		this.codigoMateria = codigoMateria;
	}

}
