package exerciciosAula04;

public class Exercicio05 {
	public static void main(String[] args) {
		PagamentoCartao pc = new PagamentoCartao();
		PagamentoBoleto pb = new PagamentoBoleto();
		
		System.out.println("Pagamento com cartão: "+pc.processarPagamento(100));
		System.out.println("Pagamento com boleto: "+pb.processarPagamento(100));
	}
}
