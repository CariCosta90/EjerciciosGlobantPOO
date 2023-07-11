package actividadextra2.servicios;

import actividadextra2.entidades.Alquiler;
import java.util.Scanner;
import java.time.LocalDate;

public class AlquilerServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //creo un array para guardar los alquileres
    Alquiler[] listadoAlquiler = new Alquiler[1];

    //Alquiler alquiler = new Alquiler();
    public Alquiler crearAlquiler() {

        System.out.println("Ingresa la pelicula alquilada");
        System.out.println("-----------------------------");
        System.out.println("Ingresa el titulo");
        String pelicula = leer.next();
        LocalDate fechaInicio = LocalDate.now();
        System.out.println("La fecha de alquiler de la pelicula sera seteada a: " + fechaInicio);
        System.out.println("Ingresa la fecha de devolucion de la pelicula con el formato (AAAA-MM-DD)");
        String fin = leer.next();
        LocalDate fechaFin = LocalDate.parse(fin);

        double diferenciaEnDias = fechaFin.compareTo(fechaInicio);
        System.out.println("diferencia en dias " + diferenciaEnDias);
        double precio;
        if (diferenciaEnDias < 4) {
            precio = diferenciaEnDias * 10;
        } else {
            double diasExtra = diferenciaEnDias - 3;
            precio = (diferenciaEnDias * 10) + (diasExtra * 10.1);
        }

        return new Alquiler(pelicula, fechaInicio, fechaFin, precio);
    }

    public void crearListadoAlquileres() {
        for (int i = 0; i < listadoAlquiler.length; i++) {
            listadoAlquiler[i] = crearAlquiler();
        }
    }

    public void mostrarListadoAlquileres() {
        for (Alquiler alquiler1 : listadoAlquiler) {
            System.out.println("[" + alquiler1 + "]");
        }
    }

    //Buscar un alquiler por fecha (Decir si se existe o no, y si existe, mostrar los datos del alquiler)
    public void buscarPorFecha() {
        System.out.println("Ingresa la fecha que quieres buscar con el formato (AAAA-MM-DD)");
        LocalDate fecha = LocalDate.parse(leer.next());

        for (Alquiler listadoAlquiler1 : listadoAlquiler) {
            if (listadoAlquiler1.getInicio().isEqual(fecha)) {
                System.out.println("Encontramos una pelicula con esa fecha de alquiler");
                System.out.println("[" + listadoAlquiler1 + "]");
            } else {
                System.out.println("No se ha encontrado una pelicula en el listado que haya sido alquilada en la fecha: " + fecha);
            }
        }
    }

    //Calcular el ingreso total del servicio (El alquiler cuesta $10, por 3 días. Por cada día extra, se aumenta un 10% de interés.)
    public void ingresoTotal() {
        double precioTotal = 0;
        for (Alquiler alquiler : listadoAlquiler) {
            precioTotal += alquiler.getPrecio();
        }
        {
            
            System.out.println("El precio total de los alquileres es de: $" + precioTotal);

        }
    }

}
