import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);
        int[] contado = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.println("Ingresa el numero " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
            contado[i] = 0;
        }
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(numeros[i] == numeros[j]){
                    contado[j]++;
                }
            }
        }
        for(int i = 0; i < 10; i++){
            System.out.println("El numero " + numeros[i] + " se repite " + contado[i] + " veces.");
        }
    }
}
