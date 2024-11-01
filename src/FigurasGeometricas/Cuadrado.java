package FigurasGeometricas;

public class Cuadrado {
    private double lado1;

    public Cuadrado(double lado1) {
        this.lado1 = lado1;
    }
    public double getLado1(Double lado1) {
        return this.lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public Double AreaCuadrado() {return Math.pow(lado1, 2);}
    public Double PerimetroCuadrado() {return lado1 * 4;}
}
