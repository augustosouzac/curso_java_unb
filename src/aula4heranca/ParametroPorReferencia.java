package aula4heranca;

public class ParametroPorReferencia {

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3};
	        modificarArray(arr);
	        for (int i = 0; i < arr.length; i++) {	        	
	        	System.out.println(arr[i]); // Exibe [4, 5, 6], pois o array original foi modificado
	        }
	    }
	    
	    public static void modificarArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            array[i] = array[i] + 3;
	        }
	    }
	}