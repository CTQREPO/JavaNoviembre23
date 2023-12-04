package com;
import java.util.Scanner;

public class Agenda {
    private static GestorAgenda agendaManager = new GestorAgenda();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Editar contacto");
            System.out.println("4. Buscar contacto por nombre");
            System.out.println("5. Buscar contacto por tel�fono");
            System.out.println("6. Consultar contactos por servidor de correo");
            System.out.println("7. Mostrar todos los contactos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opci�n: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva l�nea despu�s de leer un n�mero

            switch (opcion) {
                case 1:
                    agregarContacto();
                    break;
                case 2:
                    eliminarContacto();
                    break;
                case 3:
                    editarContacto();
                    break;
                case 4:
                    buscarPorNombre();
                    break;
                case 5:
                    buscarPorTelefono();
                    break;
                case 6:
                    consultarPorServidorCorreo();
                    break;
                case 7:
                    mostrarContactos();
                    break;
            }
        } while (opcion != 0);
    }

    private static void agregarContacto() {
        System.out.print("Ingrese el nombre del contacto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el tel�fono del contacto: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese el correo electr�nico del contacto: ");
        String correo = scanner.nextLine();

        agendaManager.agregarContacto(nombre, telefono, correo);
        System.out.println("Contacto agregado exitosamente.");
    }

    private static void eliminarContacto() {
        System.out.print("Ingrese el nombre del contacto que desea eliminar: ");
        String nombre = scanner.nextLine();
        agendaManager.eliminarContacto(nombre);
    }

    private static void editarContacto() {
        System.out.print("Ingrese el nombre del contacto que desea editar: ");
        String nombre = scanner.nextLine();
        System.out.print("Nuevo tel�fono (deje en blanco si no desea cambiar): ");
        String nuevoTelefono = scanner.nextLine();
        System.out.print("Nuevo correo electr�nico (deje en blanco si no desea cambiar): ");
        String nuevoCorreo = scanner.nextLine();

        agendaManager.editarContacto(nombre, nuevoTelefono, nuevoCorreo);
    }

    private static void buscarPorNombre() {
        System.out.print("Ingrese el nombre del contacto que desea buscar: ");
        String nombre = scanner.nextLine();
        Contacto contacto = agendaManager.buscarPorNombre(nombre);
        if (contacto != null) {
            System.out.println("Contacto encontrado: " + contacto);
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    private static void buscarPorTelefono() {
        System.out.print("Ingrese el tel�fono del contacto que desea buscar: ");
        String telefono = scanner.nextLine();
        Contacto contacto = agendaManager.buscarPorTelefono(telefono);
        if (contacto != null) {
            System.out.println("Contacto encontrado: " + contacto);
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    private static void consultarPorServidorCorreo() {
        System.out.print("Ingrese el servidor de correo electr�nico: ");
        String servidorCorreo = scanner.nextLine();
        agendaManager.consultarPorServidorCorreo(servidorCorreo);
    }

    private static void mostrarContactos() {
        agendaManager.mostrarContactos();
    }

}//fin del codigo

