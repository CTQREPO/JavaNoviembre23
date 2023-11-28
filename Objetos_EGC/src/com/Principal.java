package com;

import java.util.Scanner;

public class Principal {
public static void main(String[] args) {

	/*Reloj r1 = new Reloj();//vacio
	r1.setColor("Gris");
	r1.setMateriales("Plata");
	r1.setTipo("Muñeca");
	r1.setHoras(18);
	r1.setMinutos(15);
	
	Reloj r2 = new Reloj("negro", "deportivo", "cuero", 14, 00);
	Reloj r3 = new Reloj("madera", 12, 35);
	
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r2.getMateriales());
	System.out.println(r3);*/
	
	
	
	
	
	Pizza napolitana = new Pizza("chica", "napolitana", "masa, salsa de tomate, queso mozzarella fresco, albahaca", 4);
	Pizza peperonni	= new Pizza("grande", "americana", "masa, salsa de tomate, queso mozzarella, peperonni", 8);
	Pizza hawaiiana = new Pizza("mediana", "romana", "masa, salsa de tomate, queso mozarrella, jamon, piña", 6);
	Pizza armada = new Pizza("", "", "", 0);
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese el número correspondiente a la pizza que desea ordenar \n1. Napolitana\n2.Peperonni\n3.Hawaiiana\n4.Armar mi propia pizza");
	int numPizza = sc.nextInt();
	
	switch(numPizza) {
	case 1:
		System.out.println(napolitana);
		break;
	case 2:
		System.out.println(peperonni);
		break;
	case 3:
		System.out.println(hawaiiana);
		break;
			default:
				System.out.println("El número ingresado no corresponde a ninguna pizza predefinida, desea armar su propia pizza ?\n1.Si\n2.No");
				int continuar = sc.nextInt();
				sc.nextLine();
				if(continuar ==1) {
				System.out.println("Ingrese el tamaño de la pizza que desea");
				armada.setTamaño(sc.nextLine());
				System.out.println("Ingrese el tipo de pizza deseado");
				armada.setTipo(sc.nextLine());
				System.out.println("Ingrese los ingredientes deseados");
				armada.setIngredientes(sc.nextLine());
				System.out.println("Ingrese el número de rebanadas deseados");
				armada.setRebanadas(sc.nextInt());
				System.out.println(armada);
				}else if(continuar==2) {
					System.out.println("Gracias por su preferencia, lo esperamos de vuelta pronto");
				}else {
					System.out.println("El número ingresado no coincide con alguna opción");
				}
	}sc.close();
}
}
