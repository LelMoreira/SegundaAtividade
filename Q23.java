import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira os dez números inteiros do primeiro vetor: ");
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = scanner.nextInt();
        }

        System.out.print("Insira os cinco números inteiros do segundo vetor: ");
        int[] div = new int[5];
        for (int i = 0; i < 5; i++) {
            div[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + num[i] + ":");
            for (int j = 0; j < 5; j++) {
                if (num[i] % div[j] == 0) {
                    System.out.println("  Divisível por " + div[j] + " na posição " + j);
                }
            }
        }
    }
}