package EjerciciosDeRepaso.Exceptiones;

public class Ejercicio5 {
      public static void main(String[] args) throws MiException {


        try {
            funcionB();
        } catch (MiException e){
            System.out.println("Excepcion atrapada en el nivel principal: "+e.getMessage());

        }







    }



    // Funcion B llama a Funcion C y propaga la exception si ocurre.
    static void funcionB() throws MiException{

        try {
            funcionC();
        } catch (MiException e){
            System.out.println("Excepcion atrapada en la funcion B: "+e.getMessage());
            throw e; //Propagamos la exception hacia arriba.
        }
    }


    // Funcion C genera una exception personalizada y la propaga
      static void funcionC() throws MiException{
        System.out.println("Funcion C ejecutandose....");
        throw new MiException("Excepcion en la funcio C");
    }



    // Excepcion personalizada
    static class MiException extends Exception{
        public MiException(String mensaje){
            super(mensaje);
        }
    }


}
