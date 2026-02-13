import java.io.*;
import java.util.ArrayList;

public class EscribirFichero {

    public void escribir(String path, ArrayList<String> lineas) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir el fichero");
        }
    }
}
