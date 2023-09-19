package EjerciciosDeRepaso;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pene = (int) (Math.random()*100);
        int intentos = 0;
        boolean adivinado = false;


        while (adivinado == false){
            System.out.println("Numero de intentos "+intentos);
            System.out.println("Indique el numero");

            int numeroJugador = sc.nextInt();

            if (numeroJugador > pene){
                System.out.println("El numero a adivinar es menor que "+numeroJugador);
                intentos++;
            } else if (numeroJugador < pene){
                System.out.println("El numero a adivinar es mayor que "+numeroJugador);
                intentos++;
            } else {
                System.out.println("Has adivinado el numero eres un crack bro 😎👍");
                adivinado = true;
            }
        }




































    }
}
