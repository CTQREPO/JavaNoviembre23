package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Cbasica c1= new Cbasica();		//CREAMOS UN OBJETO DE LA CLASE CBASICA
		c1.sumaRes();
		c1.restaRes();
		c1.multiRes();
		c1.divRes();
		System.out.println(c1);
		
		System.out.println("");
		
		Ccient�fica cien1= new Ccient�fica();	//CREAMOS UN OBJETO DE LA CLASE CCIENT�FICA			
		cien1.senRes();
		cien1.cosRes();
		cien1.tanRes();
		cien1.raizRes();
		System.out.println(cien1);
		
	}
	
}