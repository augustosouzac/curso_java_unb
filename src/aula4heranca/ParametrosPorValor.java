package aula4heranca;

public class ParametrosPorValor {

	    public static void main(String[] args) {
	        int x = 5;
	        incrementar(x);
	        System.out.println(x); // Exibe 5, pois o valor original não foi alterado
	    }
	    
	    public static void incrementar(int num) {
	        num = num + 1;
	    }
	}