package ACT4_0;

import java.util.Scanner;

public class ACT4_0_1 {

    public static void main(String[] args) {
        int numElementos, min, max, total, suma;
        int[][] matriz;
        float mediana;

        numElementos = LeerElementos("Introduce el número de elementos de la matriz: ");

        matriz = new int[numElementos][numElementos];

        matriz = LeerMatriz(matriz);

        MostrarMatriz(matriz);

        min = CalcularMin(matriz);

        max = CalcularMax(matriz);

        mediana = CalcularMedia(matriz);

        MostrarResultados(min, max, mediana);
    }

    public static int LeerElementos(String texto) {
        Scanner scanner = new Scanner(System.in);
        int medida;
        System.out.print(texto);
        medida = scanner.nextInt();
        return medida;
    }

    public static int[][] LeerMatriz(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    public static void MostrarMatriz(int[][] matriz) {
        System.out.println("La matriz es:");
        for (int[] array : matriz) {
            for (int valor : array) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static int CalcularMin(int[][] matriz) {
        int min = matriz[0][0];

        for (int[] array : matriz) {
            for (int valor : array) {
                if (valor < min) {
                    min = valor;
                }
            }
        }

        return min;
    }

    public static int CalcularMax(int[][] matriz) {
        int max = matriz[0][0];

        for (int[] array : matriz) {
            for (int valor : array) {
                if (valor > max) {
                    max = valor;
                }
            }
        }

        return max;
    }

    public static float CalcularMedia(int[][] matriz) {
        int total = 0;
        int suma = 0;

        for (int[] array : matriz) {
            for (int valor : array) {
                suma += valor;
                total++;
            }
        }
        return (float) suma / total;
    }

    public static void MostrarResultados(int min, int max, float mediana) {
        System.out.println("Los resultados son:");
        System.out.println("\tMáximo: " + max);
        System.out.println("\tMínimo: " + min);
        System.out.println("\tMedia: " + mediana);
    }
}
