package actividadextra3.servicios;

import actividadextra3.entidades.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteService {

    ArrayList<Cliente> lista = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cliente crearCliente() {

        System.out.println("Ingresa el id");
        int id = leer.nextInt();
        System.out.println("Ingresa el nombre");
        String nombre = leer.next();
        System.out.println("Ingresa el edad");
        int edad = leer.nextInt();
        System.out.println("Ingresa el altura");
        double altura = leer.nextDouble();
        System.out.println("Ingresa el peso");
        double peso = leer.nextDouble();
        System.out.println("Ingresa el objetivo");
        String objetivo = leer.next();

        return new Cliente(id, nombre, edad, altura, peso, objetivo);
    }

    public void registrarCliente() {

        lista.add(crearCliente());

    }

    public void obtenerClientes() {
        if (lista.isEmpty()) {
            System.out.println("No hay clientes en la lista");
        } else {
            lista.forEach((list) -> {
                System.out.println(list);
            });
        }
    }

    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                lista.get(i).setNombre(nombre);
                lista.get(i).setEdad(edad);
                lista.get(i).setAltura(altura);
                lista.get(i).setPeso(peso);
                lista.get(i).setObjetivo(objetivo);
            }
        }

        //mostrar nuevo cliente
        System.out.println("Los nuevos datos del cliente son: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }

    public void eliminarCliente(int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                lista.remove(i);
            }
        }
        System.out.println("El cliente ha sido eliminado con exito");
    }

}
