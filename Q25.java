import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho dos vetores (N): ");
        int n = scanner.nextInt();

        double[] v1 = new double[n];
        double[] v2 = new double[n];
        char[] op = new char[n];
        double[] resul = new double[n];

        System.out.println("Informe os valores do vetor V1:");
        for (int i = 0; i < n; i++) {
            v1[i] = scanner.nextDouble();
        }

        System.out.println("Informe os valores do vetor V2:");
        for (int i = 0; i < n; i++) {
            v2[i] = scanner.nextDouble();
        }

        System.out.println("Informe os operadores do vetor Op:");
        for (int i = 0; i < n; i++) {
            op[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i < n; i++) {
            switch (op[i]) {
                case '+':
                    resul[i] = v1[i] + v2[i];
                    break;
                case '-':
                    resul[i] = v1[i] - v2[i];
                    break;
                case '/':
                    resul[i] = v1[i] / v2[i];
                    break;
                case '*':
                    resul[i] = v1[i] * v2[i];
                    break;
                default:
                    System.out.println("Operador inválido!");
                    return;
            }
        }

        System.out.println("Vetor Resultado:");
        for (int i = 0; i < n; i++) {
            System.out.print(resul[i] + " ");
        }
    }
}