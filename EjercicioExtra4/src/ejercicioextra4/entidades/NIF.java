
package ejercicioextra4.entidades;


public class NIF {
    //atributos
    private long DNI; 
    private String letra;
    
    //constructores

    public NIF() {
    }

    public NIF(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }
    //Getter y setter 

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
}
