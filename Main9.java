import java.util.Arrays;
import java.util.Random;

public class Main9{
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random rdm  = new Random();

        for(int i = 0; i < 10; i++){
            numeros[i]  = rdm.nextInt(100);
        }
        for(int i = 0; i < numeros.length - 1; i++){
            int indiceMenor = i;
            for(int j = i + 1; j < numeros.length; j++){
                if(numeros[j] < numeros[indiceMenor]){
                    indiceMenor = j;
                }
            }
            int aux = numeros[indiceMenor];
            numeros[indiceMenor] = numeros[i];
            numeros[i] = aux;
        }
        System.out.println("Arreglo ordenado de menor a mayor: " + Arrays.toString(numeros));
    }
}