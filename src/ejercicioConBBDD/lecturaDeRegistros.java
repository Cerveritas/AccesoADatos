package ejercicioConBBDD;

import java.sql.*;
import java.util.Scanner;

public class lecturaDeRegistros {

    static Scanner sc = new Scanner(System.in);
    static Connection conn;


    public static void main(String[] args) throws SQLException {


        int opcion = 0;

        do {

            System.out.println("------------------------------------------------");
            System.out.println("0 - Salir del programa");
            System.out.println("1 - Establecer conexion con la BBDD");
            System.out.println("2 - Mostrar todos los registros de emp_no, oficio y departamento");
            System.out.println("3 - Motrar ademas el campo dnombre ");
            System.out.println("Introduce un numero: ");
            System.out.println("------------------------------------------------");
            System.out.println(" ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Gracias por usar el programa...");
                    break;

                case 1:
                    establecerConexion();
                    break;

                case 2:
                    registrosIndicados();
                    break;

                case 3:
                    masRegistros();
                    break;

                default:
                    System.out.println("El numero introducido no es correcto, intentelo de nuevo...");


            }
        } while (opcion != 0);
    }




    private static void establecerConexion() throws SQLException {
        String url="jdbc:mysql://localhost:3306/";
        String user= "root";
        String pwd="admin";
        conn = DriverManager.getConnection(url,user,pwd);

        String query = "use accesodatos";
        Statement st;
        st = conn.createStatement();
        st.executeUpdate(query);
        System.out.println("Conexion y Asignacion realizada correctamente");
    }

    private static void registrosIndicados() throws SQLException {
        // Crear una consulta SQL para seleccionar los registros
        String query = "SELECT emp_no, apellido, oficio FROM empleados";

        // Crear un objeto Statement
        Statement statement = conn.createStatement();

        // Ejecutar la consulta
        ResultSet resultSet = statement.executeQuery(query);

        // Imprimir los resultados
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("emp_no") + " " + resultSet.getString("apellido") + " " + resultSet.getString("oficio"));
        }



    }


    private static void masRegistros() throws SQLException {

        // Crear una consulta SQL para seleccionar los registros
        String query =  "SELECT empleados.emp_no, empleados.apellido, empleados.oficio, departamentos.dnombre " +
        "FROM empleados INNER JOIN departamentos ON empleados.dept_no = departamentos.dept_no";

        // Crear un objeto Statement
        Statement statement = conn.createStatement();

        // Ejecutar la consulta
        ResultSet resultSet = statement.executeQuery(query);

        // Imprimir los resultados
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("emp_no") + " " + resultSet.getString("apellido") + " " + resultSet.getString("oficio") + " " + resultSet.getString("dnombre"));
        }
    }


}

