package ManejoDeFicheros;

import java.io.File;

public class Ejercicio6 {
    public static void main(String[] args) {



        System.out.println("Numero de argumentos: "+args.length);

        //Muestra los argumentos pasados
        for (int i = 0; i < args.length; i++){
            System.out.println("Argumento "+i+" : "+args[i]);
            File f = new File("C:\\ALGO");
            if (esFichero(f, args[i])){
                System.out.println("****** "+args[i]+" es un fichero del directorio "+f+" ******");
            }
        }




    }

    static boolean esFichero (File f, String str){
        System.out.println("Fichero recibido en esFichero "+f);
        System.out.println("String recibido en esFichero "+str);
        File f2 = new File(f, str);
        boolean esfich = f2.isFile();
        System.out.println("El booleano esfich es "+esfich);
        return esfich;
    }



}
