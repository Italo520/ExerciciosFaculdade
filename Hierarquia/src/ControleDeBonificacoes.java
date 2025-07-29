public class ControleDeBonificacoes {
    
    private double totalBonificacoes = 0; 
    
    public void registrar(Funcionario f) {
        totalBonificacoes += f.calcularBonificacao();
    }
    
    public double getTotalBonificacoes() {
        return totalBonificacoes;
    }
}
