package EjerciciosDeRepaso;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
    


        System.out.print("Indique el primer numero: ");
            numero1 = sc.nextInt();
        System.out.print("Indique el segundo numero: ");
            numero2 = sc.nextInt();
        System.out.print("Indique el tercer numero: ");
            numero3 = sc.nextInt();

        int[] numeros = {numero1, numero2, numero3};

        Arrays.sort(numeros);

        for (int numero : numeros){
            System.out.println(numero);
        }
    }
}
