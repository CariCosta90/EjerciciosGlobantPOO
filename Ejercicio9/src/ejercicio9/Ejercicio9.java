package ejercicio9;

import ejercicio9.entidades.Matematica;
import ejercicio9.servicios.MatematicaServicios;

/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class Ejercicio9 {
    
    public static void main(String[] args) {
        /*
        En el main se creará el objeto y se usará el
    Math.random para generar los dos números y se guardaran en el objeto con su
    respectivos set.
         */
        
        Matematica mat = new Matematica();
        
        double num1 = Math.floor(Math.random() * 11);
        double num2 = Math.floor(Math.random() * 11);
        
        mat.setNum1(num1);
        mat.setNum2(num2);
        
        System.out.println(mat.toString());
        
        System.out.println("Se estara operando con los valores: " + num1 + " y " + num2);
        
        MatematicaServicios ms = new MatematicaServicios();
        
        ms.devolverMayor(mat);
        ms.calcularPotencia(mat);
        ms.calculaRaiz(mat);
        
    }
    
}
