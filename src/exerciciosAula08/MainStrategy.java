package exercicios.designPartterns;

public class MainStrategy {
	public static void main(String[] args) {
		CarrinhoCompras carrinho = new CarrinhoCompras();

		// Usando cartão de crédito
		MetodoPagamento cartaoCredito = new CartaoCredito();
		carrinho.setMetodoPagamento(cartaoCredito);
		carrinho.finalizarCompra(100.00);

		// Usando PayPal
		MetodoPagamento paypal = new PayPal();
		carrinho.setMetodoPagamento(paypal);
		carrinho.finalizarCompra(50.00);

		// Usando transferência bancária
		MetodoPagamento transferencia = new TransferenciaBancaria();
		carrinho.setMetodoPagamento(transferencia);
		carrinho.finalizarCompra(200.00);
	}
}
