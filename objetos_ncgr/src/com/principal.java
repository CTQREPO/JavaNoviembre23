package com;

public class principal {

	public static void main(String[]args) {
		
		reloj r1 = new reloj(); //vacio
		r1.setColor("gris");
		r1.setMateriales("plata");
		r1.setTipo("muñeca");
		r1.setHoras(18);
		r1.setMinutos(15);
		
		
		reloj r2 = new reloj("verde", "deportivo", "goma", 14, 00); //especifico
		reloj r3 = new reloj("madera", 12, 35);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r1.getMateriales());
		System.out.println(r3);
	}
}
