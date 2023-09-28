package ManejoDeFicheros;

import java.io.File;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) {


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

        } catch (IOException ioe){
            System.out.println("No se ha podido crear algun fichero; ");
            System.out.println(ioe.getMessage());
            System.exit(-2);
        }

                                                                                                                        System.out.println(" ");

        // A CONTINUACION SE MOSTRARAN LOS SIGUIENTES DATOS DEL DIRECTORIO CREADO ANTERIORMENTE JUNTO A LOS DOS FICHEROS

        /**
         * Nombre del fichero
         * Ruta
         * Ruta absoluta
         * Se puede leer
         * Se puede escribir
         * Tamaño
         * Es un directorio
         * Es un fichero
         * Nombre del directorio padre
         * **/

        System.out.println("Nombre del fichero: "+d.getName()); // <-- Devuelve el nombre del Directorio
        System.out.println("Ruta: "+d.getPath()); // <-- Devuelve la ruta
        System.out.println("Ruta absoluta: "+d.getAbsolutePath()); // <-- Devuelve la ruta absoluta del Directorio
        System.out.println("Se puede leer: "+d.canRead()); // <-- Devuelve un booleano
        System.out.println("Se puede escribir: "+d.canWrite()); // <-- Devuelve un booleano
        System.out.println("Tamaño: "+d.length()); // <-- Devuelve el tamaño del Directorio
        System.out.println("Es un directorio: "+d.isDirectory()); // <-- Devuelve un booleano
        System.out.println("Es un fichero: "+d.isFile()); // <-- Devuelve un booleano
        System.out.println("Nombre del directorio padre: "+d.getParent()); // <-- Devuelve el nombre de directorio padre












    }
}
