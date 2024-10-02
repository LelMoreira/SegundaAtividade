import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        int menor = vetor[0];
        int maior = vetor[0];
        int posMenor = 0;
        int posMaior = 0;

        for (int i = 1; i < 10; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
        }

        System.out.println("O menor elemento do vetor é " + menor + " e sua posição dentro do vetor é: " + posMenor);
        System.out.println("Já o maior elemento é " + maior + " e está na posição " + posMaior);
    }
}