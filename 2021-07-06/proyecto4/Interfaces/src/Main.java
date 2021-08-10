public class Main {
    public static void main(String[] args) {
        //Integer costoTotal;
        //Camion camion1 = new Camion("kfq717", "JAL", 45000, 3);
        /*
        System.out.println("--Datos del Camion1--");
        System.out.println("Placa: " + camion1.getPlaca());
        System.out.println("Marca: " + camion1.getMarca());
        System.out.println("Ejes : " + camion1.getNumeroEjes());
        System.out.println("Precio : " + camion1.precio);

        costoTotal = camion1.calcularCosto(250);
        System.out.println("El costo total mas IVA es de: " + costoTotal + "\n");

        Auto auto1 = new Auto("SMN065", "CHEVROLET", 20000, 6, TipoVehiculo.DEPORTIVO);
        System.out.println("--Datos del auto--");
        System.out.println("Placa   : " +   auto1.getPlaca());
        System.out.println("Marca   : " +   auto1.getMarca());
        System.out.println("Ejes    : " +   auto1.getNumeroAirbags());
        System.out.println("Precio  : " + auto1.precio);
        System.out.println("Tipo es : " + auto1.getTipo());
        System.out.println("Arancel : " + auto1.calcularArancel(costoTotal));

        
        costoTotal = auto1.calcularCosto(120);

        System.out.println("El costo total mas IVA es de: " + costoTotal);

        System.out.println("Arancel: " + auto1.calcularArancel(costoTotal));
        */

        Vehiculo[] vehiculos = new Vehiculo[4];
        vehiculos[0] = new Auto("SMN065", "CHEVROLET", 20000, 6, TipoVehiculo.DEPORTIVO);
        vehiculos[1] = new Camion("kfq717", "JAL", 45000, 3);
        vehiculos[2] = new Vehiculo("IRY256", "AKT", 1800);
        vehiculos[3] = new Vehiculo("PPP", "bmx", 300);
        Total respuesta = new Total(vehiculos);
        respuesta.presentarTotales();

    }
}
