package com;

public class Contacto {
	
	String nombre;
	String numero;
	String correo;
	String dirrecion;
	String numOficina;
	
	public Contacto() {
		
	}

	public Contacto(String nombre, String numero, String correo, String dirrecion, String numOficina) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.correo = correo;
		this.dirrecion = dirrecion;
		this.numOficina = numOficina;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDirrecion() {
		return dirrecion;
	}

	public void setDirrecion(String dirrecion) {
		this.dirrecion = dirrecion;
	}

	public String getNumOficina() {
		return numOficina;
	}

	public void setNumOficina(String numOficina) {
		this.numOficina = numOficina;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", numero=" + numero + ", correo=" + correo + ", dirrecion=" + dirrecion
				+ ", numOficina=" + numOficina + "]";
	}
	
	

}
