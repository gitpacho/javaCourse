public class MiSegundaClase {
    public static void main(String[] args){   
        Circulo circ1 = new Circulo();
        circ1.setRadio(4.0f);
        System.out.println("El radio es : " + circ1.getRadio());
        System.out.println("El area es: " + circ1.area());
    }
}

class Circulo{
    private Float radio;
    final Float PI = 3.1416f;
    
    public Float getRadio() {
        return radio;
    }
    public void setRadio(Float radio) {
        this.radio = radio;
    }

    //public Double calcularAarea(){
    //    Double area;
    //    area = PI*Math.pow(this.radio, 2);
    //    return area;
    //}

    public float area(){
        float area;
        area = PI*(float)Math.pow(this.radio, 2);
        return area;
    }
    
}