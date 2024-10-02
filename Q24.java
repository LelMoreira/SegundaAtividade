import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo;
        double[] vetor = new double[10];

        System.out.print("Digite o código (0, 1 ou 2): ");
        codigo = scanner.nextInt();

        if (codigo == 0) {
            System.out.println("Programa encerrado.");
            return;
        }

        System.out.println("Digite os 10 números reais do vetor:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextDouble();
        }

        switch (codigo) {
            case 1:
                System.out.println("Vetor na ordem direta:");
                for (double num : vetor) {
                    System.out.print(num + " ");
                }
                break;
            case 2:
                System.out.println("Vetor na ordem inversa:");
                for (int i = 9; i >= 0; i--) {
                    System.out.print(vetor[i] + " ");
                }
                break;
            default:
                System.out.println("Código inválido.");
        }
    }
}