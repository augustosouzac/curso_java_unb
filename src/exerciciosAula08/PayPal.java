package exercicios.designPartterns;

public class PayPal implements MetodoPagamento {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PayPal.");
    }
}

