package aula4interface;

public class Usuario implements Autenticavel {
    @Override
    public boolean autenticar(String usuario, String senha) {
        // Implementação do método autenticar
    	return false;
    }

    @Override
    public void resetarSenha() {
        // Implementação do método resetarSenha
    }
}
