package ejercicio8.entidades;

import java.util.Arrays;

/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. 
 */
public class Cadena {
    //atributos

    private char[] frase;
    private int longitudFrase; // con el setter se va a defirnir con length
    private String comoString;
    

    //constructor vacio
    public Cadena() {
    }
    //constructor con atributos

    public Cadena(char[] frase, int longitudFrase, String comoString) {
        this.frase = frase;
        this.longitudFrase = longitudFrase;
        this.comoString = comoString;
    }

    //setters
    public void setFrase(char[] frase) {
        this.frase = frase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }

    public void setComoString(String comoString) {
        this.comoString = comoString;
    }
    
    

    //getter
    public char[] getFrase() {
        return frase;
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public String getComoString() {
        return comoString;
    }
    
    

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + Arrays.toString(frase) + '}';
    }
    
    

}
