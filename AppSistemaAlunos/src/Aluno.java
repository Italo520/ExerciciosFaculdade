public class Aluno extends Pessoa {
    private String matricula;
    private Curso curso;
    private double[] notas;
    private boolean ativo;


    public Aluno(String nome, String cpf, String idade, String email, String telefone, String matricula, Curso curso, double[] notas, boolean ativo) {
        super(nome, cpf, idade, email, telefone);
        this.matricula = matricula;
        this.curso = curso;
        this.notas = notas;
        this.ativo = ativo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
