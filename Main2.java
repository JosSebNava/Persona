public class Main2 {
    public static void main(String[] args) {
		int arreglo[] = { 1, 2, 3, 4, 5 };
		int suma = 0;
		for (int x = 0; x < arreglo.length; x++) {
			suma = suma + arreglo[x];
		}
		float promedio = suma / arreglo.length;
		System.out.printf("Suma: %d. Promedio: %f", suma, promedio);
    }
}