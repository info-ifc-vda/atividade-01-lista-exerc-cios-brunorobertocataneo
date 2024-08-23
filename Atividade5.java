import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] jogadores = new int[5][11]; 
        double[][] pesos = new double[5][11];
        double[][] alturas = new double[5][11];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.println("Time " + (i + 1) + ", Jogador " + (j + 1) + ":");
                System.out.print("Idade: ");
                jogadores[i][j] = sc.nextInt();
                System.out.print("Peso: ");
                pesos[i][j] = sc.nextDouble();
                System.out.print("Altura: ");
                alturas[i][j] = sc.nextDouble();
            }
        }

        int jogadoresMenores18 = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                if (jogadores[i][j] < 18) {
                    jogadoresMenores18++;
                }
            }
        }

        double[] mediaIdades = new double[5];
        for (int i = 0; i < 5; i++) {
            double somaIdades = 0;
            for (int j = 0; j < 11; j++) {
                somaIdades += jogadores[i][j];
            }
            mediaIdades[i] = somaIdades / 11;
        }

        double somaAlturas = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                somaAlturas += alturas[i][j];
            }
        }
        double mediaAlturas = somaAlturas / (5 * 11);

        int jogadoresMais80kg = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                if (pesos[i][j] > 80) {
                    jogadoresMais80kg++;
                }
            }
        }
        double porcentagemMais80kg = (double) jogadoresMais80kg / (5 * 11) * 100;

        double precoTotal = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                precoTotal += pesos[i][j] * alturas[i][j];
            }
        }
        double desconto = 0;
        if (precoTotal <= 250) {
            desconto = precoTotal * 0.05;
        } else if (precoTotal > 250 && precoTotal <= 500) {
            desconto = precoTotal * 0.10;
        } else {
            desconto = precoTotal * 0.15;
        }
        double precoTotalComDesconto = precoTotal - desconto;

        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + jogadoresMenores18);
        for (int i = 0; i < 5; i++) {
            System.out.println("Média das idades do Time " + (i + 1) + ": " + mediaIdades[i]);
        }
        System.out.println("Média das alturas de todos os jogadores do campeonato: " + mediaAlturas);
        System.out.println("Porcentagem de jogadores com mais de 80kg: " + porcentagemMais80kg + "%");
        System.out.println("Preço total da nota com desconto: R$ " + precoTotalComDesconto);
    
        
        sc.close();
    
    }
}