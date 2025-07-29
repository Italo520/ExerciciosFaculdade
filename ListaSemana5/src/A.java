import java.util.Objects;
import java.util.Scanner;

public class Livro {
    private String titulo;
    private int anoDePublicacao;
    private int quantidadeDisponivel;
    private float preco;


    public Livro(String titulo, int anoDePublicacao, int quantidadeDisponivel, float preco) {
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
    }



    public boolean equals(Livro outroLivro) {
        if (outroLivro == null) {
            return false;
        }
        return this.titulo.equals(outroLivro.getTitulo());
    }


    public int hashCode() {
        return titulo.hashCode();
    }

    public void vender(){
        if (quantidadeDisponivel > 0){
            quantidadeDisponivel--;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}


import java.util.Scanner;

public class Livraria {
    private Livro[] estoque;
    private int   quantidadeDeLivrosCadastrados;
    private float saldoEmCaixa;


    public Livraria() {
        this.estoque = new Livro[100];
        this.quantidadeDeLivrosCadastrados = 0;
        this.saldoEmCaixa = 0;
    }

    public Livro[] getEstoque() {
        return estoque;
    }

    public int getQuantidadeDeLivrosCadastrados() {
        return quantidadeDeLivrosCadastrados;
    }

    public float getSaldoEmCaixa() {
        return saldoEmCaixa;
    }

    public boolean cadastrarLivro(Livro livro){
        for (int i = 0; i < quantidadeDeLivrosCadastrados; i++) {
            if (estoque[i].equals(livro)) {
                return false;
            }
        }

        if (quantidadeDeLivrosCadastrados<100){
            estoque[quantidadeDeLivrosCadastrados] = livro;
            quantidadeDeLivrosCadastrados++;
            return true;
        } else {
            return false;
        }
    }


    public void cadastrarLivro(Scanner scanner) {
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o ano de publicação: ");
        int anoPublicacao = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite a quantidade disponível: ");
        int quantidadeDisponivel = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o preço: ");
        float preco = Float.parseFloat(scanner.nextLine());

        Livro novoLivro = new Livro(titulo, anoPublicacao, quantidadeDisponivel, preco);

        if (cadastrarLivro(novoLivro)) {
            System.out.println("Livro cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar livro");
        }
    }

    public String comprarLivros(String titulo){
        for (int i=0; i<quantidadeDeLivrosCadastrados;i++){
            if (estoque[i].getTitulo().equals(titulo)){
                if (estoque[i].getQuantidadeDisponivel()>0){
                    estoque[i].vender();
                    saldoEmCaixa+=estoque[i].getPreco();
                    return "Venda Concluida";
                } else {
                    return "Esgotado";
                }
            }
        }
        return "Livro Não Encontrado";
    }

    public void comprarLivros(Scanner scanner) {
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        String resultado = comprarLivros(titulo);
        System.out.println(resultado);
    }

    public void listarEstoque() {
        System.out.println("\nLIVROS EM ESTOQUE");
        if (quantidadeDeLivrosCadastrados == 0) {
            System.out.println("Estoque vazio!");
            return;
        }

        for (int i = 0; i < quantidadeDeLivrosCadastrados; i++) {
            System.out.println("Título: " + estoque[i].getTitulo());
            System.out.println("Ano: " + estoque[i].getAnoDePublicacao());
            System.out.println("Quantidade: " + estoque[i].getQuantidadeDisponivel());
            System.out.println("Preço: R$" + estoque[i].getPreco());
        }
    }


    public void exibirSaldo() {
        System.out.println("Saldo em caixa: R$" + getSaldoEmCaixa());
    }
}


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