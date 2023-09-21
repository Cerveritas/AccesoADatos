package EjerciciosDeRepaso.Exceptiones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


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
