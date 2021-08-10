public class Vehiculo implements Iarancel, Iiva{
    public String color;
    public TipoFabricante fabricante;
    public Double precioProduccion;

    public Vehiculo(String color, TipoFabricante fabricante, Double precioProduccion) {
        this.color = color;
        this.fabricante = fabricante;
        this.precioProduccion = precioProduccion;
    }

    @Override
    public String toString() {
        return "Vehiculo ---> color            : " + color + 
             "\n              fabricante       : " + fabricante + 
             "\n              precioProduccion : " + precioProduccion;
    }

    public Double calcularPrecioVenta(){
        Double ganancia = 0.2;
        return precioProduccion + calcularArancel(this.precioProduccion) + calcularIva(this.precioProduccion) + (precioProduccion * ganancia);
    }
}
