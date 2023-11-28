package com;

public class Principal {
	
	public static void main (String[] args) {
		
		Reloj r1 = new Reloj();
		r1.setColor("gris");
		r1.setMateriales("plata");
		r1.setTipo("muneca");
		r1.setHoras(18);
		r1.setMinutos(15);
		Reloj r2 = new Reloj("verde", "deportivo", "goma", 14, 00);
		Reloj r3 = new Reloj("madera", 12, 35);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r2.getMateriales());
		
		
		
		
	}

}
