public class Estudiante extends Persona {
    private int numeroCarnet;
    public Estudiante(String nombre, float edad, int documentoid, int numeroCarnet){
        this.nombre = nombre;
        this.edad = edad;
        this.documentoid = documentoid;
        this.numeroCarnet = numeroCarnet;
    }

    @Override
    public void mostrarEdad(){
        System.out.println("La edad mk del estudiante es: " + edad);
    }


}
