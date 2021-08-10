public class Relieve extends Grabado{
    private Boolean linografia;

    public Relieve(Integer antiguedad, Boolean autenticado, Double precioBase, Boolean linografia) {
        super(antiguedad, autenticado, precioBase);
        this.linografia = linografia;
    }

    @Override
    public Double calcularPrecio() {
        double precioFinal = super.calcularPrecio();
        if (this.linografia == true){precioFinal += 700;}
        return precioFinal;
    }

}