package com;

public class principal {
	
	public static void main(String[] args) {
		
		Reloj r1 = new Reloj();  //vac�o
		
		r1.setColor("Gris");
		r1.setMateriales("Plata");
		r1.setTipo("Mu�eca");
		r1.setHoras(18);
		r1.setMinutos(15);
		
		Reloj r2 = new Reloj("verde", "deportivo", "goma", 14, 00); //espec�fico
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r2.getMateriales());
		
	}

}
