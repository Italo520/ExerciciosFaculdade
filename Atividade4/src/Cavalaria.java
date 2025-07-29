public class Cavalaria extends Unidade{

    public Cavalaria(){
        super();
        this.setPontosDeVida(2);
    }

    @Override
    public boolean ganhaQuandoAtacadoPor(Unidade atacante) {
        if ( atacante instanceof Catapulta){
            atacante.receberDano();
            return true;
        } else if (atacante instanceof Infantaria) {
            this.receberDano();
            return false;
        } else {
            atacante.receberDano();
            this.receberDano();
            return false;
        }
    }
}
