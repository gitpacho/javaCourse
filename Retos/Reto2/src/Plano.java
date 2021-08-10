public class Plano extends Grabado{
    private String procedimiento;

    public Plano(Integer antiguedad, Boolean autenticado, Double precioBase, String procedimiento) {
        super(antiguedad, autenticado, precioBase);
        this.procedimiento = procedimiento;
    }

    @Override
    public Double calcularPrecio() {
        Double precioFinal = super.calcularPrecio();
        if      (this.procedimiento == "SERIGRAFIA") {precioFinal = precioFinal + 700.;}
        else if (this.procedimiento == "MONOPATIA")  {precioFinal = precioFinal + 300.;}
        else if (this.procedimiento == "LITOGRAFIA") {precioFinal = precioFinal + 100.;}
        return precioFinal;
    }
}
