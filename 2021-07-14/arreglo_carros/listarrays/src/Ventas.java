import java.util.ArrayList;

public class Ventas {
    private ArrayList<Vehiculo> arrayVehiculos;
    private Double ventasVehiculos = 0.;
    private Double ventasAutos = 0.;
    private Double ventasCamiones = 0.;
    private Double ventasTotales = 0.;
    
    public Ventas(ArrayList<Vehiculo> arrayVehiculos) {
        this.arrayVehiculos = arrayVehiculos;
        for (Vehiculo vehiculo : arrayVehiculos) {
            System.out.println(vehiculo);
            if(vehiculo.getClass().getName() == "Vehiculo"){this.ventasVehiculos += vehiculo.calcularPrecioVenta();}
            else if(vehiculo.getClass().getName() == "Auto"){this.ventasAutos += vehiculo.calcularPrecioVenta();
            System.out.println("-----------" + ventasAutos);}
            else if(vehiculo.getClass().getName() == "Camion"){this.ventasCamiones += vehiculo.calcularPrecioVenta();}
        }
        this.ventasTotales = this.ventasAutos + this.ventasCamiones + this.ventasVehiculos;
    }

    @Override
    public String toString() {
        return "-----Ventas----\n" +
           "ventasAutos      : " + ventasAutos + 
         "\nventasVehiculos  : " + ventasVehiculos +
         "\nventasCamiones   : " + ventasCamiones + 
         "\nventasTotales    : " + ventasTotales;
    }    
}