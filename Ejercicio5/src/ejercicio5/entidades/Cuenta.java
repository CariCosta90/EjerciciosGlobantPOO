/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
 */
package ejercicio5.entidades;

public class Cuenta {

    //atributos
    private int numeroCuenta;
    private int DNI;
    private int saldoActual;

    //constructores
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    //getters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    //setters 
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

}
