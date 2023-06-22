package ejercicio7;

import ejercicio7.entidades.Persona;
import ejercicio7.servicios.PersonaServicios;

/*
        Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        PersonaServicios ps = new PersonaServicios();

        /*
       Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
         */
        Persona p1 = new Persona("Pepe", 86, "H", 120, 1.83, 1);
        Persona p2 = new Persona("Josefa", 25, "O", 54, 1.64, 2);
        Persona p3 = new Persona("Marcela", 15, "M", 40, 1.60, 3);
        Persona p4 = new Persona("Roberto", 62, "H", 98, 1.72, 4);

        int contBajoPeso = 0;
        int contPesoIdeal = 0;
        int contSobrepeso = 0;
        int contMayor = 0;
        int contMenor = 0;

        double p1Imc = ps.calcularIMC(p1);
        if (p1Imc == -1) {
            contBajoPeso++;
        } else if (p1Imc == 0) {
            contPesoIdeal++;
        } else {
            contSobrepeso++;
        }
        double p2Imc = ps.calcularIMC(p2);
        if (p2Imc == -1) {
            contBajoPeso++;
        } else if (p2Imc == 0) {
            contPesoIdeal++;
        } else {
            contSobrepeso++;
        }
        double p3Imc = ps.calcularIMC(p3);
        if (p3Imc == -1) {
            contBajoPeso++;
        } else if (p3Imc == 0) {
            contPesoIdeal++;
        } else {
            contSobrepeso++;
        }
        double p4Imc = ps.calcularIMC(p4);
        if (p4Imc == -1) {
            contBajoPeso++;
        } else if (p4Imc == 0) {
            contPesoIdeal++;
        } else {
            contSobrepeso++;
        }

        boolean p1mayor = ps.esMayorDeEdad(p1);
        if(p1mayor){
            contMayor++;
        }else{
            contMenor++;
        }
        boolean p2mayor = ps.esMayorDeEdad(p2);
        if(p2mayor){
            contMayor++;
        }else{
            contMenor++;
        }
        boolean p3mayor = ps.esMayorDeEdad(p3);
        if(p3mayor){
            contMayor++;
        }else{
            contMenor++;
        }
        boolean p4mayor = ps.esMayorDeEdad(p4);
        if(p4mayor){
            contMayor++;
        }else{
            contMenor++;
        }
        
       
        System.out.println("El porcentaje de personas con bajo peso es de %" + (contBajoPeso*100)/4);
        System.out.println("El porcentaje de personas con peso justo es de %"+(contPesoIdeal*100)/4);
        System.out.println("El porcentaje de personas con sobrepeso es de %"+(contSobrepeso*100)/4);
        System.out.println("El porcentaje de personas mayor de edad es de %"+(contMayor*100)/4);
        System.out.println("El porcentaje de personas menor de edad es de %"+(contMenor*100)/4);

    }

}
