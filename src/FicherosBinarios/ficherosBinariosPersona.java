package FicherosBinarios;

import java.io.*;
import java.util.Scanner;

public class ficherosBinariosPersona  {




    public static void main(String[] args) throws IOException, ClassNotFoundException {


        File file = new File(new File("."),"persona1.txt");




        int opcion = 0;
        Scanner sc = new Scanner(System.in);


        do {

            System.out.println(" ");
            System.out.println("****************************");
            System.out.println("0 - Salir del programa");
            System.out.println("1 - Guardar objeto");
            System.out.println("2 - Recuperar objeto");
            System.out.println("****************************");
            System.out.println(" ");
            System.out.print("Indica la opcion: ");
            System.out.println(" ");
            opcion = sc.nextInt();


            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar el programa...");
                    break;

                case 1:
                    guardarObjeto(file);
                    break;

                case 2:
                    recuperarObjeto(file);
                    break;

                default:
                    System.out.println("El numero introducido es incorrecto, intentelo de nuevo....");
            }





        } while (opcion != 0);




    }

    // METODO GUARDAR OBJETO
    private static void guardarObjeto(File file) {
        try {
            file.createNewFile();

            Persona persona1 = new Persona(1, "Sergio", 21, "46701191P");
            Persona persona2 = new Persona(2, "Nahiara", 20, "49825567D");

            System.out.println("Persona guardada "+persona1);
            System.out.println("Persona guardada "+persona2);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(persona1);
            objectOutputStream.writeObject(persona2);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    // MÉTODO RECUPERAR OBJETO
    public static void recuperarObjeto(File file)throws IOException, ClassNotFoundException{
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


            Persona persona1 = (Persona) objectInputStream.readObject();
            Persona persona2 = (Persona) objectInputStream.readObject();


            System.out.println("El Id es: "+persona1.getId());
            System.out.println("El Nombre es: "+persona1.getNombre());
            System.out.println("La edad es: "+persona1.getEdad());
            System.out.println("El DNI es: "+persona1.getDni());

            System.out.println(" ");

            System.out.println("El Id es: "+persona2.getId());
            System.out.println("El Nombre es: "+persona2.getNombre());
            System.out.println("La edad es: "+persona2.getEdad());
            System.out.println("El DNI es: "+persona2.getDni());

            objectInputStream.close();
            fileInputStream.close();





        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }

    }


}
