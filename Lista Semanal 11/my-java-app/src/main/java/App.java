import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean dataValida = false;

        // Loop continua até que uma data válida seja inserida.
        while (!dataValida) {
            System.out.print("Informe uma data no formato \"dia/mes/ano\" (ex. 30/01/1999): ");
            String input = scanner.nextLine();

            try {
                // Tenta criar o objeto MinhaData diretamente a partir da String do usuário.
                MinhaData data = new MinhaData(input);

                // Se a linha acima não lançou uma exceção, a data é válida.
                System.out.println("Data válida! Objeto criado com sucesso: " + data);
                dataValida = true; // Define a flag para sair do loop.

            } catch (Exception e) {
                // Captura a exceção lançada pelo construtor de MinhaData.
                System.out.println("Erro: " + e.getMessage());
            }
            
            System.out.println(); 
        }

        scanner.close(); 
    }
}
