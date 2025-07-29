public class Main {
    public static void main(String[] args) {
        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        
        // Criando objetos com TODOS os parâmetros necessários
        Gerente gerente = new Gerente("João Silva", "123.456.789-00", 5000.0, "senha123");
        Telefonista telefonista = new Telefonista("Maria Santos", "987.654.321-00", 2000.0, "Estação 01");
        
        controle.registrar(gerente);      
        controle.registrar(telefonista);  
        
        System.out.println("Total de bonificações: " + controle.getTotalBonificacoes());
    }
}