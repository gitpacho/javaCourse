public class Camion extends Vehiculo{
    public Integer numEjes;
    private final Integer FACTOR = 200;
    public Camion(String color, TipoFabricante fabricante, Double precioProduccion, Integer numEjes) {
        super(color, fabricante, precioProduccion);
        this.numEjes = numEjes;
    }

    

    @Override
    public String toString() {
        return "Camion   ---> color            : " + color + 
             "\n              fabricante       : " + fabricante + 
             "\n              precioProduccion : " + precioProduccion + 
             "\n              numEjes          : " + numEjes;
    }



    @Override
    public Double calcularPrecioVenta() {
        Double acumulado = super.calcularPrecioVenta();
        return acumulado + (this.FACTOR * numEjes);
    }

}
