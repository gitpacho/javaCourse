public class Vehiculo {
    protected String placa;
    protected String fabricante;
    protected Double precio;
    
    public Vehiculo(String placa, String fabricante, Double precio) {
        this.placa = placa;
        this.fabricante = fabricante;
        this.precio = precio;
    }
    public String getPlaca() {
        return placa;
    }
    public String getFabricante() {
        return fabricante;
    }
    public Double getPrecio() {
        return precio;
    }
}
