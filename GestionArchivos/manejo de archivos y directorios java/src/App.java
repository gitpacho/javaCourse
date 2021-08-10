import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // lectura de datos
        try {
            var f = new File(".\\nombres.txt");
            Scanner sc = new Scanner(f);
            System.out.println("tamaño del archivo: " + f.length());
            System.out.println("separador: " + f.pathSeparator);
            System.out.println("separadorchar: " + f.pathSeparatorChar);
            
            try {
                System.out.println("canRead():" + f.canRead());
                System.out.println("canWrite():" + f.canWrite());
                System.out.println("exists():" + f.exists());
                System.out.println("getName():" + f.getName());
                System.out.println("getParent():" + f.getParent());
                System.out.println("isDirectory():" + f.isDirectory());
                System.out.println("isFile():" + f.isFile());
                System.out.println("length():" + f.length());
            } catch (Exception e) {
                System.out.println(e);
                }
            
            
            
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println("fallo la lectura: " + e.getMessage());
            e.getStackTrace();
        }

        //escritura de datos
        
        String[] datos= {"Manzana", "Pera", "Uvas", "COcos", "bananos"};
        FileWriter archivo2 = new FileWriter("Frutas.txt");
        for (String string : datos) {
            archivo2.write(string);            
        }
        archivo2.close();

        //añadir datos a un archivo

        String[] data = {"Limon", "Lulo", "Mango"};
        FileWriter file = new FileWriter("Frutas.txt", true);
        for (String string : data) {
            file.write("\n" + string);            
        }
        file.close();



    }
}
