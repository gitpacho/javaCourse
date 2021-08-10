public class Main {
    public static void main(String[] args) {

        
        Sumadora sumad1 = new Sumadora();
        sumad1.saludar();

        Sumadora sumad2 = new Sumadora(1);
        sumad2.saludar();

        //El metodo recibe solo enteros
        var res1 = sumad1.CalcularSuma(5, 10);
        System.out.println("La suma es: " + res1);
        
        //sobrecarga de metodos, utilizamos ahora la entrada double
        var res2 = sumad1.CalcularSuma(1.3, 2.2);
        System.out.println("La suma es: " + res2);

        //sobrecarga para flotantes
        var res3 = sumad1.CalcularSuma(1, 2);
        System.out.println(res3);



        //sobrecarga para strings
        var res4 = sumad1.CalcularSuma("123", "123");
        System.out.println(res4);


        //sobrecarga por parametros
        var res5 = sumad1.CalcularSuma(1.2);
        System.out.println(res5);





        
    }
}
