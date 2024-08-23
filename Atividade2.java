import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double minimo = scanner.nextDouble();

        System.out.print("Digite a quantidade de quilowatts consumida: ");
        double quilowatts = scanner.nextDouble();

        System.out.println("O valor de cada quilowatts é: ");
        double valorkw = (minimo *1/100);
        System.out.println(valorkw);

        System.out.println("O valor a ser pago é: ");
        double valor_pagar = (minimo * quilowatts);
        System.out.println(valor_pagar);



        scanner.close();
    }
}
