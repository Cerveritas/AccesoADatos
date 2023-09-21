package EjerciciosDeRepaso;

import java.sql.Struct;
import java.util.ArrayList;

public class Ejercicio8 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        list.add("Volvo");
        list.add("BMW");
        list.add("Mercedes");
        list.add("Ford");

        pares(list);
    }

    public static void pares(ArrayList<String> list){
        for (int i = 0; i < list.size(); i += 2)
        System.out.println("Posicion " + i + ": "+ list.get(i));
    }
}
