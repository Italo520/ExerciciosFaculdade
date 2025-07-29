public class Infantaria extends Unidade{

    public Infantaria(){
        super();
        this.setPontosDeVida(1);
    }

    @Override
    public boolean ganhaQuandoAtacadoPor(Unidade atacante) {
        if (atacante instanceof Catapulta){
            this.receberDano();
            return false;
        } else if (atacante instanceof Cavalaria) {
            atacante.receberDano();
            return true;
        } else {
            atacante.receberDano();
            this.receberDano();
            return false;
        }
    }
}
