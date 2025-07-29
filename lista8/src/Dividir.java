class Dividir extends OperacaoMatematica {

    public Dividir(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }
    public float retornarResultado() {
        if (operando2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return (float) operando1 / operando2;
    }
}