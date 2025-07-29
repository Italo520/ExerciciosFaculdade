public class App {
    public static void main(String[] args) {
        Carro carro1 = new Carro ("Honda", "Civic", 2020, "Preto");
        Carro carro2 = new Carro("Toyota", "Corolla", 2021, "Azul");
        

        carro1.exibirInformacoes(carro1);
        carro2.exibirInformacoes(carro2);


        ContaBancaria conta1 = new ContaBancaria("01","João");


        try{
            conta1.depositar(1000);
            conta1.sacar(-10);
            System.out.println("O seu saldo é: " + conta1.consultarSaldo());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }

        try {
            Pessoa pessoa1 = new Pessoa("Maria");
            pessoa1.setIdade(150);
            System.out.println(pessoa1.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
        
    }
}

