/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/

package ejercicio_1;

import ejercicio_1.entidades.Libro;
import ejercicio_1.servicios.LibroServicio;

public class Ejercicio_1 {

    public static void main(String[] args) {
        LibroServicio ls = new LibroServicio();
        
        Libro l1 = ls.crearLibro();
        ls.mostrarDatosLibro(l1);
    }
    
}
