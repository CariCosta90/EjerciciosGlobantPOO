package actividadextra3.servicios;

import actividadextra3.entidades.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

public class RutinaService {

    ArrayList<Rutina> lista = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Rutina crearRutina() {
        System.out.println("Ingresa el id de la rutina");
        int id = leer.nextInt();
        System.out.println("Ingresa el nombre de la rutina");
        String nombre = leer.next();
        System.out.println("Ingresa el duracion de la rutina");
        int duracion = leer.nextInt();
        System.out.println("Ingresa el nivel de Dificultad de la rutina");
        String nivelDificultad = leer.next();
        System.out.println("Ingresa la descripcion de la rutina");
        String descripcion = leer.next();

        return new Rutina(id, nombre, duracion, nivelDificultad, descripcion);
    }

    public void registrarRutina() {

        lista.add(crearRutina());

    }

    public void obtenerRutina() {

        if (lista.isEmpty()) {
            System.out.println("No hay Rutinas en la lista");
        } else {
            lista.forEach((list) -> {
                System.out.println(list);
            });
        }

    }

    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                lista.get(i).setNombre(nombre);
                lista.get(i).setDuracion(duracion);
                lista.get(i).setDescripcion(descripcion);
                lista.get(i).setNivelDificultad(nivelDificultad);
            }
        }

        //mostrar nueva rutina 
        System.out.println("Los nuevos datos de la rutina son: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public void eliminarRutina(int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                lista.remove(i);
            }
        }
        System.out.println("La rutina ha sido eliminada con exito");
    }
}
