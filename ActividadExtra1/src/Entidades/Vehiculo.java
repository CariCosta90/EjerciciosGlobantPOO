package Entidades;

public class Vehiculo {

    //atributos
    private String marca;
    private String modelo;
    private int anio;
    private String tipo;
    private int frenar;

    //constructor
    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, String tipo, int frenar) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
        this.frenar = frenar;
    }

    //setter & getter
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFrenar(int frenar) {
        this.frenar = frenar;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getTipo() {
        return tipo;
    }

    public int getFrenar() {
        return frenar;
    }

}
