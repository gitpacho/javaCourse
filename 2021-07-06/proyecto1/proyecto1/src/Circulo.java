public class Circulo {
    private final Double PI = 3.1542;
    private Double radio;
    //Constructor
    public Circulo(Double radio){
        this.radio = radio;
    }

    //Metodos de la clase Circulo
    public Double calcularArea(){
        return this.PI * Math.pow(this.radio, 2);
    }

    public Double calcularPerimetro(){
        return 2 * this.PI * this.radio;
    }
    
}
