import java.util.Scanner;

public class ProgramaTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contEquilatero = 0;
        int contIsosceles = 0;
        int contEscaleno = 0;

        int opcao;

        do {

            System.out.print("Digite o valor do lado 1: ");
            int lado1 = scanner.nextInt();

            System.out.print("Digite o valor do lado 2: ");
            int lado2 = scanner.nextInt();

            System.out.print("Digite o valor do lado 3: ");
            int lado3 = scanner.nextInt();

            Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

            TiposDeTriangulo tipo = triangulo.tipo();

            System.out.println("Tipo do triângulo: " + tipo);

            if (tipo == TiposDeTriangulo.EQUILATERO) {
                contEquilatero++;
            } else if (tipo == TiposDeTriangulo.ISOSCELES) {
                contIsosceles++;
            } else {
                contEscaleno++;
            }
            System.out.print("\ncadastrar um novo triângulo? (1-Sim / 0-Não): ");
            opcao = scanner.nextInt();

        } while (opcao == 1);

        System.out.println("\n=== Resultado Final ===");
        System.out.println("Quantidade de triângulos equiláteros: " + contEquilatero);
        System.out.println("Quantidade de triângulos isósceles: " + contIsosceles);
        System.out.println("Quantidade de triângulos escalenos: " + contEscaleno);
    }
}