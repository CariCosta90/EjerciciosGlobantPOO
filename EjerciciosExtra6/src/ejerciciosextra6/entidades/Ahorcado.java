
package ejerciciosextra6.entidades;

/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener 
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la 
cantidad jugadas máximas que puede realizar el usuario. 
*/


public class Ahorcado {
    //atributos 
    private String[] palabra;
    private int encontradas;
    private int vidas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int encontradas, int vidas) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.vidas = vidas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", encontradas=" + encontradas + ", vidas=" + vidas + '}';
    }
    
    
    
    
}
