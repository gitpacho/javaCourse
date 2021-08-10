public class Cuadrado extends FiguraGeometrica{
    private Float lado;

    public Cuadrado(Float lado){
        this.lado = lado;
    }

    @Override
    public float area() {
        // TODO Auto-generated method stub
        return lado * lado;
    }

    @Override
    public float perimetro() {
        // TODO Auto-generated method stub
        return 4 * lado;
    }
    

    
}
