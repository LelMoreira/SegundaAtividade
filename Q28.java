import java.util.Scanner;

public class Q28 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = input.nextInt();

        System.out.print("Digite o valor de p: ");
        int p = input.nextInt();

        int arranjo = arranjo(n, p);
        int combinacao = combinacao(n, p);

        System.out.println("Arranjo de (" + n + ", " + p + "): " + arranjo);
        System.out.println("Combinação de (" + n + ", " + p + "): " + combinacao);
    }

    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * fatorial(num - 1);
        }
    }

    public static int arranjo(int n, int p) {
        return fatorial(n) / fatorial(n - p);
    }

    public static int combinacao(int n, int p) {
        return fatorial(n) / (fatorial(p) * fatorial(n - p));
    }
}