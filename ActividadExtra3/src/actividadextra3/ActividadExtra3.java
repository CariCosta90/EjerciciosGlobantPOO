package actividadextra3;

import actividadextra3.servicios.ClienteService;
import actividadextra3.servicios.RutinaService;
import java.util.Scanner;

public class ActividadExtra3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ClienteService cs = new ClienteService();
        RutinaService rs = new RutinaService();

//        System.out.println("Ingresa la cantidad de clientes que quieres agregar");
//        int cantidad = leer.nextInt();
//        for (int i = 0; i < cantidad; i++) {
//            
//        }
        boolean salir = true;

        while (salir) {
            System.out.println("Ingresa el valor del menu deseado");
            System.out.println("---------------------------------");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Obtener clientes");
            System.out.println("3. Actualizar cliente");
            System.out.println("4. Eliminar Cliente");
            System.out.println("5. Crear rutina");
            System.out.println("6. Obtener rutinas");
            System.out.println("7. Actualizar rutina");
            System.out.println("8. Eliminar Rutina");
            System.out.println("9. Salir");
            int menu = leer.nextInt();

            switch (menu) {
                case 1:
                    cs.registrarCliente();
                    break;
                case 2:
                    cs.obtenerClientes();
                    break;
                case 3:
                    System.out.println("Ingresa el id del cliente que quieres modificar");
                    int id = leer.nextInt();
                    System.out.println("Ingresa el nuevo Nombre");
                    String nombre = leer.next();
                    System.out.println("Ingresa la nueva edad");
                    int edad = leer.nextInt();
                    System.out.println("Ingresa la nueva altura");
                    double altura = leer.nextDouble();
                    System.out.println("Ingresa la nueva peso");
                    double peso = leer.nextDouble();
                    System.out.println("Ingresa la nueva objetivo");
                    String objetivo = leer.next();
                    cs.actualizarCliente(id, nombre, edad, altura, peso, objetivo);
                    break;
                case 4:
                    System.out.println("Ingresa el id del cliente que deseas eliminar");
                    id = leer.nextInt();
                    cs.eliminarCliente(id);
                    break;
                case 5:
                    rs.registrarRutina();
                    break;
                case 6:
                    rs.obtenerRutina();
                    break;
                case 7:
                    System.out.println("Ingresa el id de la rutina que quieres modificar");
                    id = leer.nextInt();

                    System.out.println("Ingresa el nuevo Nombre");
                    nombre = leer.next();

                    System.out.println("Ingresa la nueva duracion");
                    int duracion = leer.nextInt();

                    System.out.println("Ingresa el nuevo nivel de Dificultad");
                    String nivelDificultad = leer.next();

                    System.out.println("Ingresa la nueva descripcion");
                    String descripcion = leer.next();

                    rs.actualizarRutina(id, nombre, duracion, nivelDificultad, descripcion);

                    break;
                case 8:
                    System.out.println("Ingresa el id de la rutina que deseas eliminar");
                    id = leer.nextInt();
                    rs.eliminarRutina(id);
                    break;
                case 9:
                    System.out.println("Te moriste!");
                    salir = false;
                    break;
            }

        }

    }

}
