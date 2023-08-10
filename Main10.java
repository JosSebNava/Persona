import java.io.StreamCorruptedException;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        String[] nombres =  new String[5];
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Ingresa el nombre " + (i+1) + ": ");
            nombres[i] = entrada.nextLine();
        }
        System.out.println("Ingresa el nombre que quieres buscar: ");
        String nombreBuscar =  entrada.nextLine();

        boolean encontrado = false;
        for(int i = 0; i < 5; i++){
            if(nombres[i].equalsIgnoreCase(nombreBuscar)){
                encontrado =  true;
                break;
            }
        }
        if(encontrado){
            System.out.println("El nombre " + nombreBuscar + " esta en el arreglo.");
        } else{
            System.out.println("El nombre " +  nombreBuscar + " no se encuentra en el arreglo.");
        }
    }
}
