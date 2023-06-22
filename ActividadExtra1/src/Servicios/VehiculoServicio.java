package Servicios;

import Entidades.Vehiculo;

import java.util.Scanner;

public class VehiculoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Vehiculo crearVehiculo() {

        Vehiculo v1 = new Vehiculo();
        System.out.println("Ingresa la marca del Vehiculo");
        v1.setMarca(leer.next());
        System.out.println("Ingresa modelo del vehiculo");
        v1.setModelo(leer.next());
        System.out.println("Ingresa el anio");
        v1.setAnio(leer.nextInt());
        System.out.println("Ingresa el tipo de vehiculo");
        v1.setTipo(leer.next().toLowerCase());

        return v1;
    }

    public int moverVehiculo(Vehiculo v1) {
        int segundos;
        System.out.println("Ingresa el tiempo que se mueve el vehiculo");
        segundos = leer.nextInt();

        int recorrido;
        recorrido = 0;

        switch (v1.getTipo()) {
            case "auto":
                recorrido = segundos * 3;
                System.out.println("El Vehiculo " + v1.getTipo() + " avanzara: " + recorrido + " m");
                break;
            case "moto":
                recorrido = segundos * 2;
                System.out.println("El Vehiculo " + v1.getTipo() + " avanzara: " + recorrido + " m");
                break;
            case "bici":
                recorrido = segundos;
                System.out.println("El Vehiculo " + v1.getTipo() + " avanzara: " + recorrido + " m");
                break;
            default:
                System.out.println("El tipo de vehiculo no es correcto");
                break;
        }

        return recorrido;
    }

    public void frenarVehiculo(Vehiculo v1, int recorrido) {
        int frenada;

        if (v1.getTipo().equals("bici")) {
            frenada = recorrido;
        } else {
            frenada = recorrido + 2;
        }

        System.out.println("El vehiculo se dentendra a los: " + frenada + " m");
        v1.setFrenar(frenada);

    }

}
