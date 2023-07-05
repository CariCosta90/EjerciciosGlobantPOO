
package ejercicioextr3.entidades;

/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
*/


public class Raices {
    
    private int a;
    private int b;
    private int c;
    private double discriminante;

    public Raices() {
    }

    public Raices(int a, int b, int c, double discriminate) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminante = discriminate;
    }
    
    //constructor sin discriminante

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminante() {
        return discriminante;
    }

    public void setDiscriminante(double discriminante) {
        this.discriminante = discriminante;
    }
    
    
    
    

}
