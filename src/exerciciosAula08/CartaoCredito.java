package exercicios.designPartterns;

public class CartaoCredito implements MetodoPagamento {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
    }
}
