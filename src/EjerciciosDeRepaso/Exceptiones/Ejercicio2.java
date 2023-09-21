package EjerciciosDeRepaso.Exceptiones;

public class Ejercicio2 {
    public static void main(String[] args) {



        try {
            System.out.println("el resultado es: "+ 0/0);
        } catch (ArithmeticException e){
            System.out.println("Sa producido un ArtihmeticExceptcion ");
        }







    }
}
