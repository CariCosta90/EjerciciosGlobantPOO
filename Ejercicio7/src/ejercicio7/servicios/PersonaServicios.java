package ejercicio7.servicios;

import ejercicio7.entidades.Persona;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/*
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
 */
public class PersonaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona p1 = new Persona();

        /*private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura; */
        System.out.println("Ingresa Nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingresa Edad");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingresa Peso");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingresa Altura");
        p1.setAltura(leer.nextDouble());

        System.out.println("Ingresa Sexo, H, M u O");
        String sexo = toUpperCase(leer.next());
        System.out.println("sexo " + sexo);

        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
            System.out.println("EL valor ingresado no es valido, debes seleccionar H, M u O");
            sexo = toUpperCase(leer.next());
        }
        p1.setSexo(sexo);
        
        System.out.println("Ingresa el valor del indice progresivamente");
        p1.setIndice(leer.nextInt());

        return p1;
    }

    /*
    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
     */
    public int calcularIMC(Persona p1) {

        double imc = p1.getPeso() / Math.pow(p1.getAltura(), 2);
        System.out.println("El imc es: " + imc);

        if (imc < 20) {
            System.out.println("La persona esta por debajo del peso ideal");
            return -1;
        } else if (imc >= 20 && imc < +25) {
            System.out.println("La persona esta en el peso ideal");
            return 0;
        } else {
            System.out.println("La persona tiene sobrepeso");
            return 1;
        }

    }

    /*
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
     */
    public boolean esMayorDeEdad(Persona p1) {

        if (p1.getEdad() >= 18) {
            System.out.println(p1.getNombre() + " es mayor de edad");
            return true;
        } else {
            System.out.println(p1.getNombre() + " es menor de edad");

            return false;
        }
    }
}
