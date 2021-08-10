public class App {
    public static void main(String[] args) throws Exception {
        Integer div;
        try {
            div = 5/1;
            int[] enteros = {2,3,4,5,6,7};
            enteros[10] = 12;
        } catch (ArithmeticException e) {
            System.err.println("No se puede dividir entre zero");
            System.out.println("Clase excepcion: " + e.getClass().getName());
            System.out.println("Mensaje de la excepcion: " + e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e){
            System.err.println("error de indices: " + e.getMessage());
        }
    }
}
