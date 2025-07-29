public class Catapulta extends Unidade{
    public Catapulta(){
        super();
        this.setPontosDeVida(3);
    }


    @Override
    public boolean ganhaQuandoAtacadoPor(Unidade atacante) {
        if (atacante instanceof Infantaria){
            atacante.receberDano();
            return true;
        } else if (atacante instanceof Cavalaria) {
            this.receberDano();
            return false;
        } else {
            this.receberDano();
            atacante.receberDano();
            return false;
        }
    }
}
