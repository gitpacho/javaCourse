public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Marla", 15.3f, 1121902563, 123);
        System.out.println(estudiante.getEdad());
        Profesor profesorsitomk = new Profesor("Milena", 40.3f, 2121902563, "inglés");
        System.out.println("Materia especialista: " + profesorsitomk.getMateriaEsp());
        System.out.println("Nombre de la profe: " + profesorsitomk.getNombre());
        profesorsitomk.mostrarEdad();
        



    }
}
