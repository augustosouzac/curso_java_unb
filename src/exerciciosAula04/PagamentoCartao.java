package exerciciosAula04;

public class PagamentoCartao implements ProcessadorPagamento{

	@Override
	public double processarPagamento(double valor) {
		return valor * 1.05;
	}

}
