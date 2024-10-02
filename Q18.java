import java.util.Scanner;

public class Q18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da pirâmide: ");
        int linhas = scanner.nextInt();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= linhas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}