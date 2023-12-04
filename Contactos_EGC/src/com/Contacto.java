package com;

public class Contacto {
	String nombre;
	String numero;
	String email;
	String numOficina;
	
	public Contacto() {
		
	}

	public Contacto(String nombre, String numero, String email, String numOficina) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumOficina() {
		return numOficina;
	}

	public void setNumOficina(String numOficina) {
		this.numOficina = numOficina;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", numero=" + numero + ", email=" + email + ", numOficina=" + numOficina
				+ "]";
	}
}
