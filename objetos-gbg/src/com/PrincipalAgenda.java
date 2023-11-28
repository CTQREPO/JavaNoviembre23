package com;

public class PrincipalAgenda {

public static void main (String[] args) {
		
		Agenda a1 = new Reloj();
		a1.setColor("gris");
		a1.setMateriales("plata");
		a1.setTipo("muneca");
		a1.setHoras(18);
		a1.setMinutos(15);
		Reloj r2 = new Reloj("verde", "deportivo", "goma", 14, 00);
		Reloj r3 = new Reloj("madera", 12, 35);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r2.getMateriales());
		
		
		
		
	}
}
