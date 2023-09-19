package EjerciciosDeRepaso;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;

        System.out.println("Indicame un numero del 1 al 10 para mostrar su tabla de multiplicar");
            numero = sc.nextInt();

        if (numero > 10){
            System.out.println("El numero introducido se sale del rango seleccionado");
        } else {

            for(int i = 1; i <= 20; i++) {
                System.out.println(numero + " * " + i + " = " + numero * i);
            }

        }
    }
}
