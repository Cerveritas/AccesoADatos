package ManejoDeFicheros;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ejercicio9 {
    public static void main(String[] args) {



                File directorioOrigen = new File("C:\\EJERCICIO9AC\\DirectorioOrigen");
                File directorioDestinoPDFPeques = new File("C:\\EJERCICIO9AC\\DirPDFpeques");
                File directorioDestinoPDFPequesAZ = new File("C:\\EJERCICIO9AC\\DirPDFpequesAZ");
                File directorioDestinoPDFMayores = new File("C:\\EJERCICIO9AC\\DirPDFmayores");

                if (!directorioDestinoPDFPeques.exists()) {
                    directorioDestinoPDFPeques.mkdirs();
                }

                if (!directorioDestinoPDFPequesAZ.exists()) {
                    directorioDestinoPDFPequesAZ.mkdirs();
                }

                if (!directorioDestinoPDFMayores.exists()) {
                    directorioDestinoPDFMayores.mkdirs();
                }

                File[] archivos = directorioOrigen.listFiles();

                if (archivos != null) {
                    List<File> pdfPeques = new ArrayList<>();
                    List<File> pdfMayores = new ArrayList<>();

                    for (File archivo : archivos) {
                        if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".pdf")) {
                            if (archivo.length() <= 1000000) { // 1000 KB = 1000000 bytes
                                pdfPeques.add(archivo);
                            } else {
                                pdfMayores.add(archivo);
                            }
                        }
                    }

                    // Copiar los 20 primeros archivos PDF pequeños a DirPDFpeques
                    for (int i = 0; i < Math.min(pdfPeques.size(), 20); i++) {
                        File archivo = pdfPeques.get(i);
                        Path destino = new File(directorioDestinoPDFPeques, archivo.getName()).toPath();
                        try {
                            Files.copy(archivo.toPath(), destino, StandardCopyOption.REPLACE_EXISTING);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    // Mover archivos PDF pequeños que comiencen con A-N a DirPDFpequesAZ
                    for (File archivo : pdfPeques) {
                        if (archivo.getName().matches("^[A-Na-n].*")) {
                            Path destino = new File(directorioDestinoPDFPequesAZ, archivo.getName()).toPath();
                            try {
                                Files.move(archivo.toPath(), destino, StandardCopyOption.REPLACE_EXISTING);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    // Ordenar archivos PDF mayores por tamaño en orden decreciente
                    pdfMayores.sort(Comparator.comparingLong(File::length).reversed());

                    // Copiar los 20 primeros archivos PDF mayores a DirPDFmayores
                    for (int i = 0; i < Math.min(pdfMayores.size(), 20); i++) {
                        File archivo = pdfMayores.get(i);
                        Path destino = new File(directorioDestinoPDFMayores, "Fichero" + (i + 1) + ".pdf").toPath();
                        try {
                            Files.copy(archivo.toPath(), destino, StandardCopyOption.REPLACE_EXISTING);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }



