package aula3oo.estatico;


public class Contador {
    private static int contador = 0; // Atributo estático
    
    public Contador() {
        contador++; // Incrementa o contador a cada criação de objeto
    }
    
    public static int getContagem() {
        return contador; // Método estático para obter o valor do contador
    }
}
