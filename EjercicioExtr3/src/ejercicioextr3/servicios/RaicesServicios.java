package ejercicioextr3.servicios;

/*
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
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

import ejercicioextr3.entidades.Raices;
import java.util.Scanner;

public class RaicesServicios {

    //Raices r1 = crearRaices();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raices crearRaices() {   


        System.out.println("Ingresa los valores de los 3 coeficientes de la ecuacion de 2do grado");
        System.out.println("a");
        int a = leer.nextInt();
        //r1.setA(leer.nextInt());
        System.out.println("b");
        int b = leer.nextInt();
        //r1.setB(leer.nextInt());
        System.out.println("c");
        int c = leer.nextInt();
        //r1.setC(leer.nextInt());

        return new Raices(a, b, c);
    }
    
    /*
     Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
    */
    
    public double getDiscriminante(Raices r1){
        double discriminante = (Math.pow(r1.getB(), 2)-(4*r1.getA()*r1.getC()));      
        
        r1.setDiscriminante(discriminante);
        return discriminante;
        
    }
    
    /*
     Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
    */
    
    public boolean tieneRaices(Raices r1){
        boolean tieneRaices=false;
        if(r1.getDiscriminante()>=0){
            tieneRaices=true;
        }
        return tieneRaices;        
    }
    
    /*
     Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
    */
    
    public boolean tieneRaiz(Raices r1){
        boolean tieneRaiz = false;
        
        if(r1.getDiscriminante()==0){
            tieneRaiz=true;
        }
        return tieneRaiz;
    }
    
    
    /*
     Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
    
    -b±√(
    (b^2)-
    (4*a*c)
    )
    /(2*a)
    */
    
    public void obtenerRaices(boolean tieneRaices, Raices r1){
        double raiz1;
        double raiz2;
        
        int a = r1.getA();
        int b = r1.getB();
        int c = r1.getC();
               
        double raiz  = (((Math.pow(b, 2))-(4*a*c))/(2*a));
        if(tieneRaices){
            raiz1 = -b + (Math.sqrt(raiz));
            raiz2 = -b - (Math.sqrt(raiz));
            System.out.println("La raiz 1 es " + raiz1);
            System.out.println("La raiz 2 es " + raiz2);
        }
    }
    
    /*
     Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
    */
    
    public void obtenerRaiz(boolean tieneRaiz, Raices r1){
        double raiz1;
                int a = r1.getA();
        int b = r1.getB();
        int c = r1.getC();
               
        double raiz  = (((Math.pow(b, 2))-(4*a*c))/(2*a));
        
        if(tieneRaiz){
            raiz1 = -b + (Math.sqrt(raiz));
            System.out.println("La raiz 1 es " + raiz1);
        }
        
    }
    
    /*
     Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
    */
    
    public void calcular(Raices r1){
    boolean tieneRaices = tieneRaices();
    boolean tieneRaiz = tieneRaiz();
    
    if(tieneRaices || tieneRaiz){
        obtenerRaices(tieneRaices);
        obtenerRaiz(tieneRaiz);
    }else{
        System.out.println("La ecuasion no tiene soluciones posibles.");
    }
        
    
        
        
    }
}
