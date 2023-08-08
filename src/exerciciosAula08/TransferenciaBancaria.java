package exercicios.designPartterns;

public class TransferenciaBancaria implements MetodoPagamento {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado por transferência bancária.");
    }
}
