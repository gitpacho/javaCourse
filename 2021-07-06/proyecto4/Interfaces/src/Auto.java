public class Auto extends Vehiculo implements Iarancel{
    private Integer numeroAirbags;
    private TipoVehiculo tipo;

    public Auto(String placa, String marca, Integer precio, Integer numeroAirbags, TipoVehiculo tipo) {
        super(placa, marca, precio);
        this.numeroAirbags = numeroAirbags;
        this.tipo = tipo;
    }
    
    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public Integer getNumeroAirbags() {
        return numeroAirbags;
    }
    public void setNumeroAirbags(Integer numeroAirbags) {
        this.numeroAirbags = numeroAirbags;
    }
    @Override
    public Integer calcularCosto(Integer factor) {
        Integer costoAuto = this.precio + (this.numeroAirbags * factor);
        return costoAuto + (costoAuto *IVA / 100);
    }
}
