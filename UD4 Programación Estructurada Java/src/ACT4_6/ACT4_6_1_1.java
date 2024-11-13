package ACT4_6;

import Utilidades.*;

public class ACT4_6_1_1 {

    static int[] gusano;
    static int[][] tablero;
    static int SÍMBOLOGUSANO = 1;
    static int accion;

    public static void main(String[] args) {

        final int NTABLERO = UtilidadesConsola.leerEntero("Introduce la medida del tablero: ");
        final int NHOJAS = UtilidadesConsola.leerEntero("Introduce el nº de hojas que desea ");

        tablero = UtilidadesMatrices.generaMatriz(NTABLERO, 0, 0);
        gusano = UtilidadesArrays.generaArray(2, 0, tablero.length - 1);

        rellenarTablero(tablero, gusano);
        UtilidadesMatrices.mostrarMatriz(tablero);
        realizarAcciones(gusano, tablero);
    }
    
    public static int realizarAcciones(int [] gusano , int [][] tablero) {
          do {
            accion = UtilidadesConsola.leerEntero("Introduzca la acción que desea realizar: 8 - Arriba , 2 - Abajo , 4 - Izquierda , 6 - Derecha ");
            tablero[gusano[0]][gusano[1]] = 0;
              switch (accion) {
                  case 8 -> {
                      if (gusano[0] > 0) {
                          gusano[0]--;
                      } else {
                          gusanoenTablero(0, "fila", "suma");
                          //gusano[0]+= tablero.length - 1;
                      }
                  }
                  case 2 -> {
                      if (gusano[0] < tablero.length - 1) {
                          gusano[0]++;
                      } else {
                          gusanoenTablero(0, "fila", "resta");
                          //gusano[0] -= tablero.length - 1;
                      }
                  }
                  case 4 -> {
                      if (gusano[1] > 0) {
                          gusano[1]--;
                      } else {
                          gusanoenTablero(1, "columna", "suma");
                          //gusano[1] += tablero[0].length - 1;
                      }
                  }
                  default -> {
                      if (gusano[1] < tablero[0].length - 1) {
                          gusano[1]++;
                      } else {
                          gusanoenTablero(1, "columna", "resta");
                          //gusano[1] -= tablero[0].length - 1;
                      }
                  }
              }

            rellenarTablero(tablero, gusano);
            UtilidadesMatrices.mostrarMatriz(tablero);

        } while (accion != 0);
        return 0;
    }

    public static void rellenarTablero(int[][] tablero, int[] gusano) {
        tablero[gusano[0]][gusano[1]] = SÍMBOLOGUSANO;
    }

    /**
     * Hacer que el gusano solo se mueva en el tablero.
     *
     * @param mensaje int posicion, String opcion, String operacion
     * @return posicion : fila 0 || columna 1 . opcion: "fila" || "columna" .
     * operación: "suma" || "resta"
     */
    public static void gusanoenTablero(int posicion, String opcion, String operacion) {

        if ("fila".equals(opcion)) {
            if ("suma".equals(operacion)) {
                gusano[posicion] += tablero[0].length - 1;
            } else {
                gusano[posicion] -= tablero[0].length - 1;
            }
        } else if ("columna".equals(opcion)) {
            if ("suma".equals(operacion)) {
                gusano[posicion] += tablero[0].length - 1;
            } else {
                gusano[posicion] -= tablero[0].length - 1;
            }
        }

    }

}
