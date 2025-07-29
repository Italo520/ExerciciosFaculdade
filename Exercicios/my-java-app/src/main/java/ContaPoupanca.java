public class ContaPoupanca extends ContaBancaria {
    private double taxaDeJuros;


    public ContaPoupanca(String numeroConta, String nomeDoTitular, double taxaDeJuros) {
        super(numeroConta, nomeDoTitular);
        this.taxaDeJuros = taxaDeJuros;
    }


    public double renderJuros(double taxaDeJuros){
        this.taxaDeJuros = this.consultarSaldo() * taxaDeJuros / 100;
        this.depositar(taxaDeJuros);
        return this.taxaDeJuros;
    }

}
