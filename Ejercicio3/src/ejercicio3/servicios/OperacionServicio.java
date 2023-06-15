/*
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package ejercicio3.servicios;

import ejercicio3.entidades.Operacion;
import java.util.Scanner;

public class OperacionServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.

    public Operacion creaarOperacion() {
        Operacion o1 = new Operacion();

        System.out.println("Ingresa los valores para operar");
        System.out.println("Valor 1");
        o1.setNumero1(leer.nextDouble());
        System.out.println("Valor 2");
        o1.setNumero2(leer.nextDouble());
        return o1;
    }

    // Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public void sumar(Operacion o1) {
        double suma = o1.getNumero1() + o1.getNumero2();

        System.out.println("La suma de los valores es: " + suma);
    }

    //Método restar(): calcular la resta de los números y devolver el resultado al main
    public void restar(Operacion o1) {
        double resta = o1.getNumero1() - o1.getNumero2();
        System.out.println("La resta de los valores es: " + resta);
    }

    /* Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
    fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
    Si no, se hace la multiplicación y se devuelve el resultado al main*/
    public void multiplicar(Operacion o1) {
        double num1 = o1.getNumero1();
        double num2 = o1.getNumero2();

        if (num1 == 0 || num2 == 0) {
            System.out.println("0");
            System.out.println("Al ser uno de los valores = 0 el resultado de la opercion es 0");
        } else {
            double multiplicacion = num1 * num2;
            System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        }
    }

    /* Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
    una división por cero, el método devuelve 0 y se le informa al usuario el error se le
    informa al usuario. Si no, se hace la división y se devuelve el resultado al main.*/
    public void dividir(Operacion o1) {
        double num1 = o1.getNumero1();
        double num2 = o1.getNumero2();

        if (num1 == 0 || num2 == 0) {
            System.out.println("0");
            System.out.println("Al ser uno de los valores = 0 el resultado de la opercion es 0");
        } else {
            double multiplicacion = num1 / num2;
            System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        }
    }

}
