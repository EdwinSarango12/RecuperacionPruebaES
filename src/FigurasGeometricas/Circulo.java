package FigurasGeometricas;
import java.lang.Math;

public class Circulo {
    private double n1;
    public Circulo(double n1) {
        this.n1 = n1;
    }
    private double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public Double AreaCirculo(){return (2*Math.PI*Math.pow(n1,2));}
    public Double PerimetroCirculo(){return (2*Math.PI*n1);}
}
