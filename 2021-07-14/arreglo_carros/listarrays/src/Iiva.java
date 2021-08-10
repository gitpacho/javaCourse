public interface Iiva {
    public final Double IVA = 0.16;
    public default Double calcularIva(Double precioProduccion){
        return precioProduccion *IVA;
    }
}
