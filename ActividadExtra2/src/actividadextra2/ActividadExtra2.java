package actividadextra2;

import actividadextra2.servicios.AlquilerServicio;
import actividadextra2.servicios.PeliculaServicio;

/*
Escribir un programa en Java que simule un servicio de alquiler de películas. El programa debe tener una clase Pelicula
que represente los datos de una película, como el título, el género, el año y la duración. El programa también debe tener
una clase Alquiler que represente los datos de un alquiler, como la película alquilada, la fecha de inicio, la fecha de fin y
el precio.
El programa puede usar la clase Date para manejar las fechas, la clase Arrays para almacenar y ordenar las películas y
los alquileres, la clase Math para calcular el precio según la duración y el género de la película, y la clase String para
manipular los textos.
El programa debe permitir al usuario ingresar los datos de las películas disponibles y los datos de los alquileres
realizados, y mostrar por pantalla un menú con las opciones de cargar una pelicula, hacer una lista de todas las peliculas
disponibles, crear un alquiler, realizar una lista de todos los alquileres, buscar peliculas por titulo o por genero y buscar
alquileres por fecha
*/

import java.util.Scanner;


public class ActividadExtra2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        PeliculaServicio ps = new PeliculaServicio();
        AlquilerServicio as = new AlquilerServicio();
        
        //creo el menu 
        
        int menu=0;
        int contador = 0;
        
        while(menu!=9){
            System.out.println("Ingresa el valor del menu que deseas");
            System.out.println("------------------------------------");
            System.out.println("");
            System.out.println("1. Crear inventario de peliculas");
            System.out.println("2. Mostrar listado de peliculas disponibles");
            System.out.println("3. Buscar pelicula por nombre");
            System.out.println("4. Buscar peliculas por genero");
            System.out.println("5. Ingresar un alquiler");
            System.out.println("6. Listar peliculas alquiladas");
            System.out.println("7. Buscar alquiler por fecha");
            System.out.println("8. Calcular ingreso total de los alquileres");
            System.out.println("9. Salir");
            
            menu = leer.nextInt();
            
                    
            switch (menu) {
                case 1:
                    ps.listarPeliculas();
                    break;
                case 2:
                    ps.mostrarListadoPeliculas();
                    break;
                case 3:
                    ps.buscarPorTitulo();
                    break;
                case 4:
                    ps.buscarPorGenero();
                    break;
                case 5:
                    as.crearAlquiler();
                    //hacer un if contador es 0 crear el objeto en el lugar 0 del array y contador ++ else solo crear el objeto 
                    contador++;
                    break;
                case 6:
                    ps.listarPeliculas();
                    break;
                case 7:
                    ps.listarPeliculas();
                    break;
                case 8:
                    ps.listarPeliculas();
                    break;
            }
        }
        
        System.out.println("Saliendo.........");
        
        
        
        
        
       
    }

}
