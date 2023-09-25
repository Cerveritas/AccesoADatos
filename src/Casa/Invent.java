package Casa;

import javax.swing.*;
import java.util.Scanner;

public class Invent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;



        try{

            do {

                System.out.println("******************************************");
                System.out.println("0 - SALIR DEL PROGRAMA");
                System.out.println("1 - UN CORDIAL SALUDO");
                System.out.println("2 - UNA DESPEDIDA PIADOSA");
                System.out.println("3 - UNA DESCRIPCION TUYA");
                                                                                                                        System.out.println(" ");

                System.out.println("Elija una opcion");
                System.out.println("******************************************");
                opcion = sc.nextInt();








                switch (opcion) {

                    case 0:
                        JOptionPane.showMessageDialog(null, "GRACIAS POR USAR EL PROGRAMA...");
                    case 1:
                        System.out.println("HOLA");
                        break;
                    case 2:
                        System.out.println("ADIOS");
                        break;
                    case 3:
                        System.out.println("NEPE");
                        break;
                    default:
                        throw new Exception();
                }

            }while (opcion != 0);
        } catch (Exception e) {
            System.out.println("ERROR, NUMERO INTRODUCIDO INCORRECTO O FUERA DE RANGO !!");


        }












    }
}
