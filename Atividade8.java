import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago: R$ ");
        double valorPago = scanner.nextDouble();

        double troco = valorPago - valorCompra;

        if (troco < 0) {
            System.out.println("Valor pago é insuficiente!");
        } else {
            System.out.println("Troco: R$ " + troco);

            int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
            int[] quantidadeCedulas = new int[cedulas.length];

            for (int i = 0; i < cedulas.length; i++) {
                quantidadeCedulas[i] = (int) (troco / cedulas[i]);
                troco -= quantidadeCedulas[i] * cedulas[i];
            }

            System.out.println("Cédulas:");
            for (int i = 0; i < cedulas.length; i++) {
                if (quantidadeCedulas[i] > 0) {
                    System.out.println(quantidadeCedulas[i] + " x R$ " + cedulas[i]);
                }
            }
        }
    }
}