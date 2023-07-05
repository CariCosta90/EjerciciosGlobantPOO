package ejerciciosextra3.servicios;

/*
 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
import ejerciciosextra3.entidades.Raices;
import java.util.Scanner;

public class RaicesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Raices r1 = new Raices();
    private int a = r1.getA();
    private int b = r1.getB();
    private int c = r1.getC();
    private double discriminante;

    //metodo para crear la ecuacion
    public Raices crearRaices() {

        System.out.println("Ingresa los 3 coeficientes");
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();

        return new Raices(a, b, c);
    }

    /*
     Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
     */
    public void getDiscriminante() {
        discriminante = (Math.pow(b, 2) - (4 * a * c));
        System.out.println("discriminante" + discriminante);
    }

    /* 
     Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
     */
    public boolean tieneRaices() {

        return discriminante >= 0;

    }

    /*
     Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
     */
    public boolean tieneRaiz() {
        return discriminante == 0;
    }

    /*
     Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
    
    Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
     */
    public void obtenerRaices() {
        if (this.tieneRaices()) {
            double raiz1 = (-(b) + Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / 2 * a;
            double raiz2 = (-(b) - Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / 2 * a;
            System.out.println("La ecuacion tiene 2 raices: " + raiz1 + " y " + raiz2);
        }
    }

    /*
     Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
     */
    public void obtenerRaiz() {
        if (this.tieneRaiz()) {
            double raiz = -b / (2 * a);
            System.out.println("La ecuacion tiene una sola raiz y esta es: " + raiz);
        }
    }

    /*
     Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
     */
    public void calcular() {
        if (this.tieneRaices()) {
            this.obtenerRaices();
        } else if (this.tieneRaiz()) {
            this.obtenerRaiz();
        } else {
            System.out.println("No existen soluciones reales.");
        }

    }

}
