package ACT4_4;
import java.util.ArrayList;
import Utilidades.UtilidadesArrays;
import Utilidades.UtilidadesClasses;

public class ACT4_4_02 {

    public static void main(String[] args) {
        int[] array = UtilidadesArrays.generaArray(25, 0, 10);
        ArrayList<Integer> resultat = new ArrayList<>();
        
        UtilidadesArrays.muestraArray(array);
        resultat = UtilidadesClasses.mostrarDiferentes(array);
        UtilidadesClasses.mostrarArrayListInt(resultat);
    }
}
