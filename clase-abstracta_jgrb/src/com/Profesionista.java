package com;

//POJO
public abstract class Profesionista {
	
	String titulo;
	String cedula;
	String nombre;
	String especialidad;
	
	public Profesionista() {
		
	}

	public Profesionista(String titulo, String cedula, String nombre, String especialidad) {
		super();
		this.titulo = titulo;
		this.cedula = cedula;
		this.nombre = nombre;
		this.especialidad = especialidad;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

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

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Profesionista [titulo=" + titulo + ", cedula=" + cedula + ", nombre=" + nombre + ", especialidad="
				+ especialidad + "]";
	}

	public abstract void trabajar ();
	
	
	
	
	
}
