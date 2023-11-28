package com;

public class Principal {
	
	public static void main(String [] args ) {
		
//		ReloPOO r1 = new ReloPOO();  //Vacio
//		
//		r1.setColor("Gris");
//		r1.setMateriales("Plata");
//		r1.setTipo("muñeca");
//		r1.setHoras(18);
//		r1.setMinutos(15);
//		
//		
//		ReloPOO r2 = new ReloPOO("verde", "deportivo", "goma", 14, 00);   //Especifico
//		ReloPOO r3 = new ReloPOO("madera",12,35);
//		
//		System.out.println(r1);
//		System.out.println(r2);
//		System.out.println(r1.getMateriales());
//		System.out.println(r3);
//		
//		
		Audifonos a1 = new Audifonos(); 
		
		a1.setColor("Morado");
		a1.setTipo("Headset");
		a1.setMaterial("Aluminio");
		
		Audifonos a2 = new Audifonos("rojo", "auricular","caucho");
		Audifonos a3 = new Audifonos("tornasol","Bluetooht","tela");
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		
		
		
		
	}

}
