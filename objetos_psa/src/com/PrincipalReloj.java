package com;

public class PrincipalReloj {

	public static void main(String[] args) {

		ClaseReloj r1 = new ClaseReloj();
		
		r1.setColor("gris");
		r1.setMateriales("plata");
		r1.setTipo("mu�eca");
		r1.setHoras(12);
		r1.setMinutos(24);

		ClaseReloj r2 = new ClaseReloj("azul", "deportivo", "goma", 14, 20);
		
		ClaseReloj r3 = new ClaseReloj("Blanco","Pared","Madera");
		
		
		System.out.println(r1);//Direcci�n de memoria sin toString
		System.out.println(r2);//Direcci�n de memoria sin toString
		System.out.println(r1.getColor());//Llamando al m�todo get
		System.out.println(r3);
		
	}

}

// UNA CLASE ES EL CONJUNTO DE QU� (ATRIBUTOS) Y/O C�MO (M�TODOS: Nativos, Heredados (sobreeescribir), Implementados (interfaces))
//ABSTRACCI�N: SINTETIZACI�N
