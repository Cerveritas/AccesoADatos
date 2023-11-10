package XMLValidator;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;



public class codigoUsable {

    // COLORES PARA LOS PRINTS

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {


        try {
            // Objeto DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);


            // Habilita la validación DTD
            factory.setValidating(true);

            // Crea un nuevo DocumentBuilder
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();


            // Parsea el archivo XML
            Document document = documentBuilder.parse(new InputSource("Filedtd.xml"));


            // Muestra si esta bien el documento
            if (document != null) {
                System.out.println(ANSI_GREEN+"El archivo XML es válido con el DTD.");
            }

        } catch (IOException e){
            System.out.println(ANSI_RED+"Error de validación XML: " + e.getMessage());
        } catch (SAXException e){
            System.out.println(ANSI_RED+"Error de lectura de archivo XML: " + e.getMessage());
        } catch (ParserConfigurationException e){
            System.out.println(ANSI_RED+"Error de configuración del parser XML: " + e.getMessage());
        }


    }
}


