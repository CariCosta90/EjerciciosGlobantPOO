package ejercicio12.servicios;

/*
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
import ejercicio12.entidades.Persona;
import java.util.Scanner;
import java.util.Date;

public class PersonaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*
     Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
     */
    public Persona crearPersona() {
        Persona p1 = new Persona();

        int dia;
        int mes;
        int anio;

        System.out.println("Ingresa el nombre de la persona");
        p1.setNombre(leer.next());
        System.out.println("Ingresa la fecha de nacimiento, iniciando con el dia");
        dia = leer.nextInt();
        System.out.println("Ingresa ahora el mes");
        mes = leer.nextInt() - 1;
        System.out.println("Ingresa el anio");
        anio = leer.nextInt() - 1900;

        Date nacimiento = new Date(anio, mes, dia);

        p1.setNacimiento(nacimiento);

        return p1;

    }

    /*
     Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
     */
    public int calcularEdad(Persona p1) {

        Date hoy = new Date();
        int mesNacimiento = p1.getNacimiento().getMonth();
        int mesHoy = hoy.getMonth();
        int diaNacimiento = p1.getNacimiento().getDay();
        int diaHoy = hoy.getDay();
        int anioNacimiento = p1.getNacimiento().getYear();
        int anioHoy = hoy.getYear();
        int edad;

        //el if lo hago para contemplar la posibilidad de que aun no haya sido su cumpleanios este anio 
        if (mesHoy >= mesNacimiento && diaHoy >= diaNacimiento) {
            edad = anioHoy - anioNacimiento;

        } else {
            edad = (anioHoy - anioNacimiento) - 1;
        }

        System.out.println("La edad de la persona al dia de hoy es: " + edad);
        p1.setEdad(edad);
        return edad;
    }

    /*
     Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
     */
    public boolean menorQue(Persona p1, int edad) {

        boolean menor = false;

        if (edad >= p1.getEdad()) {
            menor = true;
        }

        return menor;

    }
    /*
     Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
    
    */
    
    public void mostrarPersona(Persona p1){
        System.out.println("La persona ingresada es: ");
        System.out.println(p1.toString());
    }
    
}
