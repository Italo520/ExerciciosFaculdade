public class Gerente extends Funcionario {
    private String senha;
 
    // ESTE é o construtor correto que você precisa ter
    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);  // Chama o construtor da classe pai
        this.senha = senha;
    }

    @Override
    public double calcularBonificacao(){
        return (getSalario() * 15) / 100;
    }
}