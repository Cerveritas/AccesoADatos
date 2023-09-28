package Exceptiones;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[][] matriz = new int[2][3];


        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                matriz[i][j] = i+j;
            }
        }



        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.println(matriz[i][j] + " ");
            }
        }



       try {
           System.out.println( matriz[2][3]);
       } catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Fuera de los indices de la matriz");
       }


        //mi observador

        System.out.println(" ");
        System.out.println("mis pruebas");
        System.out.println(matriz[0][0]);
        System.out.println(matriz[0][1]);
        System.out.println(matriz[0][2]);

        System.out.println(matriz[1][0]);
        System.out.println(matriz[1][1]);
        System.out.println(matriz[1][2]);







    }
}
