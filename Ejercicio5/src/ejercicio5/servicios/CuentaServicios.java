/*
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicio5.servicios;

import java.util.Scanner;
import ejercicio5.entidades.Cuenta;

public class CuentaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public Cuenta crearCuenta() {
        Cuenta c1 = new Cuenta();

        System.out.println("Ingresa los datos de la cuenta");
        System.out.println("Ingresa el numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingresa el dni del cliente");
        c1.setDNI(leer.nextInt());
        System.out.println("Ingresa el saldo de la cuenta");
        c1.setSaldoActual(leer.nextInt());

        return c1;
    }

    //Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
    public void ingresar(double ingreso, Cuenta c1) {

        c1.setSaldoActual(c1.getSaldoActual() + (int) ingreso);
        System.out.println("El saldo actual es del " + c1.getSaldoActual());
    }

    /*Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
    la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    pondrá el saldo actual en 0.*/
    public void retirar(double retiro, Cuenta c1) {
        int montoRetiro = (int) retiro;

        if (montoRetiro > c1.getSaldoActual()) {
            c1.setSaldoActual(0);
            System.out.println("El saldo actual de la cuenta es de 0");
        } else {
            c1.setSaldoActual(c1.getSaldoActual() - montoRetiro);
            System.out.println("El saldo actual de la cuenta es de: " + c1.getSaldoActual());
        }

    }

    /* f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    usuario no saque más del 20%.*/
    public void extraccionRapida(Cuenta c1) {

        System.out.println("La extraccion rapida permitira retirar solo un 20% del saldo actual, desea realizar una extraccion rapida? s/n");
        String confirmacion = leer.next();

        if (confirmacion.equals("s")) {
            if (c1.getSaldoActual() == 0) {
                System.out.println("El saldo actual de la cuenta es 0, por lo tanto no se puede proceder con la extraccion");
            } else {
                System.out.println("Ingrese el monto que desea extraer");
                int montoExtraccion = leer.nextInt();

                while (montoExtraccion > (c1.getSaldoActual() * 0.2)) {
                    System.out.println("El monto ingresado es muy elevado, el maximo que puedes retirar es de: " + c1.getSaldoActual() * 0.2 + " Ingresa el monto nuevamente");
                    montoExtraccion = leer.nextInt();
                }
                c1.setSaldoActual(c1.getSaldoActual() - montoExtraccion);
                System.out.println("se ha extraido " + montoExtraccion + " de la cuenta y el saldo actua les de: " + c1.getSaldoActual());
            }
        } else {
            System.out.println("Ha seleccionado 'no' por lo tanto no procederemos con la extraccion rapida");
            System.out.println("Su saldo actual es de: " + c1.getSaldoActual());
        }

    }

    //Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(Cuenta c1) {
        System.out.println("El saldo actual de la cuenta es de: $" + c1.getSaldoActual());
    }

    //Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(Cuenta c1) {
        System.out.println("Los datos ingresados en la cuenta son: ");
        System.out.println("Numero de cuenta " + c1.getNumeroCuenta());
        System.out.println("DNI " + c1.getDNI());
        System.out.println("Saldo Actual " + c1.getSaldoActual());

    }

}
