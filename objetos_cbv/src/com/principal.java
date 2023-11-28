package com;

public class principal {
public static void main(String[]args) {
	
	Computadora Pc1=new Computadora();
	Pc1.setMarca("Asus"); 
	Pc1.setModelo("vivobook");
	Pc1.setPrecio(30000);
	Pc1.setProcesador("ryzen 9");
	Pc1.setTipo("laptop");
	float[] medidas= {12,14,2};
	Pc1.setDimensiones(medidas);
	
	
	System.out.println(Pc1);
	
	
	
//	
//	// reloj
//	Reloj r1=new Reloj();
//	r1.setColor("Gris");
//	r1.setMaterial("Plata");
//	r1.setTipo("Muñeca");
//	r1.setHora(18);
//	r1.setMinuto(15);
//	
//	Reloj r2 =new Reloj("verde","deportivo","Goma",12,00);
//	
//	Reloj r3 =new Reloj("madera",12,37);
//	System.out.println(r1);
//	System.out.println(r2);
//	
//	System.out.println(r2.getMaterial());
}
}
