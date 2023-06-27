
package ejercicio10.entidades;


public class Arreglo {
    private double[] arreglo;
    private int tamano;
    
    //contructor

    public Arreglo(double[] arreglo, int tamano) {
        this.arreglo = arreglo;
        this.tamano = tamano;
    }

    public Arreglo(int tamano) {
        this.tamano = tamano;
    }   

    public Arreglo() {
    }
    
    //setters y getters

    public void setArreglo(double[] arreglo) {
        this.arreglo = arreglo;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public double[] getArreglo() {
        return arreglo;
    }

    public int getTamano() {
        return tamano;
    }

    @Override
    public String toString() {
        return "Arreglo{" + "arreglo=" + arreglo + ", tamano=" + tamano + '}';
    }
    
    
    
}
