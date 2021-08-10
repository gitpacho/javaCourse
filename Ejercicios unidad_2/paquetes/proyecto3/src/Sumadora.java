
public class Sumadora {   
    private String color;
    private Double forma;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getForma() {
        return forma;
    }

    public void setForma(Double forma) {
        this.forma = forma;
    }

    public Sumadora(String color) {
        this.color = color;
        System.out.println("Ha creado un objeto que invoca un Constructor sin parámetros");
    }

    public Sumadora(Double forma) {
        this.forma = forma;
        System.out.println("Ha creado un objeto que invoca un Constructor sin parámetros");
    }

    public Sumadora() {
        System.out.println("Ha creado un objeto que invoca un Constructor sin parámetros");
    }

    public Sumadora(int a) {
        System.out.println("Ha creado un objeto que invoca un Constructor con parámetros");
    }






    public void saludar(){
        System.out.println("HOla desde sumadora");
    }

    //Se puede utilizar el mismo nombre para dos metodos distintos, 
    //para hacer sobrecarga de metodos


    //Sobrecarga por tipo

    public int CalcularSuma(int a, int b){
        return a + b;
    }

    public Double CalcularSuma(Double a, Double b){
        return a + b;
    }
    public Float CalcularSuma(Float a, Float b){
        return a + b;
    }
    public String CalcularSuma(String a, String b){
        return a + b;
    }
    
    //sobrecarga por parámetros

    public Double CalcularSuma(Double a){
        return a + 10000;
    }
    
}
