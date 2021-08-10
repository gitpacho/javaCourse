public class Persona {
    //atributos
    private String nombre;
    private Double altura;
    private int edad;

    //Constructor
    public Persona(String nombre, Double altura, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
    }

    //getters and setters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
