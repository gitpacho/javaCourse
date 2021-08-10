import java.util.*;

public class CarroMain {
    public static void main(String[] args) throws Exception {
        Carro[] carros = new Carro[2];
        carros[0] = new Carro("CHEVROLET");
        carros[1] = new Carro("MAZDA");
        System.out.println("Informacion del objeto ubicado en 0 : " + carros[0].getMarca());
        System.out.println(carros[0]);  //estoy ingresando un obteto Carro, y este tiene implementado el étodo tostring que maneja sysout

        for (int i = 0; i < carros.length; i++){
            System.out.println("Indice: " + i + " Valor: " + carros[i].getMarca());
        }

        System.out.println("---------------arraylist------------");
        ArrayList<Carro> carrosLista = new ArrayList<>();
        carrosLista.add(new Carro("Nissan"));
        carrosLista.add(new Carro("Ferrari"));
        System.out.println(carrosLista.size());
        System.out.println(carrosLista.get(0));


        System.out.println("---------------conjuntos------------");
        Set<Carro> carrosConjunto = new HashSet<>();
        carrosConjunto.add(new Carro("pichirilo rojo"));
        carrosConjunto.add(new Carro("Toyota"));
        carrosConjunto.add(new Carro("BMW"));

        System.out.println("TAmaño del conjunto: " + carrosConjunto.size());
        for (Carro carro : carrosConjunto) {
            System.out.println(carro.getMarca());
        }

        System.out.println("---------------mapas------------");

        Map<String, Carro> carrosMap = new HashMap<>();
        carrosMap.put("uno", new Carro("KIA"));
        carrosMap.put("dos", new Carro("MAZDA"));
        System.out.println(carrosMap.size());
        System.out.println(carrosMap.get("uno"));
        
    }
}


