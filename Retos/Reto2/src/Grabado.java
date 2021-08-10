class Grabado {  
    private final static Double PRECIOBASE = 350.0;
    private final static Integer ANTIGUEDAD = 50;
    private final static Boolean AUTENTICADO = false;

    private Integer antiguedad;
    private Boolean autenticado;
    private Double precioBase;

    public Grabado() {
        this.antiguedad = ANTIGUEDAD;
        this.autenticado = false;
        this.precioBase = PRECIOBASE;
    }

    public Grabado(Integer antiguedad, Boolean autenticado, Double precioBase) {
        this.antiguedad = antiguedad;
        this.autenticado = autenticado;
        this.precioBase = precioBase;
    }

    public Double calcularPrecio() {
        Double precioFinal = this.precioBase;
        if (this.antiguedad >= 50 && this.antiguedad <= 70){precioFinal = precioBase * 1.1;}
        else if (this.antiguedad > 70 && this.antiguedad <= 120){precioFinal = precioBase * 1.25;}
        else if (this.antiguedad > 120){precioFinal = precioBase * 1.4;}
        
        if (this.autenticado == true){precioFinal = precioFinal + 800;}
        return precioFinal;
    }
}



