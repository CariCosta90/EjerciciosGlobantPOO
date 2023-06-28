package ejercicio11;

/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
*/

import java.util.Scanner;
import java.util.Date;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        int dia;
        int mes;
        int anio;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu fecha de nacimiento");
        System.out.println("dia");
        dia = leer.nextInt();
        
        System.out.println("mes");
        mes = leer.nextInt()-1;
        
        System.out.println("anio");
        anio = leer.nextInt()-1900;
        
        Date nacimiento = new Date(anio, mes, dia);
        
        Date hoy = new Date();
        
        int edad = hoy.getYear()-nacimiento.getYear();
        
        System.out.println("La fecha de nacimiento es: " + nacimiento);
        System.out.println("La fecha de hoy es: " + hoy);
        System.out.println("La edad de la persona es: " + edad);
              
               
    }

}
