import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos números você deseja digitar? ");
        int n = scan.nextInt();

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            int numero = scan.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.printf("Quantidade de números pares: %d\n", pares);
        System.out.printf("Quantidade de números ímpares: %d\n", impares);
    }
}
