
package ejercicio12.entidades;

import java.util.Date;

/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set

*/


public class Persona {
    private String nombre;
    private Date nacimiento;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, Date nacimiento, int edad) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }


    public int getEdad() {
        return edad;
    }
        public void setEdad(int edad) {
        this.edad = edad;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nacimiento=" + nacimiento + ", edad=" + edad + '}';
    }

  
    
    
    
    
}
