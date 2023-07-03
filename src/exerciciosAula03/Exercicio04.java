package exerciciosAula03;

public class Exercicio04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Antes da chamada do método: a = " + a + ", b = " + b);
        alterarValores(a, b);
        System.out.println("Após a chamada do método: a = " + a + ", b = " + b);
    }

    public static void alterarValores(int x, int y) {
        x += 5;
        y *= 2;
        System.out.println("Dentro do método: x = " + x + ", y = " + y);
    }
}