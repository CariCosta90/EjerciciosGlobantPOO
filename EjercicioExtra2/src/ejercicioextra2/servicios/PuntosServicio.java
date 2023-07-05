
package ejercicioextra2.servicios;

/*
Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.
*/
import ejercicioextra2.entidades.Puntos;
import java.util.Scanner;

public class PuntosServicio {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    Puntos p1 = crearPunto();
        
    public Puntos crearPunto(){
        Puntos p = new Puntos();
        
        System.out.println("Ingresa las coordenadas del punto 1");
        System.out.println("x");
        p.setX1(leer.nextInt());
        System.out.println("y");
        p.setY1(leer.nextInt());
        
        System.out.println("Ingresa las coordenadas del punto 2");
        System.out.println("x");
        p.setX2(leer.nextInt());
        System.out.println("y");
        p.setY2(leer.nextInt());
        
        return p;
    }
    
/*
d(P1, P2) = Raiz cuadrada (x2-x1)2 + (y2 - y1)2
*/
    public void calcularDistancia(){
        
        double cuadradoX = Math.pow(p1.getX2()-p1.getX1(), 2);
        double cuadradoY = Math.pow(p1.getY2()-p1.getY1(), 2);

        double distancia = Math.sqrt(cuadradoX+cuadradoY);
        
            System.out.println("La distancia entre los dos puntos es de " + distancia);
    }
    
}
