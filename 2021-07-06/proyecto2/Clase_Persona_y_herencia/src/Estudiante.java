public class Estudiante extends Persona{
    //Atributos (Nombre, edad, Id), getters y setters son heredados

    //atributo propio de Estudiante debe crearse
    private int numeroCarnet;

    //constructor
    public Estudiante(String nombre, Float edad, Integer documentoId, int numeroCarnet){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setDocumentoId(documentoId);
        this.numeroCarnet = numeroCarnet;
    }

    public int getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(int numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

    //getter y seter del atributo nuevo

    



}
