public class TerceraClase {
    public static void main(String[] args) {
        Productos prod1 = new Productos();
        System.out.println(prod1.getIva());
        
    }
}

class Productos{
    private Integer precio;
    private Double iva;

    public void Productosa(){
        this.iva = 0.19;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    

    


    

}
