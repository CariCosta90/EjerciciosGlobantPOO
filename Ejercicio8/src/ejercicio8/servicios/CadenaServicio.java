package ejercicio8.servicios;

/*
Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
import ejercicio8.entidades.Cadena;
import static java.lang.Character.toLowerCase;
import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Metodo crear objeto 
    public Cadena crearCadena() {
        Cadena c1 = new Cadena();

        System.out.println("Ingresa la frase");
        String frase = leer.next();

        c1.setComoString(frase);

        // c1.setFrase(leer.next());
        c1.setLongitudFrase(frase.length());

        //creo un vector con tipo char para poder completar las letras de la frase ingresada
        char[] fraseVector = new char[c1.getLongitudFrase()];

        for (int i = 0; i < c1.getLongitudFrase(); i++) {
            fraseVector[i] = frase.charAt(i);
        }

        //imprimir el vector para probar 
        for (int i = 0; i < c1.getLongitudFrase(); i++) {
            System.out.print(fraseVector[i]);
        }

        c1.setFrase(fraseVector);

        System.out.println("");

        return c1;

    }

    //a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public void mostrarVocales(Cadena c1) {

        int longitud = c1.getLongitudFrase();
        char letra;
        int contVocales = 0;

        for (int i = 0; i < longitud; i++) {
            letra = toLowerCase(c1.getFrase()[i]);

            switch (letra) {
                case 'a':
                    contVocales++;
                    break;
                case 'e':
                    contVocales++;
                    break;
                case 'i':
                    contVocales++;
                    break;
                case 'o':
                    contVocales++;
                    break;
                case 'u':
                    contVocales++;
                    break;
            }

        }
        System.out.println("La cantidad de vocales en la frase '" + c1.getComoString() + "' es de: " + contVocales);

    }

    /*
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     */
    public void invertirFrase(Cadena c1) {

        char[] fraseInvertida = new char[c1.getLongitudFrase()];
        int longFrase = c1.getLongitudFrase();

        //populamos un nuevo array fraseInvertida dando vuelta la frase traida del objeto Cadena
        for (int i = 0; i < longFrase; i++) {
            fraseInvertida[i] = c1.getFrase()[c1.getLongitudFrase() - 1 - i];
        }
        System.out.println("La frase invertida queda: ");

        for (int i = 0; i < c1.getLongitudFrase(); i++) {
            System.out.print(fraseInvertida[i]);
        }
        System.out.println("");
    }

    /*
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     */
    public void vecesRepetido(Cadena c1, String letra) {

        String frase = c1.getComoString();
        int contador = 0;

        for (int i = 0; i < c1.getLongitudFrase(); i++) {

            if (frase.substring(i, i + 1).equalsIgnoreCase(letra)) {

                contador++;
            }

        }

        System.out.println("Las veces que aparece el caracter '" + letra + "' en la frase es: " + contador);
    }

    /*
    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    compone la clase con otra nueva frase ingresada por el usuario.
     */
    public void comprarLongitud(Cadena c1, String frase) {

        int longitudFrase1 = c1.getLongitudFrase();
        int longitudFrase2 = frase.length();

        if (longitudFrase1 == longitudFrase2) {
            System.out.println("Las frases tienen el mismo largo " + longitudFrase1 + " caracteres");
        } else {
            System.out.println("Las frases no tienen el mismo largo");
        }

    }

    /*
    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    con una nueva frase ingresada por el usuario y mostrar la frase resultante.
     */
    public void unirFrases(Cadena c1, String frase) {
        System.out.println("Las frases concatenadas son: ");
        System.out.println(c1.getComoString() + " " + frase);
    }

    /*
    g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
    la frase resultante.
     */
    public void reemplazar(Cadena c1, String letra) {

        for (int i = 0; i < c1.getLongitudFrase(); i++) {
            if (c1.getComoString().substring(i, i + 1).equalsIgnoreCase("a")) {
                System.out.print(letra);
            } else {
                System.out.print(c1.getComoString().substring(i, i + 1));
            }
        }

        System.out.println("");
    }

    /*
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
    public boolean contiene(Cadena c1, String letra) {

        boolean contiene = false;

        for (int i = 0; i < c1.getLongitudFrase(); i++) {

            if (c1.getComoString().substring(i, i + 1).equalsIgnoreCase(letra)) {
                contiene = true;

            }
        }
        return contiene;
    }

}
