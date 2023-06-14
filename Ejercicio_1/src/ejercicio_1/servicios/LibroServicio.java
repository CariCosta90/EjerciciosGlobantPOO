package ejercicio_1.servicios;

import ejercicio_1.entidades.Libro;
import java.util.Scanner;

public class LibroServicio {

    Scanner leer = new Scanner(System.in);

    public Libro crearLibro() {
        
        Libro l1 = new Libro();

        System.out.println("Ingresa los datos del libro");
        System.out.println("Titulo");
        l1.setTitulo(leer.nextLine());
        System.out.println("Autor");
        l1.setAutor(leer.nextLine());
        System.out.println("ISBN");
        l1.setIsbn(leer.nextInt());
        System.out.println("Cantidad de pags");
        l1.setQtyPags(leer.nextInt());

        return l1;
    }
    
    public void mostrarDatosLibro(Libro l1){
        System.out.println("Los datos ingresados son");
        System.out.println("Titulo: " + l1.getTitulo());
        System.out.println("Autor: " + l1.getAutor());
        System.out.println("ISBN: " + l1.getIsbn());
        System.out.println("Cantidad de paginas: " + l1.getQtyPags());
        
    }
}
