/*
Esta calculadora solo va a realizar sumas para entender el concepto de sobrecarga
*/

public class Calculadora {
    //Atributos
    public String color;
    public Double precio;

    //Constructores
        public Calculadora(){ 
            System.out.println("---Constructor de la calculadora sin parámetros---");
        }
        public Calculadora(double precio){ 
            System.out.println("---Constructor de la calculadora con precio");   
            this.precio = precio;
        }
        public Calculadora(String color){ 
            System.out.println("---Constructor de la calculadora con color");   
            this.color = color;
        }
        public Calculadora(double precio, String color){ 
            System.out.println("---Constructor de la calculadora con precio y color");   
            this.color = color;
            this.precio = precio;
        }

    
        void saludar(){
            System.out.println("Hola desde clase sumadora");

    //Sobrecarga de métodos por tipo de dato
        }
        public int CalcularSuma(int a, int b){
            return a + b;
        }

        public double CalcularSuma(double a, double b){
            return a + b;
        }

        public float CalcularSuma(float a, float b){
            return a + b;
        }

        //Sobrecarga de métodos por numero de datos

        public int CalcularSuma(int a, int b, int c){
            return a + b + c;
        }

}
