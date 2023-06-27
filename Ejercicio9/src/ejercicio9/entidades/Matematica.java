
package ejercicio9.entidades;

/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set.
*/


public class Matematica {
    //atributos
    private double num1;
    private double num2;
    private double mayor;
    private double menor;
    
    //constructores 

    public Matematica() {
    }

    public Matematica(double num1, double num2, double mayor, double menor) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //getter y setter

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getMayor() {
        return mayor;
    }

    public double getMenor() {
        return menor;
    }
    
    

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setMayor(double mayor) {
        this.mayor = mayor;
    }

    public void setMenor(double menor) {
        this.menor = menor;
    }

    @Override
    public String toString() {
        return "Matematica{" + "num1=" + num1 + ", num2=" + num2 + ", mayor=" + mayor + ", menor=" + menor + '}';
    }
        
    
}
