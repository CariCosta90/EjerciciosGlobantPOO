
package actividadextra2.entidades;

import java.time.Year;
import java.time.Duration;

public class Pelicula {
    
    //atributos
    private String titulo;
    private String genero;
    private Year anio;
    //duracion pasada en minutos
    private Duration duracion;
    
    //constructores 

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, Year anio, Duration duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
    }
    
    //setter y getter

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public Year getAnio() {
        return anio;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnio(Year anio) {
        this.anio = anio;
    }

    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", anio=" + anio + ", duracion=" + duracion + '}';
    }
    
    

}
