public class PersonaMain {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Cristian Pachon", 1.75, 25);
        Persona persona2 = new Persona("Daniel Orosco", 1.50, 10);
        //System.out.println("Nombre: " + persona1.nombre);
        //System.out.println("Edad: " + persona1.edad);
        //System.out.println("Altura: " + persona1.altura);

        persona1.setNombre("CRISTIAN PACHON");
        persona2.setEdad(11);
        
        System.out.println("Nombre Persona1: " + persona1.getNombre());
        System.out.println("Nombre Persona2: " + persona2.getNombre());

        System.out.println("Altura Persona1: " + persona1.getAltura());
        System.out.println("Altura Persona2: " + persona2.getAltura());

        System.out.println("Edad Persona1: " + persona1.getEdad());
        System.out.println("Edad Persona2: " + persona2.getEdad());


    
    }
}
