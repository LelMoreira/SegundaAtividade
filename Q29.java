import java.util.Random;

public class Q29 {
    public static void main(String[] args) {
        int limiteInferior = lerInteiro("Informe o limite inferior: ");
        int limiteSuperior = lerInteiro("Informe o limite superior: ");

        int[] vetor = new int[1000];
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            int numeroAleatorio;
            do {
                numeroAleatorio = sorteia(limiteInferior, limiteSuperior);
            } while (contains(vetor, numeroAleatorio));
            vetor[i] = numeroAleatorio;
        }

        System.out.println("Vetor de números aleatórios únicos:");
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }
    }

    private static int sorteia(int limiteInferior, int limiteSuperior) {
        return (int) (Math.random() * (limiteSuperior - limiteInferior + 1)) + limiteInferior;
    }

    private static boolean contains(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }

    private static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        return Integer.parseInt(System.console().readLine());
    }
}