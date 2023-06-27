
package ejercicio10.servicios;

import ejercicio10.entidades.Arreglo;
import java.util.Arrays;


public class ArregloServicio {
    
    //Crear arreglo
    
    public Arreglo crearArreglo(int tamano){
        Arreglo arr = new Arreglo();
        arr.setTamano(tamano);
        arr.setArreglo(new double[arr.getTamano()]);
                
        return arr;        
    }
    
    //Primera opcion de uso popular el arreglo con valores aleatorios
    
    public void arregloAleatorio(Arreglo a1){
        //for para popular con numeros random
        double[] arregloA = a1.getArreglo();
        
        for (int i = 0; i < a1.getTamano(); i++) {
            arregloA[i] = Math.floor(Math.random()*11);
        }
        
        //for para mostrar el arreglo
        System.out.println("Arreglo A creado aleatorio");
        for (int i = 0; i < a1.getTamano(); i++) {
            System.out.print("["+arregloA[i]+"]");
        }
        
    }
    
    //funcion para ordenar arreglo de menor a mayor
    
    public void ordenarArreglo(Arreglo a1){
        Arrays.sort(a1.getArreglo());
        
        //hacemos un nuevo for para mostrar el nuevo arreglo ya ordenado
        System.out.println("arreglo A ordenado");
        for (int i = 0; i < a1.getTamano(); i++) {
            System.out.print("["+a1.getArreglo()[i]+"]");
        }
        
    }
    
    //tercera funcion para crear el arreglo B que la mitad es populada con valores de el arreglo A y la otra mitad con 0.5\
    
    public void arregloMitadMitad(Arreglo a1, Arreglo b1){
        
        int medio = b1.getTamano()/2;
        double[] arregloB = b1.getArreglo();
        double[] arregloA = a1.getArreglo();
        
        System.out.println(medio);
        //primera mitad completada con array A
        for (int i = 0; i < medio; i++) {
           arregloB[i] = arregloA[i];
        }
        for (int i = medio; i < b1.getTamano(); i++) {
            arregloB[i] = 0.5;
        }
                
        b1.setArreglo(arregloB);
        
        //mostramos el arreglo creado
        for (int i = 0; i < b1.getTamano(); i++) {
            System.out.print("["+b1.getArreglo()[i]+"]");
        }
        
    }
    
    

}
