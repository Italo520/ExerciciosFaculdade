class Subtrair extends OperacaoMatematica {

    public Subtrair(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public float retornarResultado() {
        return operando1 - operando2;
    }

}