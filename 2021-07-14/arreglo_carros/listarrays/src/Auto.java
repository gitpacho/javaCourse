public class Auto extends Vehiculo{
    public Integer numAirbags;
    private final Double FACTOR = 120.;

    public Auto(String color, TipoFabricante fabricante, Double precioProduccion, Integer numAirbags) {
        super(color, fabricante, precioProduccion);
        this.numAirbags = numAirbags;
    }
    
    @Override
    public String toString() {
        return "Auto     ---> color            : " + color + 
             "\n              precioProduccion : " + precioProduccion + 
             "\n              fabricante       : " + fabricante + 
             "\n              numEjes          : " + numAirbags;
    }

    public Double calcularPrecioVenta(){
        Double acumulado = super.calcularPrecioVenta();
        return acumulado + (numAirbags * this.FACTOR);
    }



    
}
