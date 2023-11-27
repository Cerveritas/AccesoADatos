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
            System.out.println("4 - Insertar un nuevo registro");
            System.out.println("5 - Actualizar un registro");
            System.out.println("6 - Borrar un registro");
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

                case 4:
                    insertarRegistro();
                    break;

                case 5:
                    actualizarRegistro();
                    break;

                case 6:
                    borrarRegistro();
                    break;

                default:
                    System.out.println("El numero introducido no es correcto, intentelo de nuevo...");


            }
        } while (opcion != 0);
    }




    // METODO PARA ESTABLECER CONEXION CON LA BASE DE DATOS
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

    // METODO PARA MOSTRAR REGISTROS ESPECIFICOS
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


    // METODO PARA MOSTRAR UN REGISTRO DE MAS
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


    // METODO PARA INSERTAR UNA NUEVA TUPLA, EN ESTE CASO EN LA TABLA DEPARTAMENTO
    private static void insertarRegistro() throws SQLException {

        PreparedStatement ps = conn.prepareStatement("insert into departamentos values (?,?,?)");

        System.out.println("Introduce el dept_no (INT)");
            int dept_no = sc.nextInt();
        System.out.println("Introduce el nombre (STRING)");
            String nombre = sc.next();
        System.out.println("Introudce la localizacion (STRING)");
            String loc = sc.next();

        ps.setInt(1, dept_no);
        ps.setString(2, nombre);
        ps.setString(3, loc);

        ps.executeUpdate();

        System.out.println("Registro insertado correctamente");

    }

    // METODO PARA ACTUALIZAR UN REGISTRO DE LA TABLA DEPARTAMENTO
    private static void actualizarRegistro() throws SQLException {

        PreparedStatement ps = conn.prepareStatement("update departamentos set dnombre = ?, loc = ? where dept_no = ?");

        System.out.println("Introduce el dept_no");
            int dept_no = sc.nextInt();

        //ACTUALIAMOS
        System.out.println("Introduce el nombre");
            String nombre = sc.next();
        System.out.println("Introduce la localizacion");
            String loca = sc.next();

        ps.setString(1, nombre);
        ps.setString(2, loca);
        ps.setInt(3, dept_no);

        ps.executeUpdate();

        System.out.println("El registro con el DEPT_NO "+dept_no+" ha sido actualizado");

    }
    // METODO PARA BORRAR UN REGISTRO POR SU ID EN LA TABLA DEPARTAMENTO
    private static void borrarRegistro() throws SQLException {

        PreparedStatement ps = conn.prepareStatement("delete from departamentos where dept_no = ?");

        System.out.println("Indicame el DEPT_NO que del registro que deseas eliminar");
            int id = sc.nextInt();

        ps.setInt(1, id);

        ps.executeUpdate();

        System.out.println("El registro con el DEPT_NO "+id+" ha sido eliminado correctamente...");
    }


}

