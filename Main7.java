import java.util.Random;

public class Main7 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        Random rdm  = new Random();
        int numeroPar = 0;
        int numeroImpar = 0;
    for(int i = 0; i < 100; i++){
        numeros[i] = rdm.nextInt(100);
        if(numeros[i] % 2 == 0){
            numeroPar++;
        } else {
            numeroImpar++;
        }
       }
       System.out.println("Numeros pares: " + numeroPar);
       System.out.println("Numeros impares: " + numeroImpar);
    }
}
