public class TerceraClase {
    public static void main(String[] args) {
        Productos prod1 = new Productos(2500.0, 0.19);
        System.out.println("El precio es : " + prod1.getPrecio());
        System.out.println("El IVA es: " + prod1.getIva());
    }
}

class Productos{
    //constructor de esta clase
    private Double precio;
    private Double iva;

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Productos(Double precio, Double iva) {
        this.precio = precio;
        this.iva = iva;
    }


}