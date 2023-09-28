package Exceptiones;



import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ejercicio 2
        try {
            System.out.println("EJERCICIO 2");
            System.out.println("el resultado es: "+ 0/0);
        } catch (ArithmeticException e2) {
            e2.printStackTrace();
            System.out.println("Mensaje de la exception 1: "+ e2.getMessage());
            System.out.println("Mensaje de la exception 2: "+ e2.toString());
        }


                                                                                                                        System.out.println(" ");

        // Ejercicio 3

        try{

            System.out.println("EJERCICIO 3");
            int numero = 0;
            System.out.println("Indica un numero: ");
            numero = sc.nextInt();
            System.out.print("El numero ingresado es: "+numero);

        } catch (InputMismatchException e3){
            e3.printStackTrace();
            System.out.println("Mensaje de la exception 1: "+e3.getMessage());
            System.out.println("Mensaje de la exception 2: "+e3.toString());
        }


















    }
}
