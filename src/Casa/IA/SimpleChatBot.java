package Casa.IA;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;


public class SimpleChatBot {

    private HashMap<String, String> knowledgeBase;

    private static String botname;
    private static final String CONFIG_FILE_PATH = "src/Casa/IA/propierties";





    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/Casa/IA/propierties"));
            botname = properties.getProperty("botName", "PepaIA");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public SimpleChatBot() {
        knowledgeBase = new HashMap<>();
        // Ejemplos de información predefinida
        knowledgeBase.put("¿Cuál es la capital de Francia?", "París.");
        knowledgeBase.put("¿Quién escribió 'El Quijote'?", "Miguel de Cervantes.");
        knowledgeBase.put("Hola", "Hola, mi nombre es "+botname+" estoy aqui para lo que necesites," +
                "principalmente vengo a aprender de ti y saber todos los conocimientos.");
        // Puedes agregar más preguntas y respuestas aquí


    }

    public String getResponse(String question) {
        // Verificar si la pregunta está en la base de conocimiento
        return knowledgeBase.getOrDefault(question, "Lo siento, no tengo información sobre eso.");
    }

    public static void main(String[] args) {
        SimpleChatBot chatBot = new SimpleChatBot();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Hola! Soy un chatbot. Hazme preguntas o escribe 'Salir' para terminar.");
/*
        while (true) {
            System.out.print("Tú: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Salir")) {
                System.out.println("¡Adiós! Hasta luego.");
                break;
            }

            String response = chatBot.getResponse(input);
            System.out.println("Chatbot: " + response);
        }*/

        while (true) {
            System.out.print("Tú: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Salir")) {
                System.out.println("¡Adiós! Hasta luego.");
                break;
            } else if (input.equalsIgnoreCase("Aprender")) {
                System.out.println("Escribe la pregunta:");
                String newQuestion = scanner.nextLine();
                System.out.println("Escribe la respuesta:");
                String newAnswer = scanner.nextLine();
                chatBot.learn(newQuestion, newAnswer);
            } else if (input.equalsIgnoreCase("Como te llamas")) {
                System.out.println("CHATBOT: Mi nombre es "+botname+".");
            } else {
                String response = chatBot.getResponse(input);
                System.out.println("Chatbot: " + response);
            }
        }

        scanner.close();
    }

    public void learn(String question, String answer) {


        // Almacena la nueva información en la base de conocimiento
        knowledgeBase.put(question, answer);
        System.out.println("¡He aprendido algo nuevo!");

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(CONFIG_FILE_PATH));
            properties.setProperty(question, answer);
            FileOutputStream fileOutputStream = new FileOutputStream(CONFIG_FILE_PATH);
            properties.store(fileOutputStream, null);
            fileOutputStream.close();
            System.out.println("¡He aprendido algo nuevo y lo he guardado!");
        } catch (IOException e) {
            e.printStackTrace();
        }


        /*  esto es para una base de datos
        import java.sql.*;

        public class SimpleChatBot {
            public static void main(String[] args) {
                try {
                    Class.forName("org.sqlite.JDBC");
                    Connection connection = DriverManager.getConnection("jdbc:sqlite:botdata.db");
                    Statement statement = connection.createStatement();
                    statement.executeUpdate("CREATE TABLE IF NOT EXISTS botInfo (id INTEGER PRIMARY KEY, botName TEXT)");
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM botInfo");
                    if (!resultSet.next()) {
                        statement.executeUpdate("INSERT INTO botInfo(botName) VALUES ('MiIA')");
                    }
                    String botName = resultSet.getString("botName");
                    System.out.println("El nombre del bot es: " + botName);
                    resultSet.close();
                    statement.close();
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
*/





    }
}
