package com;

public class principal {
	
public static void main(String[] arg) {
		
		
		Carro c1 = new Carro(); //vacio 
		
		c1.setColor("rojo");
		c1.setMateriales("metal");
		c1.setTipo("deportivo");
		c1.setKilometraje(150);
		c1.setVelocidades(6);
		
		Carro c2 = new Carro("amarillo" , "hasbag", "metal", 145, 6);//Especifico
		Carro c3 = new Carro("metal", 120, 8 );
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.getMateriales());
		System.out.println(c3);

		
	}

}