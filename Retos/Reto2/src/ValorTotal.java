public class ValorTotal {
    public Double ValorTotalGrabados = 0.0;
    public Double ValorTotalGrabadosRelieve = 0.0;
    public Double ValorTotalGrabadosPlano = 0.0;
    public Double Total = 0.0;
    private Grabado[] listaGrabados;

    public ValorTotal(Grabado[] listaGrabados) {
        this.listaGrabados = listaGrabados;
    }
    
    public void mostrarTotales(){
        for (Grabado grabado : listaGrabados) {
            if (grabado.getClass().getName() == "Grabado"){ValorTotalGrabados += grabado.calcularPrecio();}
            else if (grabado.getClass().getName() == "Relieve"){ValorTotalGrabadosRelieve += grabado.calcularPrecio();}
            else if (grabado.getClass().getName() == "Plano"){ValorTotalGrabadosPlano += grabado.calcularPrecio();}
        }
        Total = this.ValorTotalGrabados + this.ValorTotalGrabadosRelieve + this.ValorTotalGrabadosPlano;


        System.out.println(Math.round(ValorTotalGrabados));
        System.out.println(Math.round(ValorTotalGrabadosRelieve));
        System.out.println(Math.round(ValorTotalGrabadosPlano));
        System.out.println(Math.round(Total));

    }
}
