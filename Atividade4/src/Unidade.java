public abstract class Unidade {
    protected int pontosDeVida;


    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public void receberDano(){
        if (this.pontosDeVida > 0){
            this.pontosDeVida--;
        }
    }

    public boolean isVivo(){
        return this.pontosDeVida > 0;
    }

    @Override
    public String toString() {
        String status = isVivo() ? "Vivo" : "Morto";
        return ( this.getClass().getSimpleName() + " - Pontos de Vida: " + this.pontosDeVida + ", (" + status + " ).");
    }

    public abstract boolean ganhaQuandoAtacadoPor(Unidade atacante);

}
