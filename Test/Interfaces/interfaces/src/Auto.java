public class Auto extends Vehiculo implements Idetermine, Iarancel{
    private Integer numeroAirbags;
    private TipoVehiculo tipo;
    
    public Auto(String placa, String fabricante, Double precio, Integer numeroAirbags, TipoVehiculo tipo) {
        super(placa, fabricante, precio);
        this.numeroAirbags = numeroAirbags;
        this.tipo = tipo;
    }
    public Integer getNumeroAirbags() {
        return numeroAirbags;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }
    @Override
    public Double calcularCosto(Double factor) {
        return precio + (numeroAirbags * IVA / 100);
    }
    @Override
    public Double calcularArancel() {
        return ;
    }

    


}
