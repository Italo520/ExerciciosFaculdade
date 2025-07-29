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