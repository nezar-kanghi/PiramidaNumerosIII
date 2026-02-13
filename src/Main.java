import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int n = sc.nextInt();

        GenerarLineas generador = new GenerarLineas();
        EscribirFichero escritor = new EscribirFichero();

        ArrayList<String> lineas = generador.generar(n);
        escritor.escribir("salida.txt", lineas);

        System.out.println("Fichero salida.txt generado correctamente");
    }
}
