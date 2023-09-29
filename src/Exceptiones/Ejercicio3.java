package Exceptiones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        /** DE ESTA MANERA GENERAMOS UNA EXCEPTCION DE TIPO JAVA.UTIL.MISMATCH.EXCEPTCION
         * Y A LA HORA DE QUE EL USUARIO INDIQUE ALGUN CARACTER FUERA DE UN NUMERO
         * AUTOMATICAMENTE SATE LA EXCEPTCION
         */
        try{

            int numero = 0;
            System.out.println("Indica un numero: ");
                numero = sc.nextInt();
            System.out.print("El numero ingresado es: "+numero);



        } catch (InputMismatchException e){
            System.out.println("No has introducido un numero, intentelo de nuevo");
        }





    }
}
