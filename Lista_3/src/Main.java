import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso do paciente (kg): ");
        float peso = scanner.nextFloat();

        System.out.print("Digite a altura do paciente (m): ");
        float altura = scanner.nextFloat();

        Paciente p1 = new Paciente();
        p1.setPeso(peso);
        p1.setAltura(altura);

        Nutricionista nutricionista = new Nutricionista();
        String classificacao = nutricionista.avaliarIMC(p1);

        System.out.println("Classificação do IMC: " + classificacao);
    }
}
