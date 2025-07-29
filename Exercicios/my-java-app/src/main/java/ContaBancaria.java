public class ContaBancaria {
    private String numeroConta = "";
    private String nomeDoTitular = "";
    private double saldo = 0.0;


    public ContaBancaria(String numeroConta, String nomeDoTitular) {
        this.numeroConta = numeroConta;
        this.nomeDoTitular = nomeDoTitular;
    }

    public double depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return saldo;
        } else {
            throw new IllegalArgumentException("Valor de depósito deve ser positivo.");
        }
    }


    public double sacar (double valor) throws IllegalArgumentException {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return saldo;
        } else if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para saque.");
        } else {
            throw new IllegalArgumentException("Valor de saque deve ser positivo.");
        }
    }
    


    public double consultarSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) throws IllegalArgumentException {
        
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo não pode ser negativo.");
        }
        this.saldo = saldo;
        
    }

    

}
    

