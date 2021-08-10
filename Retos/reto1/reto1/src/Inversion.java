public class Inversion {
    public int tiempo;
    public double capital;
    public double interes;

    public Inversion(){
        tiempo = 0;
        capital = 0.0;
        interes = 0.0;
    }

    public Inversion(int tiempo, double capital, double interes) {
        this.tiempo = tiempo;
        this.capital = capital;
        this.interes = interes;
    }

    public double analizarInversion(){
        return Math.round(calcularInteresCompuesto() - calcularInteresSimple());
    }

    public double analizarInversion(int tiempo, double capital, double interes){
        double interesSimple;
        interesSimple = capital * (interes/100) * tiempo;
        interesSimple = Math.round(interesSimple);

        double interesCompuesto;
        interesCompuesto = capital * ( Math.pow(1 + (interes/100),  tiempo) - 1);
        interesCompuesto = Math.round(interesCompuesto);
        return Math.round(interesCompuesto - interesSimple);

    }

    public double calcularInteresSimple(){
        double interesSimple;
        interesSimple = this.capital * (this.interes/100) * this.tiempo;
        return Math.round(interesSimple);
    }

    public double calcularInteresCompuesto(){
        double interesCompuesto;
        interesCompuesto = this.capital * ( Math.pow(1 + (this.interes/100),  this.tiempo) - 1);
        return Math.round(interesCompuesto);
    }

}
