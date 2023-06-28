package aula3oo.estatico;

public class ExemploAtributoEstatico {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        
        System.out.println("Contagem: " + Contador.getContagem()); // Saída: Contagem: 3
    }
}
