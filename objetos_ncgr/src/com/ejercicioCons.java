package com;

public class ejercicioCons {
	
public static void main(String[]args) {
		
		ejercicioCons2 Pla = new ejercicioCons2(); //vacio
		Pla.setColor("gris");
		Pla.setMateriales("algodon");
		Pla.setTipo("polo");
		Pla.setTalla("L");
		
		ejercicioCons2 Pla2 = new ejercicioCons2("verde", "lino", "casual", "M"); //especifico
		ejercicioCons2 Pla3 = new ejercicioCons2("azul", "deportiva");
		System.out.println(Pla);
		System.out.println(Pla2);
		System.out.println(Pla3);
}

}
