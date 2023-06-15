/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura.
 */
package ejercicio4.entidades;

public class Rectangulo {
    //atributos
    private double base;
    private double altura;
    
    //constructores 

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
        
    }
    
    //getters 

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    //setters

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
}
