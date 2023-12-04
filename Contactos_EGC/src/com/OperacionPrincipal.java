package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OperacionPrincipal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, Contacto> agenda = new HashMap<String, Contacto>();
		List<Contacto> contactos = new ArrayList<Contacto>();
		List<Contacto> listita = new ArrayList<Contacto>();
		
		String buscar = "";
		Contacto a = new Contacto("Eduardo", "7442222563", "edgarcia2709@gmail.com", "*");
		Contacto b = new Contacto("Kassandra", "7441184576", "kass200158@yahoo.com", "*");
		Contacto c = new Contacto("Rubén", "7441715099", "rafa@yahoo.com", "*");
		Contacto aux;
		contactos.add(a);
		contactos.add(b);
		contactos.add(c);
		agenda.put(a.getNombre(), a);
		agenda.put(b.getNombre(), b);
		agenda.put(c.getNombre(), c);
		int posicion = 0;
		String nue = "";

		System.out.println(
				"Ingrese el número correspondiente a la accion que desea realizar \n1. Agregar un contacto\n2. Buscar un contacto por nombre\n3. Buscar un contacto por número telefónico \n4. Editar un contacto \n5. Mostrar contactos agrupados por servidor de email\n6. Mostrar todos los contactos existentes");
		String navegador = sc.nextLine();

		switch (navegador) {
		case "1":
			System.out.println("Ingrese el nombre del contacto que desea agregar");
			String nombre = sc.nextLine();
			System.out.println("Ingrese el nùmero telefònico");
			String numero = sc.nextLine();
			System.out.println("Ingrese un correo electrònico");
			String correo = sc.nextLine();
			System.out.println("Ingrese un nùmero de oficinia, en caso de no existir escribir \"*\"");
			String numOficina = sc.nextLine();
			Contacto nuevo = new Contacto(nombre, numero, correo, numOficina);
			System.out.println("Los datos del contacto guardado son los siguientes: " + nuevo);
			contactos.add(nuevo);
			System.out.println(contactos);
			agenda.put(nuevo.getNombre(), nuevo);
			break;
		case "2":
			System.out.println("Ingrese el nombre que desea buscar");
			buscar = sc.nextLine();
			for (int i = 0; i < contactos.size(); i++) {
				aux = contactos.get(i);
				posicion = i;

				if (contactos.get(i).getNombre().equalsIgnoreCase(buscar)) {
					System.out.println(aux);
				}
			}
			break;
		case "3":
			System.out.println("Ingrese el número que desea buscar");
			buscar = sc.nextLine();
			for (int i = 0; i < contactos.size(); i++) {
				aux = contactos.get(i);
				posicion = i;

				if (contactos.get(i).getNumero().contentEquals(buscar)) {
					System.out.println(aux);
				}
			}
			break;
		case "4":
			System.out.println("Ingrese el nombre de contacto que desea editar");
			buscar = sc.nextLine();
			System.out.println("Los datos del contacto seleccionado son: " + agenda.get(buscar));

			System.out.println(
					"Ingrese el número correspondiente al dato que desea editar\n1. Editar nombre\n2. Editar número\n3. Editar correo electrónico\n4. Editar número de oficina");
			navegador = sc.nextLine();
			switch (navegador) {
			case "1":
				System.out.println("Ingrese el nuevo nombre para el contacto");
				nue = sc.nextLine();
				aux = agenda.get(buscar);
				aux.setNombre(nue);
				agenda.put(buscar, aux);
				System.out.println("Los nuevos datos del contacto son: " + aux);
				break;
			case "2":
				System.out.println("Ingrese el nuevo número para el contacto");
				nue = sc.nextLine();
				aux = agenda.get(buscar);
				aux.setNumero(nue);
				agenda.put(buscar, aux);
				System.out.println("Los nuevos datos del contacto son: " + aux);
				break;
			case "3":
				System.out.println("Ingrese el nuevo correo electrónico para el contacto");
				nue = sc.nextLine();
				aux = agenda.get(buscar);
				aux.setEmail(nue);
				agenda.put(buscar, aux);
				System.out.println("Los nuevos datos del contacto son: " + aux);
				break;
			case "4":
				System.out.println("Ingrese el nuevo número de oficina para el contacto");
				nue = sc.nextLine();
				aux = agenda.get(buscar);
				aux.setNumOficina(nue);
				agenda.put(buscar, aux);
				System.out.println("Los nuevos datos del contacto son: " + aux);
				break;
			default:
				System.out.println("El número ingresado no corresponde a ninguna opción");
			}
			break;
		case "5":
			System.out.println(
					"Ingrese la opción correspondiente a la agrupación que busca\n1. @yahoo\n2. @gmail\n3. @hotmail\n4. @outlook");
			navegador = sc.nextLine();
			switch (navegador) {
			case "1":
				for (int i = 0; i < contactos.size(); i++) {
					aux = contactos.get(i);
					posicion = i;
				
				aux=contactos.get(posicion);
				if (contactos.get(posicion).getEmail().contains("yahoo")) {
					aux=contactos.get(posicion);
					listita.add(aux);
					
				}
				}System.out.println(listita);
				break;
			case "2":
				for (int i = 0; i < contactos.size(); i++) {
					aux = contactos.get(i);
					posicion = i;
				
				aux=contactos.get(posicion);
				if (contactos.get(posicion).getEmail().contains("gmail")) {
					aux=contactos.get(posicion);
					listita.add(aux);
					
				}
				}System.out.println(listita);
				break;
			case "3":
				for (int i = 0; i < contactos.size(); i++) {
					aux = contactos.get(i);
					posicion = i;
				
				aux=contactos.get(posicion);
				if (contactos.get(posicion).getEmail().contains("hotmail")) {
					aux=contactos.get(posicion);
					listita.add(aux);					
				}
				}System.out.println(listita);
				
				break;
			case "4":
				for (int i = 0; i < contactos.size(); i++) {
					aux = contactos.get(i);
					posicion = i;
				
				aux=contactos.get(posicion);
				if (contactos.get(posicion).getEmail().contains("outlook")) {
					aux=contactos.get(posicion);
					listita.add(aux);					
				}
				}System.out.println(listita);				
				break;
				default:
					System.out.println("El numero seleccionado no corresponde a ninguna opción");
			}
			break;

		case "6":
			System.out.println(agenda);
			break;

		default:
			System.out.println("El número indicado no corresponde a ninguna opción");
		}
	}
}
