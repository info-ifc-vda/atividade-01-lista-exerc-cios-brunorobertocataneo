import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigoProduto = sc.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = sc.nextInt();

        double precoUnitario;

        if (codigoProduto >= 1 && codigoProduto <= 10) {
            precoUnitario = 10.0;
        } else if (codigoProduto >= 11 && codigoProduto <= 20) {
            precoUnitario = 15.0;
        } else if (codigoProduto >= 21 && codigoProduto <= 30) {
            precoUnitario = 20.0;
        } else if (codigoProduto >= 31 && codigoProduto <= 40) {
            precoUnitario = 40.0;
        } else {
            System.out.println("O codigo que voce digitou nao e valido, por favor escolha um outro valor.");
            return;
        }

        double precoTotal = precoUnitario * quantidade;

        double desconto;
        if (precoTotal <= 250.0) {
            desconto = precoTotal * 0.05;
        } else if (precoTotal > 250.0 && precoTotal <= 500.0) {
            desconto = precoTotal * 0.10;
        } else {
            desconto = precoTotal * 0.15;
        }

        double precoFinal = precoTotal - desconto;

        System.out.println("Preço unitário: R$ " + precoUnitario);
        System.out.println("Preço total da nota: R$ " + precoTotal);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Preço final após o desconto: R$ " + precoFinal);

        sc.close();
    }
}
