package ACT4_4;
import java.util.ArrayList;
import Utilidades.UtilidadesArrays;
import Utilidades.UtilidadesClasses;

public class ACT4_4_03 {

    public static void main(String[] args) {
        int[] array = UtilidadesArrays.generaArray(25, 0, 3);
        ArrayList<Integer> resultat = new ArrayList<>();
        
        UtilidadesArrays.muestraArray(array);
        resultat = UtilidadesClasses.mostrarDiferentesMejorado(array);
        UtilidadesClasses.mostrarArrayListInt(resultat);
    }
}
