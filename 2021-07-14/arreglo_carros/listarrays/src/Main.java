import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Amarillo", TipoFabricante.BMW, 10000.);
        Vehiculo vehiculo2 = new Vehiculo("Verde", TipoFabricante.BMW, 10000.);
        Vehiculo vehiculo3 = new Vehiculo("Azul", TipoFabricante.BMW, 10000.);
        Auto auto1 = new Auto("Morado", TipoFabricante.CHEVROLET, 5000., 3);
        Auto auto2 = new Auto("Azul", TipoFabricante.CHEVROLET, 5000., 3);
        Auto auto3 = new Auto("Rojo", TipoFabricante.Renoult, 5000., 3);
        Camion camion1 = new Camion("Gris", TipoFabricante.Renoult, 8000., 4);

        ArrayList<Vehiculo> arrayVehiculos = new ArrayList<Vehiculo>();
        arrayVehiculos.add(vehiculo1);
        arrayVehiculos.add(vehiculo2);
        arrayVehiculos.add(vehiculo3);
        arrayVehiculos.add(auto1);
        arrayVehiculos.add(auto2);
        arrayVehiculos.add(auto3);
        arrayVehiculos.add(camion1);
        
        Ventas ventas1 = new Ventas(arrayVehiculos);
        System.out.println(ventas1);

    }
}
