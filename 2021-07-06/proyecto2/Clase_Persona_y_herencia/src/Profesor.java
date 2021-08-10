public class Profesor extends Persona {
    //Atributos (Nombre, edad, Id), getters y setters son heredados
    //Atributo propio de profesor
    private Double salario;
    private String materiaEsp;

    //constructor
    public Profesor(String nombre, Float edad, Integer documentoId, String materiaEsp){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setDocumentoId(documentoId);
        this.materiaEsp = materiaEsp;
    }

    //metodos
    public Double calcularSalario(Double salario){
        return salario + salario * 0.16;
    }

    
    @Override
    public void saludo() {
        // TODO Auto-generated method stub
        super.saludo();
        System.out.println("Hola soy profesor (saludo especializado)");

    }




    public Double getSalario() {
        return salario;
    }


    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public String getMateriaEsp() {
        return materiaEsp;
    }
    public void setMateriaEsp(String materiaEsp) {
        this.materiaEsp = materiaEsp;
    }


}
