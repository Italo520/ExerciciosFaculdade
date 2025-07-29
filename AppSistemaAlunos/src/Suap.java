import java.util.ArrayList;

public class Suap {
    private ArrayList<Aluno> alunos;
    private  ArrayList<Curso> cursos;

    public Suap(){
        this.alunos = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // cadastrar alunos
    public void adicionarAlunos(Aluno aluno) {
        alunos.add(aluno);
    }

    // listar alunos
    public void listarAlunos(){
        for (Aluno aluno : alunos){
            System.out.println("Nome: " + aluno.getNome() +"| Matricula" + aluno.getMatricula() );
        }
    }

    // Buscar aluno por matricula
    public Aluno buscarAlunoPorMatricula(String matricula){
        for (Aluno aluno : alunos){
            if (aluno.getMatricula().equals(matricula)){
                return aluno;
            }
        }
        return null;
    }

    // cadastrar novo curso

    public void adicionarCurso(Curso curso){
        cursos.add(curso);
    }
}
