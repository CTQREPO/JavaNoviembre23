package com;

public class PrincipalCafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cafe c1= new Cafe();
		c1.setCantidad(10);
		c1.setTostado("Medio");
		
		Cafe c2=new Cafe("Arábigo", "Medio", 20);
		
		Cafe c3=new Cafe("Robusta", "Oaxaca", "Ligero", 30, 2);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
