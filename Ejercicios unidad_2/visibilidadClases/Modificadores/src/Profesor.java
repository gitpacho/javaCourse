public class Profesor {
    public static void main(String[] args) {
        notas nota1 = new notas();
        nota1.a = 0;
        System.out.println(nota1.a);
    }
}

final class notas{
    int a = 5;
    Profesor profe = new Profesor();
}