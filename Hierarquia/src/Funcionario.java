public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;


    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public double calcularBonificacao(){
        return (salario * 10) / 100;
    }

    public double getSalario() {
        return salario;
    }

    

}