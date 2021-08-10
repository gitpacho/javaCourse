public class CirculoMain {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(3.0);
        Double area = circulo1.calcularArea();
        Double perimetro = circulo1.calcularPerimetro();

        System.out.println("Area:      " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
