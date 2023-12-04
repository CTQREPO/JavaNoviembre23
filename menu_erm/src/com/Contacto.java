package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contacto {
	
		
private String telefono;
private String correo;


public Contacto(String telefono, String correo) {
	super();
	this.telefono = telefono;
	this.correo = correo;
}


public String getTelefono() {
	return telefono;
}


public void setTelefono(String telefono) {
	this.telefono = telefono;
}


public String getCorreo() {
	return correo;
}


public void setCorreo(String correo) {
	this.correo = correo;
}


@Override
public String toString() {
	return "Contacto [telefono=" + telefono + ", correo=" + correo + "]";
}


}//Fin del codig. 
