package com;

public class PrincipalConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consola c1=new Consola();
		c1.setMarca("Xbox");
		c1.setGeneracion("Next gen");
		c1.setColor("Verde: Jefe Maestro");
		c1.setCapacidad(1);
		
		Consola c2=new Consola("Nintendo", "Roja", 500);
		
		Consola c3=new Consola("Play Station", "Next gen", "Blanca", 1);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
