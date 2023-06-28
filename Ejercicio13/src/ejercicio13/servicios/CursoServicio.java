package ejercicio13.servicios;

import ejercicio13.entidades.Curso;
import java.util.Scanner;

/*
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
public class CursoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*
     método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
     */
    public void cargarAlumnos(Curso c1) {

        String[] alumnos = new String[5];

        System.out.println("Ingresa el listado de alumnos (5)");

        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = leer.next();
        }
         
        System.out.println("El listado de alumnos es: ");

        for (String alumno : alumnos) {
            System.out.print("[" + alumno + "]");
        }

        c1.setAlumnos(alumnos);
    }
    
    /*
     Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
    */

    public Curso crearCurso() {
        Curso c1 = new Curso();

        System.out.println("Carguemos un curso");
        System.out.println("------------------");
        System.out.println("");
        System.out.println("Ingresa el nombre del curso");
        c1.setNombreCurso(leer.next());
        System.out.println("ngresa la cantidad de horas diaras que lleva el curso");
        c1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ibngresa la cantidad de dias por semana");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Selecciona el turno del curso, este puede solo ser manana o tarde");
        String turno = leer.next();
        
        while(!turno.equalsIgnoreCase("manana") && !turno.equalsIgnoreCase("tarde")){
            System.out.println("El valor ingresado no es correcto, ingresa nuevamente el turno");
            turno = leer.next();
        }
        
        c1.setTurno(turno);
        
        System.out.println("Ingresa el precio del curso por hora");
        c1.setPrecioPorHora(leer.nextDouble());
        
        cargarAlumnos(c1);
        
        return c1;
    }
    
    /*
     Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
    */
    
    public void calcularGananciaSemanal(Curso c1){
        double precioPorHora = c1.getPrecioPorHora();
        double horasPorDia = (double) c1.getCantidadHorasPorDia();
        double diasPorSemana = (double) c1.getCantidadDiasPorSemana();
        
        //calculo del precio semanal por alumno
        double gananciaSemanal = ((precioPorHora*horasPorDia)*diasPorSemana)*5;
        
        System.out.println("La ganancia semanal de este curso es de: $" + gananciaSemanal);
        
                
    }
}
