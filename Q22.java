import java.util.Random;

public class Q22 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }

        int count = 0;
        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
            if (vetor[i] > 25) {
                count++;
                System.out.println(" (posição " + i + ")");
            }
        }
        System.out.println();

        if (count > 0) {
            System.out.println("Existem " + count + " números superiores a 25.");
        } else {
            System.out.println("Não existem números superiores a 25.");
        }
    }
}