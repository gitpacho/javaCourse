public class MiPrimeraClase {
    public static void main(String[] args) {
        Carro carro1;
        carro1 = new Carro();
        //carro1.color = "azul";
        //carro1.marca = "Nissan";
        //carro1.modelo = 2018;

        carro1.establecerAtributos("azul", "NISSAN", 2018);
        System.out.println("El carro es de color: " + carro1.color);
        System.out.println("El carro es de marca: " + carro1.marca);
        System.out.println("El carro es modelo: " + carro1.modelo);
        //carro1.acelerar();
        //carro1.frenar();
    }
}

class Carro{ //Las clases inician en mayusculas
    String color;
    String marca;
    Integer modelo;

    void acelerar(){
        System.out.println("El carro está acelerando, que shusto!!");
    }

    void frenar(){
        System.out.println("El carro está frenando, menos mal");
    }

    void establecerAtributos(String colorc, String marcac, Integer modeloc){
        this.color = colorc;
        this.marca = marcac;
        this.modelo = modeloc;


    }
}