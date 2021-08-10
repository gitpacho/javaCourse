public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Cristian", 25.0f, 11219, 123);
        System.out.println("-----Estudiante---");
        System.out.println("Nombre  : " + est1.getNombre());
        System.out.println("Edad    : " + est1.getEdad());
        System.out.println("DocId   : " + est1.getDocumentoId());
        System.out.println("Num_Car : " + est1.getNumeroCarnet());
        est1.saludo();

        System.out.println("-----Profesor---");
        Profesor prof1 = new Profesor("Pedro", 50.0f, 1121902, "Electrodinamica avanzada");
        System.out.println("Nombre      : " + prof1.getNombre());
        System.out.println("Edad        : " + prof1.getEdad());
        System.out.println("DocId       : " + prof1.getDocumentoId());
        System.out.println("Espcialidad : " + prof1.getMateriaEsp());
        prof1.saludo();
    
    }
}
