package Exceptiones;

public class Ejercicio2 {
    public static void main(String[] args) {


        // ESTE PROGRAMA PROVOCA UNA ARITHMETICEXCEPTION

        try {
            System.out.println("el resultado es: "+ 0/0);
        } catch (ArithmeticException e){
            System.out.println("Se ha producido un ArtihmeticExceptcion ");
        }

    }
}
