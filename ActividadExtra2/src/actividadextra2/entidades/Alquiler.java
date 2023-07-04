
package actividadextra2.entidades;

import java.util.Date;

public class Alquiler {
    
    //atributos 
    private String pelicula;
    private Date inicio;
    private Date fin;
    private float precio;
    
    //constructores

    public Alquiler() {
    }

    public Alquiler(String pelicula, Date inicio, Date fin, float precio) {
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

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
