import java.util.Scanner;
/*
 * Um programa que leia 5 números e informe:
 * O maior número e a média desses números.
 */
public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float numero;
        float maior = 0;
        float soma = 0;
        System.out.println();

        float count = 0;

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;
            System.out.println("Soma: " + soma);

            if (numero > maior) maior = numero;
            count = count + 1;
        } while(count < 11);
    System.out.println("Maior numero numero digitado foi: " + maior);
    System.out.println("A media foi: " + (soma/5));

        
    }
    
}
