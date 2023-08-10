import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        int[] numerosPares = new int[20];
        int suma_pares = 0;
        Random rdm = new Random();

        System.out.println("Arreglo de numeros aleatorios:");
        for(int i = 0; i < 20; i++){
            numerosPares[i] = rdm.nextInt(100) + 1;
            System.out.print(numerosPares[i] + " ");
            if(numerosPares[i] % 2 == 0 ){
                suma_pares += numerosPares[i];
            }
        }

        System.out.println("\nSuma de los numeros pares: " + suma_pares);
    }  
}
