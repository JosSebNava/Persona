import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombres = new String[10];
        for(int i = 0; i < 10; i++){
            System.out.println("Ingresa el nombre: " + (i+1) + ": ");
            nombres[i] = entrada.nextLine();
        }
        Arrays.sort(nombres);
        System.out.println("Nombres de orden alfabetico: ");
        for(int i = 0; i < 10; i++){
            System.out.println(nombres[i]);
        }
    }
}
