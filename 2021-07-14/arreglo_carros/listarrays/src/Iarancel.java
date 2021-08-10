public interface Iarancel {
    public final Double ARANCEL = 0.2;
    public default Double calcularArancel(Double precioProduccion){
        return precioProduccion * ARANCEL;
    }
}
