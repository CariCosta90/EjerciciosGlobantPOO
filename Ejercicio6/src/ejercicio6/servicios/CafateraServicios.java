package ejercicio6.servicios;

import ejercicio6.entidades.Cafetera;

/*
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
import java.util.Scanner;

public class CafateraServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera crearCafetera() {
        Cafetera c1 = new Cafetera();
        System.out.println("Ingresa la cantidad maxima");
        c1.setCapacidadMaxima(leer.nextInt());
        System.out.println("Ingresa la cantidad actual");
        c1.setCantidadActual(leer.nextInt());
        return c1;

    }

    public void llenarCafetera(Cafetera c1) {
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("La cantidad actual de cafe es: " + c1.getCantidadActual() + " en la cafetera " + c1.getNombre());
    }

    /*
            Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
     */
    public void servirTaza(Cafetera c1, int taza) {
        
        System.out.println("La cantidad actual en la cafetera " + c1.getNombre() + " es de " + c1.getCantidadActual());
        System.out.println("Se solicito llenar la taza con " + taza);
        if (c1.getCantidadActual() < taza) {
            //informamos cuanto se pudo llenar en la taza
            System.out.println("La cafetera no tenia suficiente contenido para llenar la taza, la taza quedo en " + c1.getCantidadActual() + " en la cafetera " + c1.getNombre());
            //actualizamos la cantidad actual a 0
            c1.setCantidadActual(0);
        } else {
            //informamos que la taza se lleno
            System.out.println("La taza se lleno");
            c1.setCantidadActual(c1.getCantidadActual() - taza);
            System.out.println("Cantidad que queda disponible en la cafetera: " + c1.getCantidadActual() + " en la cafetera " + c1.getNombre());
        }
        System.out.println("La cantidad actual de cafe es: " + c1.getCantidadActual() + " en la cafetera " + c1.getNombre());
    }

    /* Método vaciarCafetera(): pone la cantidad de café actual en cero.*/
    public void vaciarCafetera(Cafetera c1) {
        c1.setCantidadActual(0);
        System.out.println("La cantidad actual de cafe es: " + c1.getCantidadActual() + " en la cafetera " + c1.getNombre());
    }

    /*Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/
    public void agregarCafe(Cafetera c1, int qtyCafe) {
        System.out.println("Se solicito ingresar " + qtyCafe + " en la cafetera " + c1.getNombre() + " que actualmente tiene de capacidad maxima " + c1.getCapacidadMaxima());
        //use la capacidad maxima para definir que sucede si la suma de la cantidad de cafe la excede
        if ((c1.getCantidadActual() + qtyCafe) > c1.getCapacidadMaxima()) {
            System.out.println("Lo solicitado excede la cantidad maxima por lo tanto se llenara todo lo posible");
            c1.setCantidadActual(c1.getCapacidadMaxima());
        } else {
            c1.setCantidadActual(c1.getCantidadActual() + qtyCafe);
        }

        System.out.println("La cantidad actual de cafe es: " + c1.getCantidadActual() + " en la cafetera " + c1.getNombre());
    }

}
