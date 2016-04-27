/**
 * Created by linux on 27/04/16.
 */
import com.esliceu.sort.Sort;
import java.util.Arrays;

public class Ordena {
    public static void main(String[] args) {
        Sort s = new Sort();
        //PROVA ALEATORIA
        //Para comprobar que devuelve el resultado correcto
        // Expected: 30,20,10 Resultat: 30,20,10 -- CORRECTO
        int[] ar = new int[]{30, 20, 10};
        System.out.println(Arrays.toString(s.SelectionSort(ar)));
        //VALOR LIMITE
        //Para saber el valor minimo y el maximo que acepta
        // Expected: 1985658559, 30, 30, 20, 20, 20, 20, 10 Resultat: 1985658559, 30, 30, 20, 20, 20, 20, 10 -- CORRECTO
        //Acepta el maximo y el minimo de Integer
        int[] ar2 = new int[]{30, 30, 20, 20, 20, 20, 10, 1985658559};
        System.out.println(Arrays.toString(s.SelectionSort(ar2)));
        //INTEGRIDAD DE PARAMETROS
        //Para comprobar que no acepta parametros que no sean los suyos
        // Expected: ERROR Resultat: ERROR: tipo incompatible -- CORRECTO
        /* int[] ar3 = new int[]{30,"A",10};
          System.out.println(Arrays.toString(s.BubbleSort(ar3)));*/
        // Expected: ERROR Resultat: Coge el caracter como su valor ASCII -- INCORRECTO
        //Acepta un caracter y no deberia hacerlo.
        int[] ar4 = new int[]{30, 'a', 10};
        System.out.println(Arrays.toString(s.SelectionSort(ar4)));
        //INTEGRIDAD FUNCIONAL
        //Si solo hay un elemento que ordenar deberia devolver error.
        // Expected: ERROR Resultat: Muestra un unico valor, no ordena nada -- INCORRECTO
        int[] ar5 = new int[]{30};
        System.out.println(Arrays.toString(s.SelectionSort(ar5)));
    }

}
