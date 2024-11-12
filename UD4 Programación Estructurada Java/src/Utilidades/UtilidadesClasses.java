package Utilidades;

import java.util.ArrayList;

public class UtilidadesClasses {
        
    public static void mostrarArrayListInt(ArrayList<Integer> array) {
        System.out.print("[ ");
        for (Integer a : array) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    }
    
    public static void mostrarArrayListStr(ArrayList<String> array) {
        System.out.print("[ ");
        for (String a : array) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    }

    public static ArrayList<Integer> mostrarDiferentes(int[] array) {
        ArrayList<Integer> resultado = new ArrayList<>();
        
        for (Integer num : array) {
            if (!resultado.contains(num)) {
                resultado.add(num);
            }
        }
        return resultado;
    }
    
    public static ArrayList<Integer> arrayToArrayListInt(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int a : array) {
            arrayList.add(a);
        }
        
        return arrayList;
    }
    
    public static ArrayList<Integer> mostrarDiferentesMejorado(int[] array) {
        ArrayList<Integer> resultado = new ArrayList<>();
        
        for (int num : array) {
            int i = 0;
            boolean encontrado = false;
            
            for (Integer r : resultado) {
                if (r == num) {
                    encontrado = true;
                    break;
                } else if (r > num) {
                    break;
                } else {
                    i++;
                }
            }
            if (!encontrado) {
                resultado.add(i, num);
            }
        }
        
        return resultado;
    }
}
