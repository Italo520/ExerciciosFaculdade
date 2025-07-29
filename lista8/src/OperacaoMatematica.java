
abstract class OperacaoMatematica {
    protected int operando1;
    protected int operando2;

    public OperacaoMatematica(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public abstract float retornarResultado();

    public void imprimirResultado() {
        System.out.println("Resultado: " + retornarResultado());
    }
}