public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }

    public boolean isIdadeValida(int idade) {
        return idade >= 0 && idade <= 120;
    }

    public void setIdade(int idade) throws IllegalArgumentException {

        if (!isIdadeValida(idade)) {
            throw new IllegalArgumentException("Idade inválida: " + idade);
        }
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }

    
}
