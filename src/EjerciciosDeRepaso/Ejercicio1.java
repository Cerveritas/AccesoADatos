package EjerciciosDeRepaso;

import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;
        int edad = 0;



        System.out.println("Indicame tu nombre: ");
            nombre = sc.next();
        System.out.println("Indicame tu edad: ");
            edad = sc.nextInt();

        System.out.println("Buenos diias "+nombre+" hoy tienes "+edad+" años");


    }





}
