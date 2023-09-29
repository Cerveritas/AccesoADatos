package Exceptiones;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ejercicio7 {
    public static void main(String[] args) {

        try {

            // Intenta establecer una conexión con el servidor de base de datosusuario
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mi_basededatos", "", "contraseña");

            // Realiza operaciones en la base de datos

            // Cierra la conexión cuando hayas terminado
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.getMessage());


        }
    }
}
