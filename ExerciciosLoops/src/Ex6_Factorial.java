import java.util.Scanner;
/*
 * Um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
 */
public class Ex6_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Factorial");

        int factorial = scan.nextInt();

        int multiplicar = 1;

        System.out.println(factorial +"! = ");

        for(int i = factorial ; i >= 1 ; i --){
            multiplicar = multiplicar +i; 
        }

        System.out.println(multiplicar);
        
    }
}
