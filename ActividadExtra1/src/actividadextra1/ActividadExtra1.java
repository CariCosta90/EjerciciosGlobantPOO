package actividadextra1;

import Entidades.Vehiculo;
import Servicios.VehiculoServicio;

public class ActividadExtra1 {

    public static void main(String[] args) {
        VehiculoServicio vs = new VehiculoServicio();
        int recorrido;

        int mayor=0;
        
        System.out.println("Vehiculo 1");
        Vehiculo v1 = vs.crearVehiculo();
        System.out.println("Vehiculo 2");
        Vehiculo v2 = vs.crearVehiculo();
        System.out.println("Vehiculo 3");
        Vehiculo v3 = vs.crearVehiculo();

        System.out.println("Detalle primer vehiculo");
        recorrido = vs.moverVehiculo(v1);
        vs.frenarVehiculo(v1, recorrido);

        System.out.println("Detalle segundo vehiculo");
        recorrido = vs.moverVehiculo(v2);
        vs.frenarVehiculo(v2, recorrido);

        System.out.println("Detalle tercero vehiculo");
        recorrido = vs.moverVehiculo(v3);
        vs.frenarVehiculo(v3, recorrido);
        
        System.out.println("");

        if (v1.getFrenar() < v2.getFrenar()) {
            mayor = v2.getFrenar();
            System.out.println("El vehiculo que mas avanzo fue el " + v2.getTipo() + " que se movio " + v2.getFrenar() + " m");
        } else if (v2.getFrenar() < v3.getFrenar()) {
            mayor = v3.getFrenar();
            System.out.println("El vehiculo que mas avanzo fue el " + v3.getTipo() + " que se movio " + v3.getFrenar() + " m");

        } else {
            mayor = v1.getFrenar();
            System.out.println("El vehiculo que mas avanzo fue el " + v1.getTipo() + " que se movio " + v1.getFrenar() + " m");
        }

    }

}
