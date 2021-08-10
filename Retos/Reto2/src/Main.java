public class Main {
    public static void main(String[] args) {
        /*
        Grabado grabado1 = new Grabado(60, true, 1000.0);
        System.out.println(grabado1.calcularPrecio());
        Grabado grabado2 = new Grabado();
        System.out.println(grabado2.calcularPrecio());
        System.out.println(grabado1.calcularPrecio() + grabado2.calcularPrecio());
        */
        /*
        Grabado grabado1 = new Plano(66, true, 80.0, "SERIGRAFIA");
        Grabado grabado2 = new Plano(90, true, 180.0, "MONOPATIA");
        System.out.println(grabado1.calcularPrecio() + grabado2.calcularPrecio());
        */

        Grabado[] grabados = new Grabado[4];
        grabados[0] = new Grabado();
        grabados[1] = new Grabado(80, false, 3000.0);
        grabados[2] = new Relieve(90, false, 2000.0, false);
        grabados[3] = new Plano(35, true, 90.0, "LITOGRAFIA");
        ValorTotal respuesta = new ValorTotal(grabados);
        respuesta.mostrarTotales();
    }
}
