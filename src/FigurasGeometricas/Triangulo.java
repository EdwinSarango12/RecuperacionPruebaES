package FigurasGeometricas;

public class Triangulo {
    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Double getBase() {
        return base;
    }
    public void setBase(Double base) {
        this.base = base;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double AreaTriangulo() {return (base*altura)/2;}
    public Double PerimetroTriangulo() {return base*(2*altura);}
}
