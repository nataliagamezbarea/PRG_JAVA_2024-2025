package ACT4_6;

import Utilidades.*;
import java.util.Scanner;

public class ACT4_6_1 {

    static final int SIMBOLO_GUSANO = 1;
    static int accion;

    public static void main(String[] args) {

        // Crear una matriz
        final int NTABLERO = UtilidadesConsola.leerEntero("Introduce el tamaño del tablero: ");
        final int NHOJAS = UtilidadesConsola.leerEntero("Introduce el número de hojas: ");

        int[][] tablero = UtilidadesMatrices.generaMatriz(NTABLERO, 0, 0);
        int[] gusano = UtilidadesArrays.generaArray(2, 0, tablero.length - 1);

        UtilidadesArrays.muestraArray(gusano);

        rellenarTablero(tablero, gusano);
        UtilidadesMatrices.mostrarMatriz(tablero);

        do {
            accion = UtilidadesConsola.leerEntero("Introduce una acción: 8 - Subir , 2 - Bajar , 4 - Izquierda , 6 - Derecha");

            tablero[gusano[0]][gusano[1]] = 0;

            if (accion == 8 && gusano[0] > 0) {           // Arriba si la fila del gustano no está en la 0
                gusano[0]--;
            } 
            else if (accion == 2 && gusano[0] < tablero.length - 1) { //Bajar si no está en la última fila del tablero (se resta uno porque se empieza de 0).
                gusano[0]++;
            } else if (accion == 4 && gusano[1] > 0) {     // Izquierda si la columna del gusano no está en 0
                gusano[1]--;
            } else if (accion == 6 && gusano[1] < tablero[0].length - 1) { // Derecha si no está en la última columna del tablero
                gusano[1]++;
            }

            tablero[gusano[0]][gusano[1]] = SIMBOLO_GUSANO;

            UtilidadesMatrices.mostrarMatriz(tablero);

        } while (accion != -1);
    }

    public static void rellenarTablero(int[][] tablero, int[] gusano) {
        tablero[gusano[0]][gusano[1]] = SIMBOLO_GUSANO;
    }
}
