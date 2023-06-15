/*
La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicio4.servicios;

import ejercicio4.entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {

        Rectangulo r1 = new Rectangulo();

        System.out.println("Ingresa la base del rectangulo");
        r1.setBase(leer.nextDouble());
        System.out.println("Ingresa e altura del rectangulo");
        r1.setAltura(leer.nextDouble());

        return r1;

    }
    
    //metodo para calcular superficie
    
    public void superficie(Rectangulo r1){
        double superficie = r1.getBase()*r1.getAltura();
        System.out.println("La superficie del rectangulo es de: " + superficie);
    }
    
    //metodo para calcularperimetro
    
    public void perimetro(Rectangulo r1){
        double perimetro = (r1.getBase()+r1.getAltura())*2;
        System.out.println("El perimetro del rectangulo es de: " + perimetro);
    }
    
    //metodo para dibujar el rectangulo
    
    public void dibujarRectangulo(Rectangulo r1){
        
        double num1 = r1.getBase();
        double num2 = r1.getAltura();
        
        for (int i = 0; i < num2; i++) {
            for (int j = 0; j < num1; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

}
