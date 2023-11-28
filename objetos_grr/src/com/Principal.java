package com;

public class Principal {
	
	public static void main (String[] args) {
		
//		Reloj r1 = new Reloj();// vacio
//		
//		r1.setColor("Gris"); //set da valor
//		r1.setMateriales("Plata");
//		r1.setTipo("muñeca");
//		r1.setHoras(18);
//		r1.setMinutos(15);
//		
//		Reloj r2 = new Reloj("verde", "deportivo", "goma", 14, 00); //con argumentos especifico
//		Reloj r3 = new Reloj("Madera", 12, 35);
//		
//		System.out.println(r1);
//		System.out.println(r2);
//		System.out.println(r1.getMateriales()); //get toma el valor
//		System.out.println(r3);
		
		
		Tenis t1 = new Tenis();
		t1.setColor("Blanco");
		t1.setMarca("adidas");
		t1.setMateriales("gamusa");
		t1.setTalla(26);
		t1.setModelo("gazelle");
		
		Tenis t2 = new Tenis ("Beige","Air Max","Piel","Nike", 24);
		
		System.out.println(t1);
		System.out.println(t2);
		
	}

}
