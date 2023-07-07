package ejerciciosextra6.servicios;

import ejerciciosextra6.entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*
     Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del 
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra 
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas 
máximas, el valor que ingresó el usuario y encontradas en 0. 
     */
    Ahorcado a1 = new Ahorcado();
    String[] palabraArray = a1.getPalabra();
    int encontradas = a1.getEncontradas();
    //este segundo array es para ir mostrando la palabra encontrada y la posicion de las letras
    String[] letrasEncontradas;

    public Ahorcado crearJuego() {
        System.out.println("Jugador 1: ingresa la palabra secreta");
        String palabra = leer.next();
        //uso palabra.length() para definir el largo de los arrays
        palabraArray = new String[palabra.length()];
        letrasEncontradas = new String[palabra.length()];

        //esta palabra ingresada la convertimos a un string de letras: 
        for (int i = 0; i < palabra.length(); i++) {
            palabraArray[i] = palabra.substring(i, i + 1);
        }

        a1.setPalabra(palabraArray);

        System.out.println("Ingresa la cantidad de vidas que se pueden tener (intentos fallidos)");
        a1.setVidas(leer.nextInt());

        a1.setEncontradas(0);

        return a1;

    }

    /*
     Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: 
buscar como se usa el vector.length. 
     */
    public void longitud() {
        System.out.println("--------------------------------------------");
        System.out.println("Inicia jugador 2");
        System.out.println("El largo de la palabra a ser buscada es de: ");
        System.out.println(a1.getPalabra().length);
    }

    /*
     Método buscar(letra): este método recibe una letra dada por el usuario y busca sila 
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no. 
     */
    public void buscarLetra() {
        while (encontradas < a1.getPalabra().length && a1.getVidas() > 0) {
            System.out.println("-----------------------------");
            System.out.println("Ingresa una letra para buscar");
            String letra = leer.next();

            for (String palabra : a1.getPalabra()) {
                if (letra.equalsIgnoreCase(palabra)) {
                    System.out.println("Has encontrado una letra!");
                    encontradas++;
                    //break;
                }
            }
            a1.setEncontradas(encontradas);
            boolean enc = encontradas(letra);
            intentos(enc);
        }

    }

    /*
     Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre 
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá 
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se 
busque una letra que no esté, se le restará uno a sus oportunidades. 
     */
    public boolean encontradas(String letra) {
        boolean encontrada = false;
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Hasta ahora se van encontrando: " + a1.getEncontradas() + " letras");
        System.out.println("Aun falta encontar " + (a1.getPalabra().length - a1.getEncontradas()) + " letras");

        for (int i = 0; i < a1.getPalabra().length; i++) {
            if (letra.equalsIgnoreCase(a1.getPalabra()[i])) {
                encontrada = true;
                letrasEncontradas[i] = a1.getPalabra()[i];
            }
        }

        //mostramos el array de la palabra encontrada hasta ahora completamos los espacios en blanco con "_"
        System.out.println("La palabra hasta ahora: ");
        for (String letrasEncontrada : letrasEncontradas) {
            if (letrasEncontrada != null) {
                System.out.print(letrasEncontrada);
            } else {
                System.out.print(" _ ");
            }
        }
        System.out.println("");
        return encontrada;
    }

    /*
     Método intentos(): para mostrar cuantas oportunidades le queda al jugador. 
     */
    public void intentos(boolean encontrada) {
        int vidas = a1.getVidas();
        if (!encontrada) {

            System.out.println("Esa letra no se encuentra an la palabra! Haz perdido una vida...");
            vidas -= 1;
        }
        a1.setVidas(vidas);
        System.out.println("-------------------------------------------------");
        System.out.println("Te quedan " + a1.getVidas() + " vidas disponibles");
    }

    /*
     Método juego(): el método juego se encargará de llamar todos los métodos 
previamente mencionados e informará cuando el usuario descubra toda la palabra o 
se quede sin intentos. Este método se llamará en el main. 
     */
    public void juego() {
        crearJuego();
        longitud();
        buscarLetra();

        if (a1.getEncontradas() == a1.getPalabra().length) {
            System.out.println("Has encontrado la palabra!");
        }
        if (a1.getVidas() == 0) {
            System.out.println("Te haz quedado sin vidas!");
        }

    }

}
