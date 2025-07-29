import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livraria livraria = new Livraria();
        int opcao = 0;

        do {
            System.out.println("\nLIVRARIA ");
            System.out.println("1 - Cadastrar novo livro");
            System.out.println("2 - Listar estoque");
            System.out.println("3 - Vender livro");
            System.out.println("4 - Consultar caixa");
            System.out.println("5 - Encerrar programa");
            System.out.print("Escolha uma opção: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    livraria.cadastrarLivro(scanner);
                    break;
                case 2:
                    livraria.listarEstoque();
                    break;
                case 3:
                    livraria.comprarLivros(scanner);
                    break;
                case 4:
                    livraria.exibirSaldo();
                    break;
                case 5:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);

    }
}