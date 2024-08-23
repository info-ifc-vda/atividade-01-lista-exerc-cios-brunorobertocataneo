import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os três lados do triângulo:");
        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();
        double lado3 = scanner.nextDouble();

        System.out.println("Digite os três ângulos do triângulo:");
        double angulo1 = scanner.nextDouble();
        double angulo2 = scanner.nextDouble();
        double angulo3 = scanner.nextDouble();

        if (angulo1 == 90 && angulo2 == 90 && angulo3 == 90) {
            System.out.println("O triângulo é Retângulo.");
        } else if (angulo1 > 90 && angulo2 > 90 && angulo3 > 90) {
            System.out.println("O triângulo é Obtusângulo.");
        } else {
            System.out.println("O triângulo é Acutângulo.");
        }

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é Equilátero.");
        } else if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
            System.out.println("O triângulo é Isósceles.");
        } else {
            System.out.println("O triângulo é Escaleno.");
        }

        scanner.close();
    }
}
