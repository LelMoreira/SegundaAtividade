import java.util.Scanner;
import java.util.Vector;

public class Q27 {
    public static int sorteia(int limitInf, int limitSup) {
        return (int) (Math.random() * (limitSup - limitInf + 1)) + limitInf;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque o Limite inferior ");
        int limitInf = scanner.nextInt();
        System.out.print("Coloque o Limite sujperior ");
        int limitSup = scanner.nextInt();

        if (limitInf >= limitSup) {
            System.out.println("Numero invalido, insira outro");
            return;
        }

        Vector<Integer> A = new Vector<Integer>(10);
        Vector<Integer> B = new Vector<Integer>(10);

        for (int i = 0; i < 10; i++) {
            A.add(sorteia(limitInf, limitSup));
            B.add(sorteia(limitInf, limitSup));
        }

        System.out.println("Vector A: " + A);
        System.out.println("Vector B: " + B);

        // a. Vector Soma
        Vector<Integer> Soma = new Vector<Integer>(10);
        for (int i = 0; i < 10; i++) {
            Soma.add(A.get(i) + B.get(i));
        }
        System.out.println("Vector Soma: " + Soma);

        // b. Vector Intersecção
        Vector<Integer> Interseccao = new Vector<Integer>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (A.get(i) == B.get(j)) {
                    Interseccao.add(A.get(i));
                }
            }
        }
        System.out.println("Vector Intersecção: " + Interseccao);

        // c. Vector Diferença
        Vector<Integer> Diferenca = new Vector<Integer>();
        for (int i = 0; i < 10; i++) {
            boolean found = false;
            for (int j = 0; j < 10; j++) {
                if (A.get(i) == B.get(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                Diferenca.add(A.get(i));
            }
        }
        System.out.println("Vector Diferença: " + Diferenca);

        // d. Vector Intercalação
        Vector<Integer> Intercalacao = new Vector<Integer>();
        for (int i = 0; i < 10; i++) {
            Intercalacao.add(A.get(i));
            Intercalacao.add(B.get(i));
        }
        System.out.println("Vector Intercalação: " + Intercalacao);
    }
}