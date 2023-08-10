import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Main6 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for(int i = 0; i < 10; i++){
            System.out.println("Ingresa el numero " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
            if(numeros[i] > maximo){
                maximo =  numeros[i];
            }
            if(numeros[i] < minimo){
                minimo = numeros[i];
            }
        }
        System.out.println("Numero mayor: " + maximo);
        System.out.println("Numero minimo: " + minimo);
    }
}
