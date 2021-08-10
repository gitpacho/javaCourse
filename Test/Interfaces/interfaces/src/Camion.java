public class Camion extends Vehiculo implements Idetermine{
    private Integer numEjes;

    public Camion(String placa, String fabricante, Double precio, Integer numEjes) {
        super(placa, fabricante, precio);
        this.numEjes = numEjes;
    }

    @Override
    public Double calcularCosto(Double factor) {
        return precio + (this.numEjes * IVA);
    }

    public Integer getNumEjes() {
        return numEjes;
    }
}
