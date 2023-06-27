package ejercicio9.servicios;

import ejercicio9.entidades.Matematica;

/*
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class MatematicaServicios {

    //Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public void devolverMayor(Matematica mat) {

       

        if (mat.getNum1() > mat.getNum2()) {
            mat.setMayor(mat.getNum1());
            mat.setMenor(mat.getNum2());
        } else if (mat.getNum2() > mat.getNum1()) {
            mat.setMayor(mat.getNum2());
            mat.setMenor(mat.getNum1());
        } else {
            System.out.println("Los valores son iguales");
            mat.setMayor(mat.getNum1());
            mat.setMenor(mat.getNum1());
        }
            System.out.println("El mayor de ambos numeros es: " + mat.getMayor());           
    }
    /*
    Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
    */
    
    public void calcularPotencia(Matematica mat){
        
        double potenciado = Math.pow(mat.getMayor(), mat.getMenor());
        
        System.out.println("El resultado de calcular la potencia del mayor valor de la clase elevado al menor número es de: " + potenciado);
    }
    
    /*
    Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    */
    
    public void calculaRaiz(Matematica mat){
        //obtengo el valor absoluto usando el metodo abs de la clase Math
        double menor = Math.abs(mat.getMenor());
        
        double raiz = Math.sqrt(menor);
        
        System.out.println("La raiz cuadrada del menor valor es: "  + raiz);
        
    }

}
