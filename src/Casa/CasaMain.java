package Casa;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CasaMain {
    public static void main(String[] args) {



       String nombre = JOptionPane.showInputDialog(null, "introduzca tu nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca tu edad"));



        if (edad >= 18){
            JOptionPane.showMessageDialog(null, "bienvenido "+nombre);
        } else {
            JOptionPane.showMessageDialog(null, "usted no puede acceder a nuestro sistema al tener  " + edad + " años");


        }


        }

}
