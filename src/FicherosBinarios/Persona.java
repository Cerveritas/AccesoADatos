package FicherosBinarios;

import java.io.Serializable;

public class Persona implements Serializable {

    // ATRIBUTOS
    private int id = 0;
    private String nombre = "";
    private int edad = 0;
    private String dni = "";


    // CONSTRUCTOR

    public Persona(int id, String nombre, int edad, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }


    // GETTERS AND SETTERS


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
