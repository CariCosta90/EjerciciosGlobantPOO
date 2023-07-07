package ejercicioextra5;

/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
import java.util.Scanner;

public class EjercicioExtra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //declaramos el array con los meses

        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        // declaramos mesSecreto (mayo)
        String mesSecreto = mes[4];

        //solicitamos al usuario que intente adivinar el mes
        System.out.println("Intenta adivina el mes secreto!");

        String respuesta = leer.next();
        
        while(noAcierta(respuesta, mes, mesSecreto)){
            System.out.println("No ha acertado! intente adivinarlo introduciendo otro mes");
            respuesta = leer.next();
        }
        
        System.out.println("Ha acertado!");

    }
    
    public static boolean noAcierta(String respuesta, String[] mes, String mesSecreto){
        boolean noAcierta = true;
        for (int i = 0; i < mes.length; i++) {
            if(respuesta.equalsIgnoreCase(mesSecreto)){
                noAcierta = false;
            }
        }
        
        return noAcierta;
    }

}
