import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os 10 elementos do vetor:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        if (verificarDistintos(vetor)) {
            System.out.println("Todos os elementos do vetor são distintos.");
        } else {
            System.out.println("Há elementos repetidos no vetor.");
        }
    }

    public static boolean verificarDistintos(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}