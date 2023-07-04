package actividadextra2.servicios;

import actividadextra2.entidades.Pelicula;
import java.time.Duration;
import java.time.Year;
import java.util.Scanner;

public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    //Crear array de Pelicula[5]
    Pelicula[] listadoPeliculas = new Pelicula[3];

    public Pelicula crearPelicula() {

        System.out.println("Carga una nueva pelicula");
        System.out.println("------------------------");

        System.out.println("Ingresa el titulo de la pelicula");
        String titulo = leer.next();
        System.out.println("Ingresa el generno");
        String genero = leer.next();
        System.out.println("Ingresa el anio");
        //para poder pasar del scanner a Year se usa "Year.of(int)"
        int anio = leer.nextInt();
        Year year = Year.of(anio);
        System.out.println("Ingresa la duracion en minutos");
        //para poder ingresar el valor por scanner en minutos se usa valor Long que se convertira
        //luego a duracion y luego a horas usando duration.toHours();
        long duracionMinutos = leer.nextLong();
        Duration duracion = Duration.ofMinutes(duracionMinutos);
        //esta linea hay que pasarla donde se necesite usar en horas??
        long duracionHoras = duracion.toHours();

//        Pelicula p1 = new Pelicula(titulo, genero, year, duracion);
//        return p1;  
        return new Pelicula(titulo, genero, year, duracion);

    }

    //Listar peliculas disponibles (array de 5 peliculas)
    public void listarPeliculas() {

        for (int i = 0; i < listadoPeliculas.length; i++) {
            listadoPeliculas[i] = crearPelicula();
        }
    }

    //Mostrar listado de Peliculas
    public void mostrarListadoPeliculas() {
        for (Pelicula listadoPelicula : listadoPeliculas) {
            System.out.println("[" + listadoPelicula + "]");
        }
    }

    //Buscar pelicula por titulo
    public void buscarPorTitulo() {
        boolean disponible = false;
        System.out.println("Ingresa la pelicula que quieres buscar");
        String buscada = leer.next();

        for (Pelicula listadoPelicula : listadoPeliculas) {
            if (listadoPelicula.getTitulo().equalsIgnoreCase(buscada)) {
                disponible = true;
            }
        }

        if (disponible) {
            System.out.println("La pelicula " + buscada + " se encuentra en el listado");
        } else {
            System.out.println("La pelicula " + buscada + " no se encuentra en el listado");
        }

    }

    //Buscar pelicula por genero
    public void buscarPorGenero() {
        boolean disponible = false;
        
        System.out.println("Ingresa el genero que quieres buscar");
        String buscada = leer.next();

        for (Pelicula listadoPelicula : listadoPeliculas) {
            if (listadoPelicula.getGenero().equalsIgnoreCase(buscada)) {
                disponible = true;
            }
        }

        if (disponible) {
            System.out.println("El genero " + buscada + " se encuentra en el listado en las siguientes peliculas");
            for (Pelicula listadoPelicula : listadoPeliculas) {
                if (listadoPelicula.getGenero().equalsIgnoreCase(buscada)) {
                    System.out.println("[" + listadoPelicula + "]");
                }
            }
        } else {
            System.out.println("El genero " + buscada + " no se encuentra en el listado");
        }

    }

}
