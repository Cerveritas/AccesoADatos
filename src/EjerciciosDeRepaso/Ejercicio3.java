package EjerciciosDeRepaso;

import javax.swing.*;

public class Ejercicio3 {

    public static void main(String[] args) {



        String letra = JOptionPane.showInputDialog(null, "Introduce una letra");


        if (letra == letra.toUpperCase()){
            JOptionPane.showMessageDialog(null, "Es mayuscula");
        } else {
            JOptionPane.showMessageDialog(null, "Es minuscula");
        }

    }
    }
