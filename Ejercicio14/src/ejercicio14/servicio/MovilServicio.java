
package ejercicio14.servicio;
/*
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
*/

import ejercicio14.entidades.Movil;
import java.util.Scanner;
public class MovilServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
   /* 
     Método cargarCelular(): se solicita al usuario que ingrese 
    los datos necesarios para
    instanciar un objeto Celular y poder cargarlo en nuestro programa.
    */
    
    
    public Movil cargarCelular(){
        Movil m1 = new Movil();
        
        System.out.println("Ingresa un nuevo Celular");
        System.out.println("Ingresa la marca");
        m1.setModelo(leer.next());
        System.out.println("Ingresa el precio");
        m1.setPrecio(leer.nextInt());
        System.out.println("Ingresa el modelo");
        m1.setModelo(leer.next());
        System.out.println("Ingresa la memora Ram en GB");
        m1.setMemoriaRam(leer.nextInt());
        System.out.println("Ingresa el almacenamiento");
        m1.setAlmacenamiento(leer.nextInt());        
        
        return m1;
    }
    
    /*
     Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
    */
    
    public void ingresarCodigo(Movil m1){
        
        int[] codigo = new int[7];
        
        for (int i = 0; i < codigo.length; i++) {
            System.out.println("Ingresa el codigo del celular " + (i+1));
            codigo[i] = leer.nextInt();
        }
        
        m1.setCodigo(codigo);
        
        System.out.println("La lista de los codigos es: ");
        
        for (int i = 0; i < m1.getCodigo().length; i++) {
            System.out.print("["+m1.getCodigo()[i]+"]");
        }
        System.out.println("");
    }
}
