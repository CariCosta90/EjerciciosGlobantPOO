/*c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/
package ejercicio2.servicios;

import ejercicio2.entidades.Circunferencia;
import java.util.Scanner;


public class CircunferenciaServicio {
    //clase Scanner para hacer input
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    // Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    
    public Circunferencia crearCircunferencia(){
        
        Circunferencia c1 = new Circunferencia();
        
        System.out.println("ingresa el area de la circunferencia a crear");
        c1.setRadio(leer.nextInt());
        
        return c1;
    }
    //Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
    public void area(Circunferencia c1){
        
        double radio = c1.getRadio();
        
        double area = Math.PI*Math.pow(radio, 2);
        System.out.println("El area de la circunferencia es: " + area);
        
    }
    
    //Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
    public void perimetro(Circunferencia c1){
        double radio = c1.getRadio();
        double perimetro = 2*Math.PI*radio;
        
        System.out.println("El perimetro de la circunferencia es " + perimetro);
    }
}
