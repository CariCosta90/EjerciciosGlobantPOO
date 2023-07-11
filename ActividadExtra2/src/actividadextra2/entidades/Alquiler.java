
package actividadextra2.entidades;

import java.util.Date;
import java.time.LocalDate;

public class Alquiler {
    
    //atributos 
    private String pelicula;
    private LocalDate inicio;
    private LocalDate fin;
    private double precio;
    
    //constructores

    public Alquiler() {
    }

    public Alquiler(String pelicula, LocalDate inicio, LocalDate fin, double precio) {
        this.pelicula = pelicula;
        this.inicio = inicio;
        this.fin = fin;
        this.precio = precio;
    }
    
    //setter y getter 

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "pelicula=" + pelicula + ", inicioAlquiler=" + inicio + ", finAlquiler=" + fin + ", precio de alquiler de esta pelicula= $" + precio + '}';
    }
    
    

}
