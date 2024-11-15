package ACT4_6;

import Utilidades.*;

public class ACT4_6_1_2 {

    static int[] gusano;
    static int[][] tablero, hojas;
    static int SÍMBOLOGUSANO = 1;
    static int SÍMBOLOHOJA = 9;
    static int NTABLERO;
    static int NHOJAS;
    static int accion, nAleatorioFila, nAleatorioColumna, contadorHojas;

    public static void main(String[] args) {
        leerTableroHojas();
        arraysTableroGusano();
        rellenarTablero(tablero, gusano);
        generarHojas();
        UtilidadesMatrices.mostrarMatriz(tablero);
        realizarAcciones(gusano, tablero);
    }

    public static void leerTableroHojas() {
        NTABLERO = UtilidadesConsola.leerEntero("Introduce la medida del tablero: ");
        NHOJAS = UtilidadesConsola.leerEntero("Introduce la cantidad de hojas: ");

    }

    public static void arraysTableroGusano() {
        tablero = UtilidadesMatrices.generaMatriz(NTABLERO, 0, 0);
        gusano = UtilidadesArrays.generaArray(2, 0, tablero.length - 1);
    }

    public static void rellenarTablero(int[][] tablero, int[] gusano) {
        tablero[gusano[0]][gusano[1]] = SÍMBOLOGUSANO;
    }

    public static int realizarAcciones(int[] gusano, int[][] tablero) {
        do {
            accion = UtilidadesConsola.leerEntero("Introduzca la acción que desea realizar: 8 - Arriba , 2 - Abajo , 4 - Izquierda , 6 - Derecha ");
            tablero[gusano[0]][gusano[1]] = 0;// Mueva el gusano hay que resetear su posición
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
            comprobarHojasActualizadas();

            UtilidadesMatrices.mostrarMatriz(tablero);

        } while (accion != 0);
        return 0;
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

    public static void generarHojas() {
        tablero[gusano[0]][gusano[1]] = SÍMBOLOGUSANO;
        for (int i = 0; i <= NHOJAS - 1; i++) {
            int nAleatorioFila = (int) (Math.random() * tablero.length - 1);
            int nAleatorioColumna = (int) (Math.random() * tablero.length - 1);

            tablero[nAleatorioFila][nAleatorioColumna] = SÍMBOLOHOJA;
        }

    }

    public static void comprobarHojasActualizadas() {
        contadorHojas = 0;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == SÍMBOLOHOJA) {
                    contadorHojas++;
                }
            }
        }

        if (contadorHojas != NHOJAS) {
            tablero[gusano[0]][gusano[1]] = SÍMBOLOGUSANO;
            nAleatorioFila = (int) (Math.random() * tablero.length - 1);
            nAleatorioColumna = (int) (Math.random() * tablero.length - 1);
            tablero[nAleatorioFila][nAleatorioColumna] = SÍMBOLOHOJA;
        }

    }
}


