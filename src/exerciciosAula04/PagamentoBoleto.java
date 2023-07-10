package exerciciosAula04;

public class PagamentoBoleto implements ProcessadorPagamento{

	@Override
	public double processarPagamento(double valor) {
		return valor * 0.95;
	}

}
