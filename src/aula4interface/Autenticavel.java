package aula4interface;

public interface Autenticavel {
    boolean autenticar(String usuario, String senha);
    void resetarSenha();
    // ...
}