public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, String nomeDoTitular) {
        super(numeroConta, nomeDoTitular);
    }


    public double sacar(double valor) {
        if (valor > limiteChequeEspecial) {
            throw new IllegalArgumentException("Valor do saque excede o limite do cheque especial.");
        }
        return super.sacar(valor);
    }
}
