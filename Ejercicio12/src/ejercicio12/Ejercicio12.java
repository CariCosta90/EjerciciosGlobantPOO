package ejercicio12;

import ejercicio12.entidades.Persona;
import ejercicio12.servicios.PersonaServicios;
import java.util.Scanner;

/*

Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        PersonaServicios ps = new PersonaServicios();
        Persona p1 = ps.crearPersona();

        System.out.println(p1.toString());

        ps.calcularEdad(p1);

        System.out.println("Ingresa la edad de una segunda persona para comprar");
        int edad = leer.nextInt();

        boolean menor = ps.menorQue(p1, edad);

        System.out.println("Es el receptor menor que la persona de la edad ingresada ahora? " + menor);
        
        ps.mostrarPersona(p1);
        
    }

}
