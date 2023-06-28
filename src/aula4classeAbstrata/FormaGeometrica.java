package aula4classeAbstrata;

public abstract class FormaGeometrica {
    private String cor;

    public FormaGeometrica(String cor) {
        this.cor = cor;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}