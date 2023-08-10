import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int[] arreglo  = new int[5];
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.print("Ingresa el numero " + (i+1) + ": ");
            arreglo[i] = entrada.nextInt();
        }
        System.out.println("Numeros de orden inverso:");
        for(int i = 4; i >= 0; i--){
            System.out.println(arreglo[i]);
        }      
    }
}
