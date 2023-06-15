/* una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
*/
package ejercicio2.entidades;

public class Circunferencia {
    //atributos
    private double radio; 
    
    //constructores
    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    //setter

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //getter

    public double getRadio() {
        return radio;
    }
    
    
    
    
}
