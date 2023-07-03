package exerciciosAula03;

public class Exercicio03 {
    public static void main(String[] args) {
        Retangulo2 retangulo = new Retangulo2(5, 10);
        retangulo.exibirInformacoes();
        retangulo.calcularArea();
    }
}

class Forma2 {
    public void exibirInformacoes() {
        System.out.println("Esta é uma forma geométrica.");
    }
}

class Retangulo2 extends Forma2 {
    private int largura;
    private int altura;

    public Retangulo2(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

 
    public void exibirInformacoes() {
        System.out.println("Este é um retângulo com largura " + largura + " e altura " + altura + ".");
    }

    public void calcularArea() {
        int area = largura * altura;
        System.out.println("A área do retângulo é: " + area);
    }
}
