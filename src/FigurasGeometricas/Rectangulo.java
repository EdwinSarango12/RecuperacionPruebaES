package FigurasGeometricas;

public class Rectangulo {
    private Double base2;
    private Double altura2;

    public Rectangulo(Double base2, Double altura2) {
        this.base2 = base2;
        this.altura2 = altura2;
    }
    private double getBase2() {
        return base2;
    }
    public void setBase2(Double base2) {
        this.base2 = base2;
    }
    private double getAltura2() {
        return altura2;
    }
    public void setAltura2(Double altura) {
        this.altura2 = altura2;
    }

    public Double AreaRectangulo(){return base2 * altura2;}
    public Double PerimetroRectangulo(){return 2 * (base2+altura2) ;}
}
