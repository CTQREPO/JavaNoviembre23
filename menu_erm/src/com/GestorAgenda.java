package com;

import java.util.HashMap;
import java.util.Map;

class GestorAgenda {
    private Map<String, Contacto> agenda = new HashMap<>();

    public void agregarContacto(String nombre, String telefono, String correo) {
        Contacto contacto = new Contacto(telefono, correo);
        agenda.put(nombre, contacto);
    }

    public void eliminarContacto(String nombre) {
        if (agenda.containsKey(nombre)) {
            agenda.remove(nombre);
            System.out.println("Contacto eliminado exitosamente.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void editarContacto(String nombre, String nuevoTelefono, String nuevoCorreo) {
        if (agenda.containsKey(nombre)) {
            Contacto contacto = agenda.get(nombre);

            if (!nuevoTelefono.isEmpty()) {
                contacto.setTelefono(nuevoTelefono);
            }

            if (!nuevoCorreo.isEmpty()) {
                contacto.setCorreo(nuevoCorreo);
            }

            System.out.println("Contacto editado exitosamente.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void mostrarContactos() {
        System.out.println("Lista de contactos:");
        for (Map.Entry<String, Contacto> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }

    public Contacto buscarPorNombre(String nombre) {
        return agenda.get(nombre);
    }

    public Contacto buscarPorTelefono(String telefono) {
        for (Map.Entry<String, Contacto> entry : agenda.entrySet()) {
            if (entry.getValue().getTelefono().equals(telefono)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void consultarPorServidorCorreo(String servidorCorreo) {
        for (Map.Entry<String, Contacto> entry : agenda.entrySet()) {
            if (entry.getValue().getCorreo().endsWith("@" + servidorCorreo)) {
                System.out.println("Contacto encontrado: " + entry.getKey() + ", " + entry.getValue());
            }
        }
    }
}//fin del codig.