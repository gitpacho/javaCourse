import java.io.*;
public class io {
    public static void main(String args[]) {
        int numBytes = 0;
        char caracter;
        System.out.println("\nEscribe el texto: ");
        try {
            System.out.println("empiza try-------------");
            do {
                System.out.println("lectura");
                caracter = (char)System.in.read();
                System.out.println("--");
                System.out.println(caracter);
                numBytes++;
            } while (caracter != '\n');
                System.err.printf("%d bytes leidos %n", numBytes);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}