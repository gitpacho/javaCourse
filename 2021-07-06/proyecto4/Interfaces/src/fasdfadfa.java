/*public class fasdfadfa {
    private Double totalValorV;
    private Double totalValorCamion;
    private Double totalValorAuto;
    private Vehiculo[] listaVehiculos;
    public fasdfadfa(Vehiculo[] listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public void PresentarTotales(){
        for(int i = 0; i < listaVehiculos.length; i++){
            if(listaVehiculos[i].getClass().getName() == "Vehiculo"){
                totalValorV += listaVehiculos[i].calcularCosto();
            } else if (listaVehiculos[i].getClass().getName() == "Camion"){
                totalValorCamion += listaVehiculos[i].calcularCosto();
            } else if (listaVehiculos[i].getClass().getName() == "Auto"){
                totalValorAuto += listaVehiculos[i].calcularCosto();
            }
        }
        System.out.println("El valor de los vehículos generales es: " + totalValorV);
        System.out.println("El valor de los camiones es: " + totalValorCamion);
        System.out.println("El valor de los autos es: " + totalValorAuto);   
    }
}
*/