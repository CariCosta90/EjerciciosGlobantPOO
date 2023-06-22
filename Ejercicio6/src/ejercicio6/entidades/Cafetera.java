
package ejercicio6.entidades;

/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
*/


public class Cafetera {
    
    //atributos
    private int capacidadMaxima;
    private int cantidadActual;
    private String nombre;
    
    //constructores

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual, String nombre) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
        this.nombre = nombre;
    }
    
    //getters

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    //setters

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
            
}
