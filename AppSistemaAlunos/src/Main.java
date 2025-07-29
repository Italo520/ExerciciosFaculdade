import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();

        alunos.add("italo");
        alunos.add("maria");
        alunos.add("João");
        alunos.add("pedro");

        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("Aluno " + (i+1)+ " " + alunos.get(i));
        }
        }
    }
