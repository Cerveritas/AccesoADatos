package EjerciciosDeRepaso.Exceptiones;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try {
            int nota = 0;

            System.out.println("Indicame tu nota de Acceso a Datos");
            nota = sc.nextInt();

            switch (nota) {

                case 0: case 2: case 3: case 4:
                    throw new Exception("Insuficiente");
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

        } catch (Exception e){
            System.out.println("HAS SUSPENDIDO, ERES UN MAL ALUMNO");
        }
    }
}
