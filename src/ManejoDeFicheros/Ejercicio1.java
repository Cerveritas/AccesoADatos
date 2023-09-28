package ManejoDeFicheros;

import java.io.File;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {



        File d = new File("NUEVODIR");
        File f1 = new File(d,"FICHERO1.TXT");
        File f2 = new File(d,"FICHERO2.TXT");

        //CREO EL DIRECTORIO
        if (!d.mkdir()){
            System.out.println("No se ha podido crear el directorio");
            System.exit(-1);
        }

        //CREO LOS FICHEROS
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


            //SE REALIZA EL RENAME DEL FICHERO
            f1.renameTo(new File(d, "FICHERO1-COPIA.TXT"));
            System.out.println("Se ha renombrado el FICHERO1.TXT a -> FICHERO1-COPIA.TXT");


        } catch (IOException ioe){
            System.out.println("No se ha podido crear algun fichero; ");
            System.out.println(ioe.getMessage());
            System.exit(-2);
        }





    }
}
