import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                vetor[i] = -1;
            } else {
                vetor[i] = (int) Math.sqrt(numero);
            }
        }

        System.out.println("Valores armazenados no vetor:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}