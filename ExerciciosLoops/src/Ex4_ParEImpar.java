import java.util.Scanner;
/*
 * Um programa que peça N números inteiros. 
 * Calcule e mostre a quantidade de números pares 
 * e a quantidade de números impares.
 */
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantInpares = 0;

        System.out.print("Digite a quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 1;
        

        do {

            System.out.printf("Digite o %dº número: ", count+1 );
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantInpares++;

            count = count + 1;
        } while(count < quantNumeros);
    System.out.printf("Quantidade de números pares: %d\n", quantPares);
    System.out.printf("Quantidade de números pares: %d\n", quantInpares);

    
    }    
}  



