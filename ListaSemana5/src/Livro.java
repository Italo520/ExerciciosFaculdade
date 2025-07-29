import java.util.Objects;

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