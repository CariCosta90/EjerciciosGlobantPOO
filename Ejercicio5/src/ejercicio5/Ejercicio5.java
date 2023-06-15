/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
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
package ejercicio5;

import ejercicio5.entidades.Cuenta;
import ejercicio5.servicios.CuentaServicios;
import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double monto;
        
        CuentaServicios cs = new CuentaServicios();
        
        Cuenta c1 = cs.crearCuenta();
        
        System.out.println("Selecciona la operacion a realizar");
        
        System.out.println("1. Ingreso de saldo");
        System.out.println("2. Retiro de saldo");
        System.out.println("3. extraccion rapida");
        System.out.println("4. consultar saldo");
        System.out.println("5. Consultar datos");
        System.out.println("6. Salir");
        
        int menu = leer.nextInt();
        
        while (menu != 6) {
            switch (menu) {
                case 1:
                    System.out.println("Indica el saldo a ingresar");
                    monto = leer.nextDouble();
                    cs.ingresar(monto, c1);
                    System.out.println("Ingresa proximo valor del menu");
                    menu = leer.nextInt();
                    break;
                case 2:
                    System.out.println("Indica el saldo a retirar");
                    monto = leer.nextDouble();
                    cs.retirar(monto, c1);
                    System.out.println("Ingresa proximo valor del menu");
                    menu = leer.nextInt();
                    break;
                case 3:
                    cs.extraccionRapida(c1);
                    System.out.println("Ingresa proximo valor del menu");
                    menu = leer.nextInt();
                    break;
                case 4:                    
                    cs.consultarSaldo(c1);
                    System.out.println("Ingresa proximo valor del menu");
                    menu = leer.nextInt();
                    break;
                case 5:
                    cs.consultarDatos(c1);
                    System.out.println("Ingresa proximo valor del menu");
                    menu = leer.nextInt();
                    break;
            }
        }
        
        System.out.println("Saliendo...");
        
    }
    
}

//mejora que se puede hacer: crear una funcion para el menu 