import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;

public class Main11 {
    public static void main(String[] args) {
      int[] numeros = new int[50];

      Random rdm = new Random();
      for(int i = 0; i < numeros.length; i++){
          numeros[i] =  rdm.nextInt(100);
      } 

      int[] repeticion = new int[100];
      for(int i = 0; i < numeros.length;i++){
          repeticion[numeros[i]]++;
          
      }
      int RepeticionMax = 0;
      int RepeticionMas = -1;
      for(int i = 0; i < repeticion.length; i++){
          if(repeticion[i] > RepeticionMax){
              RepeticionMax = repeticion[i];
              RepeticionMas = i;
          }
      }
      System.out.println("El numero mas repetido es: " + RepeticionMas);
    }
}
