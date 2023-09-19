package EjerciciosDeRepaso;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int nota = 0;

        System.out.println("Indicame tu nota de Acceso a Datos");
            nota = sc.nextInt();


            switch (nota){

                case 0:
                    System.out.println("Insuficiente");
                    break;
                case 1:
                    System.out.println("Insuficiente");
                    break;
                case 2:
                    System.out.println("Insuficiente");
                    break;
                case 3:
                    System.out.println("Insuficiente");
                    break;
                case 4:
                    System.out.println("Insuficiente");
                    break;
                case 5:
                    System.out.println("Suficiente");
                    break;
                case 6:
                    System.out.println("Bien");
                    break;
                case 7:
                    System.out.println("Notable");
                    break;
                case 8:
                    System.out.println("Notable");
                    break;
                case 9:
                    System.out.println("Sobresaliente");
                    break;
                case 10:
                    System.out.println("Sobresaliente");
                    break;
                default:
                    System.out.println("La nota introducida es incorrecta");


            }













    }
}
