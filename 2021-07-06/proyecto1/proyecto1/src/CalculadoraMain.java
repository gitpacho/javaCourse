public class CalculadoraMain {
    public static void main(String[] args) {
        Calculadora calculator1 = new Calculadora();
        Calculadora calculator2 = new Calculadora(2500);
        Calculadora calculator3 = new Calculadora("rojo");
        Calculadora calculator4 = new Calculadora(10000, "verde");

        System.out.println(calculator4.precio);

        //calculator.saludar();
        //var res1 = calculator.CalcularSuma(1, 2);
        //System.out.println("suma int:" + res1);
        //var res2 = calculator.CalcularSuma(1.0, 2.0);
        //System.out.println("suma double:" + res2);
        //var res3 = calculator.CalcularSuma(1.0f, 2.0f);
        //System.out.println("suma float:" + res3);
        //var res4 = calculator.CalcularSuma(1, 2, 3);
        //System.out.println("suma tres params:" + res4);
    }

}
