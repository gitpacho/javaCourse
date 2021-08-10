public class MiPrimeraClase {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.establecerAtributos("azul", "Nissan", 2018);
        carro2.establecerAtributos("NN", "NN", 1900);
        
        //carro1.color = "negro";
        //carro1.marca = "bmw";
        //carro1.modelo = 2010;

        System.out.println("Color: " + carro1.color);
        System.out.println("Marca: " + carro1.marca);
        System.out.println("modelo: " + carro1.modelo);
        carro1.acelerar();
        carro1.frenar();
        System.out.println("Color: " + carro2.color);
        System.out.println("Marca: " + carro2.marca);
        System.out.println("modelo: " + carro2.modelo);
    }
}

class Carro{
    String color;
    String marca;
    Integer modelo;

    void establecerAtributos(String color, String marca, Integer modelo){
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }
    void acelerar(){
        System.out.println("Estoy acelerando");
    }
    void frenar(){
        System.out.println("El carro está frenando");
    }

    
}