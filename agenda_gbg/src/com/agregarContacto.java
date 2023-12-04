package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class agregarContacto {
	
		public agregarContacto() {
			
		}

		public agregarContacto(Scanner scanner, List<Contacto> listaContactos, HashMap<String, List<Contacto>> agenda) {
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el número: ");
        String numero = scanner.nextLine();
        System.out.print("Ingrese el nombre: ");
        String correo = scanner.nextLine();
        System.out.print("Ingrese el número: ");
        String dirrecion = scanner.nextLine();
        System.out.print("Ingrese el nombre: ");
        String numOficina = scanner.nextLine();
        
        Contacto nuevoContacto = new Contacto(nombre, numero, correo, dirrecion,numOficina);
        listaContactos.add(nuevoContacto);

        // Agregar el contacto al HashMap
        String key = nuevoContacto.getNumero();
        if (!agenda.containsKey(key)) {
            agenda.put(key, new ArrayList<>());
        }
        agenda.get(key).add(nuevoContacto);
        System.out.println("Contacto agregado correctamente.");
    }
		
}
