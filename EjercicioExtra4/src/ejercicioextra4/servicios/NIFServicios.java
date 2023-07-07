
package ejercicioextra4.servicios;

/*
 Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:

POSICIÓN LETRA

0 T
1 R
2 W
3 A
4 G
5 M
6 Y
7 F
8 P
9 D
10 X
11 B
12 N
13 J
14 Z
15 S
16 Q
17 V
18 H
19 L
20 C
21 K
22 E
*/

import ejercicioextra4.entidades.NIF;
import java.util.Scanner;

public class NIFServicios {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    String[] verificador = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    /*
     Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
    */
    
    NIF n1 = new NIF();
    
    public NIF crearNif(){
        System.out.println("Ingresa el numero de DNI");
        n1.setDNI(leer.nextLong());
        
        return n1;
    }
    
    /*
     Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). 
    */
    
    public void mostrar(){
        //calcular la letra se divide el DNI entre 23 
        long posicion = n1.getDNI()%23;
        System.out.println(posicion);

        //Buscamos la letra que corresponde a la posicion en el array creado
        for(int i=0; i<verificador.length; i++){
            if(i==posicion){
                n1.setLetra(verificador[i]);
                System.out.println(n1.getLetra());
            }
        }
        
        System.out.println("El NIF es: ");
        System.out.println(n1.getDNI()+"-"+n1.getLetra());
    }
    
}
