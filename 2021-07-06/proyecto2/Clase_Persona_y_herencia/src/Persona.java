public class Persona {
    //Atributos
    private String nombre;
    private Float edad;
    private Integer documentoId;

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Float getEdad() {
        return edad;
    }
    public void setEdad(Float edad) {
        this.edad = edad;
    }
    public Integer getDocumentoId() {
        return documentoId;
    }
    public void setDocumentoId(Integer documentoId) {
        this.documentoId = documentoId;
    }

    //Método saludar
    public void saludo(){
        System.out.println("Saludo por defecto");
    }


}
