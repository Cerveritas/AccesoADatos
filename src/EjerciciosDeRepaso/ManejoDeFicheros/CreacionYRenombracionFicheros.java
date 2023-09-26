package EjerciciosDeRepaso.ManejoDeFicheros;

import java.io.File;
import java.io.IOException;

public class CreacionYRenombracionFicheros {
    public static void main(String[] args) {


        // CREO LOS OBJETOS: Un directorio y dos ficheros
        File d = new File("NUEVODIR");
        File f1 = new File("FICHERO1.TXT");
        File f2 = new File("FICHERO2.TXT");

        //CREO EL DIRECTORIO
        if (!d.mkdir()){
            System.out.println("No se ha podido crear el directorio");
            System.exit(-1);
        }

        try {
            if (f1.createNewFile()){
                System.out.println("FICHERO1 creado correctamente");
            } else {
                System.out.println("No se ha podido crear el FICHERO1");
            }

            if (f2.createNewFile()){
                System.out.println("FICHERO2 creado correctamente");
            } else {
                System.out.println("No se ha podido crear el FICHERO2");
            }

            //RENOMBRO FICHERO1.txt A FICHERO1NUEVO.TXT
            f1.renameTo(new File(d, "FICHERO1NUEVO.txt"));



        } catch (IOException ioe){
            System.out.println("No se ha podido crear algun fichero; ");
            System.out.println(ioe.getMessage());
            System.exit(-2);
        }
    }
}
