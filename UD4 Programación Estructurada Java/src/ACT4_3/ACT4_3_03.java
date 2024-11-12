package ACT4_3;

import Utilidades.UtilidadesConsola;

public class ACT4_3_03 {
    public static void main(String[] args) {
        String[] opciones = {"Primera opción", "Segunda opción", "Tercera opción"};
        int opcion;
        
        do {
            opcion = UtilidadesConsola.gestionarMenu("Menú de pruebas", opciones, "Elija una opción (0 para salir): ");
            System.out.println(opcion);
        } while (opcion != 0);
    }
}
