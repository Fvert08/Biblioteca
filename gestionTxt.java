import java.io.*;

public class gestionTxt {
    public static void escribirLector(Lector lector, String archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write(lector.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerLectores(String archivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Procesar la línea como desees, por ejemplo, imprimir en consola
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
