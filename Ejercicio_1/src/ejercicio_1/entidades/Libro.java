
package ejercicio_1.entidades;


public class Libro {
    //declaracion de atributos
    private int isbn;
    private String titulo;
    private String autor;
    private int qtyPags;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int qtyPags) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.qtyPags = qtyPags;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getQtyPags() {
        return qtyPags;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setQtyPags(int qtyPags) {
        this.qtyPags = qtyPags;
    }
    
    
    
    
}
