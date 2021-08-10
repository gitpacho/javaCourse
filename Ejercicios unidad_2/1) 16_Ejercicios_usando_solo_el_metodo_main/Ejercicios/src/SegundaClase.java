public class SegundaClase {
    public static void main(String[] args) {
        Circulo cir1 = new Circulo();
        cir1.setRadio(4.0f);
        System.out.println("El radio es: " + cir1.getRadio());
        Double area = cir1.calcularArea();
        System.out.println("El area es: " + area);
    }
}


class Circulo{
    private Float radio;
    private final Float PI = 3.1416f;
    
    public Circulo(Float radio) {
        this.radio = radio;
    }

    public Float getRadio() {
        return radio;
    }
    public void setRadio(Float radio) {
        this.radio = radio;
    }

    public Double calcularArea(){
        Double area;
        area = PI * Math.pow(radio, 2);
        return area;
    }





    
}