package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Principal {
	/*public static void main(String[] agrs) {
		List<Contacto> agenda = new ArrayList<Contacto>();
		Map<String, Contacto> registro = new HashMap<String,Contacto>();
		
		Contacto c =new Contacto("carlos","32778","corre","santo","uhphp9");
		registro.put(c.getNombre(), c);
		registro.merge(null, c, null);
		
		
		
		System.out.println(registro.get("32778"));
		*/
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, List<Contacto>> agenda = new HashMap<>();
        List<Contacto> listaContactos = new ArrayList<>();

        while (true) {
            System.out.println("Menú de opciones:");
            System.out.println("1.- Agregar un contacto");
            System.out.println("2.- Buscar un contacto (nombre)");
            System.out.println("3.- Buscar un contacto (número)");
            System.out.println("4.- Editar un contacto");
            System.out.println("5.- Eliminar un contacto (número)");
            System.out.println("6.- Agrupar en una lista los contactos con un @yahoo.com");
            System.out.println("7.- Mostrar todos los contactos");
            System.out.println("8.- Salir");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    agregarContacto(scanner, listaContactos, agenda);
                    break;
                case 2:
                    buscarPorNombre(scanner, listaContactos);
                    break;
                case 3:
                    buscarPorNumero(scanner, listaContactos);
                    break;
                case 4:
                    editarContacto(scanner, listaContactos);
                    break;
                case 5:
                    eliminarContacto(scanner, listaContactos, agenda);
                    break;
                case 6:
                    agruparPorDominio(listaContactos);
                    break;
                case 7:
                    mostrarContactos(listaContactos);
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }
        }
    }
	private static void agregarContacto(Scanner scanner, List<Contacto> listaContactos, HashMap<String, List<Contacto>> agenda) {
		System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el número: ");
        String numero = scanner.nextLine();
        System.out.print("Ingrese su correo: ");
        String correo = scanner.nextLine();
        System.out.print("Ingrese su dirrecion: ");
        String dirrecion = scanner.nextLine();
        System.out.print("Ingrese su numero de oficina: ");
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
	private static void buscarPorNombre(Scanner scanner, List<Contacto> listaContactos) {
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscado = scanner.nextLine();
        boolean encontrado = false;

        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Contacto encontrado: " + "\n"+
            contacto.nombre);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }

    private static void buscarPorNumero(Scanner scanner, List<Contacto> listaContactos) {
        System.out.print("Ingrese el número a buscar: ");
        String numeroBuscado = scanner.nextLine();
        boolean encontrado = false;

        for (Contacto contacto : listaContactos) {
            if (contacto.getNumero().equals(numeroBuscado)) {
                System.out.println("Contacto encontrado: " + contacto.nombre);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }

    private static void editarContacto(Scanner scanner, List<Contacto> listaContactos) {
        System.out.print("Ingrese el número del contacto a editar: ");
        String numeroEditar = scanner.nextLine();
        boolean encontrado = false;

        for (Contacto contacto : listaContactos) {
            if (contacto.getNumero().equals(numeroEditar)) {
                System.out.println("Ingrese el nuevo nombre: ");
                String nuevoNombre = scanner.nextLine();
                System.out.println("Ingrese el nuevo número: ");
                String nuevoNumero = scanner.nextLine();
                System.out.println("Ingrese el nuevo correo: ");
                String nuevoCorreo = scanner.nextLine();
                System.out.println("Ingrese la nueva dirrecion: ");
                String nuevoDirrecion = scanner.nextLine();
                System.out.println("Ingrese el nuevo numero de oficina: ");
                String nuevoNumOficina = scanner.nextLine();
                contacto.setNombre(nuevoNombre);
                contacto.setNumero(nuevoNumero);
                contacto.setCorreo(nuevoCorreo);
                contacto.setDirrecion(nuevoDirrecion);
                contacto.setNumOficina(nuevoNumOficina);
                System.out.println("Contacto editado correctamente.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }

    private static void eliminarContacto(Scanner scanner, List<Contacto> listaContactos, HashMap<String, List<Contacto>> agenda) {
        System.out.print("Ingrese el número del contacto a eliminar: ");
        String numeroEliminar = scanner.nextLine();
        boolean encontrado = false;

        Iterator<Contacto> iterator = listaContactos.iterator();
        while (iterator.hasNext()) {
            Contacto contacto = iterator.next();
            if (contacto.getNumero().equals(numeroEliminar)) {
                iterator.remove();

                // Eliminar el contacto del HashMap
                String key = contacto.getNumero();
                if (agenda.containsKey(key)) {
                    agenda.get(key).remove(contacto);
                }

                System.out.println("Contacto eliminado correctamente.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }

    private static void agruparPorDominio(List<Contacto> listaContactos) {
        List<Contacto> contactosYahoo = new ArrayList<>();
        for (Contacto contacto : listaContactos) {
            if (contacto.getCorreo().toLowerCase().endsWith("@yahoo.com")) {
                contactosYahoo.add(contacto);
            }
        }

        if (contactosYahoo.isEmpty()) {
            System.out.println("No se encontraron contactos con dominio @yahoo.com");
        } else {
            System.out.println("Contactos con dominio @yahoo.com:");
            for (Contacto contacto : contactosYahoo) {
                System.out.println(contacto.correo);
            }
        }
    }

    private static void mostrarContactos(List<Contacto> listaContactos) {
        if (listaContactos.isEmpty()) {
            System.out.println("La lista de contactos está vacía.");
        } else {
            System.out.println("Lista de contactos:");
            for (Contacto contacto : listaContactos) {
                System.out.println("Nombre: "+contacto.nombre +" Numero: "+contacto.numero+" Correo: "+
                		contacto.correo+" Dirrecion: "+contacto.dirrecion+" Numero de oficina: "+contacto.numOficina);
            }
        }
    }
		
}

