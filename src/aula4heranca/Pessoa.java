package aula4heranca;

public class Pessoa {
    private String nome;
    private int idade;
    
    // Construtor e métodos getters e setters
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Pessoa pessoa = (Pessoa) obj;
        return idade == pessoa.idade && this.nome.equals(pessoa.nome) ;
    }
    
    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + idade;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
}
