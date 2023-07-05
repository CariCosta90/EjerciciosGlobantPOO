package actividadextra2.servicios;

import actividadextra2.entidades.Alquiler;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class AlquilerServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //creo un array para guardar los alquileres
    Alquiler[] listadoAlquiler = new Alquiler[3];

    Alquiler alquiler = new Alquiler();

    public Alquiler crearAlquiler() {
        System.out.println("Ingresa la pelicula alquilada");
        System.out.println("-----------------------------");
        System.out.println("Ingresa el titulo");
        String pelicula = leer.next();
        System.out.println("Ingresa la fecha de alquiler (dia mes anio)");
        int diaInicio = leer.nextInt();
        int mesInicio = leer.nextInt() - 1;
        int anioInicio = leer.nextInt() - 1900;
        Date inicio = new Date(diaInicio, mesInicio, anioInicio);
        System.out.println("Ingresa la fecha de devolucion (dia mes anio)");
        int diaDevolucion = leer.nextInt();
        int mesDevolucion = leer.nextInt() - 1;
        int anioDevolucion = leer.nextInt() - 1900;
        Date fin = new Date(diaDevolucion, mesDevolucion, anioDevolucion);

        while (mesInicio > mesDevolucion) {
            System.out.println("La fecha de inicio no puede ser mayor que la final datos incorrectos");
            System.out.println("Ingresa la fecha de alquiler (dia mes anio)");
            diaInicio = leer.nextInt();
            mesInicio = leer.nextInt() - 1;
            anioInicio = leer.nextInt() - 1900;
            inicio = new Date(diaInicio, mesInicio, anioInicio);
            System.out.println("Ingresa la fecha de devolucion (dia mes anio)");
            diaDevolucion = leer.nextInt();
            mesDevolucion = leer.nextInt() - 1;
            anioDevolucion = leer.nextInt() - 1900;
            fin = new Date(diaDevolucion, mesDevolucion, anioDevolucion);
        }
        
        //diferencia de dias entre 2 fechas, se saca en milisegundos y luego se calcula a dias
        
        System.out.println("fecha 1" + inicio.getTime());
        System.out.println("fecha 1" + inicio.getDay());
        System.out.println("fecha 1" + inicio.getHours());
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        //falta la diferencia entre 2 fechas...
        
        //PENDIENTE
        
        
        
          return alquiler;

    }

}
