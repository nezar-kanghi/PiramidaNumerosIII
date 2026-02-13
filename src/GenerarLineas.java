import java.util.ArrayList;

public class GenerarLineas {

    public ArrayList<String> generar(int n) {
        ArrayList<String> lineas = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String linea = ""; //inicializamos una cadena vaciac

            for (int j = 1; j <= i; j++) {
                linea = linea + j; //suma el numero actual j a la liena

                if (j < i) {
                    linea = linea + " "; //si no es el ultimo numero agrega espacio
                }
            }

            lineas.add(linea);
        }

        return lineas;
    }
}

