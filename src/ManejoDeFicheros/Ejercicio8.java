package ManejoDeFicheros;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) {

        // MUEVE LOS FICHEROS DE UN DIRECTORIO Y LOS PEGA EN OTRO DIRECTORIO
        try {
            FileUtils.moveFileToDirectory(new File("C:\\ALGO\\ficheroAlgo.txt"), new File("C:\\PACA"), true);
            FileUtils.moveFileToDirectory(new File("C:\\ALGO\\ficheroAlgo2.txt"), new File("C:\\PACA"), true);
            System.out.println("FicheroMovido");
        } catch (IOException ioe){
            System.out.println("Error al mover el archivo");
            ioe.printStackTrace();
        }



    }
}
