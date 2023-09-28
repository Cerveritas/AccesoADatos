package ManejoDeFicheros;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Ejercicio3 {
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




        //SE MUESTRA EL NUMERO DE FICHEROS DEL DIRECTORIO QUE DESEE, EN ESTE CASO EL CREADO ANTERIORMENTE
        System.out.println("A continuacion se muestra un listado de los ficheros de directorio creado: "+ d.list().length);





    }
}
