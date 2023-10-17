package ManejoDeFicherosII;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3y4PDF {

    public static void main(String[] args) throws IOException {


        // creamos la clase con el objeto fichero y como lo llamaremos
        File fichero1 = new File("FichTexto.txt");

        //abrimos excepcion y...
        try {

            // primeor creamos el fichero
            if (fichero1.createNewFile()) {
                System.out.println("FICHERO1 CREADO CORRECTAMENTE...");

            } else {
                System.out.println("NO SE HA PODIDO CREAR EL FICHERO");
            }

            // ahora creamos la clase de fileWiter para modificar el fichero creado anteriormente
            FileWriter f = new FileWriter(fichero1);
            f.write("Esto es texto escrito en un fichero de texto");
            f.close(); // <-- importante recordar cerrar el flujo de escritura para que funcione bien


            FileReader f1 = new FileReader(fichero1);

            // Leemos el contenido del fichero
            int c;
            while ((c = f1.read()) != -1) {
                System.out.print((char) c);
            }

            // Cerrar el flujo de lectura
            f1.close();



        } catch (IOException e) { // la exception
            System.out.println("NO SE HA PODIDO CREAR EL FICHERO, ALOMEJOR ESTA REPETIDO");
            System.out.println(e.getMessage());
        }
    }
}
