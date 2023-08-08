package aula6calculadora.framework;
/**
 *
 * @author jean
 */
public class Percent extends Operacao {

    public Percent(Nodo esquerda, Nodo direita) {
        super(esquerda, direita);
    }

    @Override
    protected int executa(int esquerda, int direita) {
        return (int)(((double)esquerda/100)*direita);
    }

    @Override
    protected String simbolo() {
        return "%";
    }
}
