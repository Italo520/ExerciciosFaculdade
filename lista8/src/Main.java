import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" CALCULADORA ");
        System.out.println("Operações disponíveis: Somar, Subtrair, Multiplicar, Dividir");

        while (true) {
            System.out.print("\nDigite a operação desejada ou sair : ");
            String operacao = scanner.nextLine().toLowerCase().trim();

            if (operacao.equals("sair")) {
                break;
            }

            System.out.print("Digite o primeiro número: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite o segundo número: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            switch (operacao) {
                case "somar":
                    new Somar(num1, num2).imprimirResultado();
                    break;
                case "subtrair":
                    new Subtrair(num1, num2).imprimirResultado();
                    break;
                case "multiplicar":
                    new Multiplicar(num1, num2).imprimirResultado();
                    break;
                case "dividir":
                    new Dividir(num1, num2).imprimirResultado();
                    break;
                default:
                    System.out.println("Operação '" + operacao + "' não reconhecida! Por favor, use uma das seguintes: somar, subtrair, multiplicar, dividir.");
            }
        }

    }
}