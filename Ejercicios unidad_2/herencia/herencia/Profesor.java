public class Profesor extends Persona {
    private String materiaEsp;
    public Profesor(String nombre, float edad, int documentoid, String materiaEsp){
        this.nombre = nombre;
        this.edad = edad;
        this.documentoid = documentoid;
        this.materiaEsp = materiaEsp;
    }

    @Override
    public void mostrarEdad(){
        super.mostrarEdad();
        System.out.println("La edad del profe bello: " + edad);
    }


    
    public String getMateriaEsp() {
        return materiaEsp;
    }
    public void setMateriaEsp(String materiaEsp) {
        this.materiaEsp = materiaEsp;
    }

    
 
}
