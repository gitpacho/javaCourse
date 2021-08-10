public class Circulo {
    static float pi = 3.14f;
    public float radio = 0;
    
    public Circulo(float radio) {
        this.radio = radio;
    }

    public float area(){
        return pi * (float)Math.pow( this.radio, 2);
    }

    

}
