import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas: ");
        double horas = scanner.nextDouble();

        System.out.print("Digite o valor da hora trabalhada: ");
        double horas_trabalhadas = scanner.nextDouble();

        System.out.println("Seu salário bruto equivale a: ");
        double bruto = (horas*horas_trabalhadas);
        System.out.println(bruto);

        double importo = (bruto * 30 /100);

        System.out.println("Seu salário líquido equivale a: ");
        double salário = (bruto-importo);
        System.out.println(salário);

        scanner.close();
    }
}
