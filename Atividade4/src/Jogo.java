import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Jogo {

    // Constantes para custos e dinheiro inicial
    private static final int DINHEIRO_INICIAL = 1200;
    private static final int CUSTO_INFANTARIA = 50;
    private static final int CUSTO_CAVALARIA = 100;
    private static final int CUSTO_CATAPULTA = 200;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Cria os exércitos para os dois jogadores
        List<Unidade> exercitoJogador1 = new ArrayList<>();
        List<Unidade> exercitoJogador2 = new ArrayList<>();

        System.out.println("⚔️ BEM-VINDO AO JOGO DE BATALHA ESTRATÉGICA! ⚔️");
        System.out.println("Cada jogador tem " + DINHEIRO_INICIAL + " reais para montar seu exército.");

        // --- FASE DE COMPRAS ---
        System.out.println("\n--- COMPRAS DO JOGADOR 1 ---");
        faseDeCompra("Jogador 1", exercitoJogador1, scanner);

        System.out.println("\n--- COMPRAS DO JOGADOR 2 ---");
        faseDeCompra("Jogador 2", exercitoJogador2, scanner);

        // Verifica se algum jogador não comprou unidades
        if (exercitoJogador1.isEmpty() || exercitoJogador2.isEmpty()) {
            System.out.println("\nUm dos jogadores não comprou unidades. Fim de Jogo!");
            if (exercitoJogador1.isEmpty() && !exercitoJogador2.isEmpty()) {
                System.out.println("🏆 O Jogador 2 é o vencedor por W.O.! 🏆");
            } else if (!exercitoJogador1.isEmpty() && exercitoJogador2.isEmpty()) {
                System.out.println("🏆 O Jogador 1 é o vencedor por W.O.! 🏆");
            } else {
                System.out.println("Ambos os jogadores não compraram unidades. É um empate.");
            }
            scanner.close();
            return;
        }

        System.out.println("\n\n💥 A BATALHA VAI COMEÇAR! 💥");
        Thread.sleep(2000); // Pausa para efeito dramático

        // --- FASE DE BATALHA ---
        int turno = 1;
        while (!exercitoJogador1.isEmpty() && !exercitoJogador2.isEmpty()) {
            System.out.println("\n--- TURNO " + turno + " ---");
            System.out.printf("Tamanho dos Exércitos -> Jogador 1: %d | Jogador 2: %d\n", exercitoJogador1.size(), exercitoJogador2.size());

            // Seleciona unidades aleatórias para o confronto
            Unidade unidade1 = exercitoJogador1.get(random.nextInt(exercitoJogador1.size()));
            Unidade unidade2 = exercitoJogador2.get(random.nextInt(exercitoJogador2.size()));

            System.out.printf("CONFRONTO: %s (J1) vs. %s (J2)\n", unidade1.getClass().getSimpleName(), unidade2.getClass().getSimpleName());

            // A unidade 1 ataca a unidade 2 (defensora)
            boolean defensorVenceu = unidade2.ganhaQuandoAtacadoPor(unidade1);

            if (defensorVenceu) {
                System.out.println("RESULTADO: O " + unidade2.getClass().getSimpleName() + " (J2) venceu o confronto!");
            } else {
                System.out.println("RESULTADO: O " + unidade1.getClass().getSimpleName() + " (J1) venceu o confronto!");
            }

            System.out.println("Status Pós-Batalha -> J1: " + unidade1 + " | J2: " + unidade2);

            // Verifica e remove unidades derrotadas
            if (!unidade1.isVivo()) {
                exercitoJogador1.remove(unidade1);
                System.out.println("💀 A unidade do Jogador 1 foi derrotada e removida do exército.");
            }
            if (!unidade2.isVivo()) {
                exercitoJogador2.remove(unidade2);
                System.out.println("💀 A unidade do Jogador 2 foi derrotada e removida do exército.");
            }

            turno++;
            Thread.sleep(2500); // Pausa entre os turnos
        }

        // --- FIM DE JOGO ---
        System.out.println("\n\n--- FIM DE JOGO! ---");
        if (exercitoJogador1.isEmpty()) {
            System.out.println("🏆 O Jogador 2 é o grande vencedor! 🏆");
        } else {
            System.out.println("🏆 O Jogador 1 é o grande vencedor! 🏆");
        }

        scanner.close();
    }

    /**
     * Gerencia a fase de compra de unidades para um jogador.
     */
    public static void faseDeCompra(String nomeJogador, List<Unidade> exercito, Scanner scanner) {
        int dinheiro = DINHEIRO_INICIAL;
        while (true) {
            System.out.println("\n" + nomeJogador + ", você tem " + dinheiro + " reais.");
            System.out.println("Escolha uma unidade para comprar:");
            System.out.println("1. Infantaria (Custo: " + CUSTO_INFANTARIA + ")");
            System.out.println("2. Cavalaria  (Custo: " + CUSTO_CAVALARIA + ")");
            System.out.println("3. Catapulta  (Custo: " + CUSTO_CATAPULTA + ")");
            System.out.println("0. Finalizar Compras");
            System.out.print("Sua opção: ");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                if(exercito.isEmpty()){
                    System.out.println("AVISO: Você não comprou nenhuma unidade!");
                }
                System.out.println(nomeJogador + " finalizou as compras.");
                break;
            }

            switch (escolha) {
                case 1:
                    if (dinheiro >= CUSTO_INFANTARIA) {
                        dinheiro -= CUSTO_INFANTARIA;
                        exercito.add(new Infantaria());
                        System.out.println("-> Infantaria adicionada ao seu exército!");
                    } else {
                        System.out.println("-> Dinheiro insuficiente!");
                    }
                    break;
                case 2:
                    if (dinheiro >= CUSTO_CAVALARIA) {
                        dinheiro -= CUSTO_CAVALARIA;
                        exercito.add(new Cavalaria());
                        System.out.println("-> Cavalaria adicionada ao seu exército!");
                    } else {
                        System.out.println("-> Dinheiro insuficiente!");
                    }
                    break;
                case 3:
                    if (dinheiro >= CUSTO_CATAPULTA) {
                        dinheiro -= CUSTO_CATAPULTA;
                        exercito.add(new Catapulta());
                        System.out.println("-> Catapulta adicionada ao seu exército!");
                    } else {
                        System.out.println("-> Dinheiro insuficiente!");
                    }
                    break;
                default:
                    System.out.println("-> Opção inválida, tente novamente.");
                    break;
            }
        }
    }
}