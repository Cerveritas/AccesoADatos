package EjerciciosDeRepaso;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int numeros[] = new int[5];



        for (int i = 0; i < 5; i++){
            System.out.println("Indicame el numero de la posicion "+i);
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++){
            System.out.println(numeros[i]);
        }


                                                                                                                        System.out.println(" ");
        double media = calcularMediaArray(numeros);
        System.out.println("La media de los numeros almacenados en el array es "+media);







    }

    public static double calcularMediaArray (int[] array){
        int sum = 0;
        for (int num : array){
            sum += num;
        }
        return (double) sum / array.length;
    }
}
