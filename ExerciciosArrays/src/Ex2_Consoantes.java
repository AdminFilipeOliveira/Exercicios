/*
Um Programa que lê um vetor de 6 caracteres,
e diz quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

/*public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) )  {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        } while(count < consoantes.length);

        System.out.print("Consoantes: ");
        for ( String consoante  :  consoantes ) {
            if ( consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes.length);

    }

}
 */

/* */
public class Ex2_Consoantes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] vetor = new char[6];
        char[] consoantes = new char[6];
        int num_consoantes = 0;
        System.out.println();

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i+1) + "- caractere: ");
            char c = scan.next().charAt(0);
            vetor[i] = c;

            if (Character.isLetter(c) && !"AEIOUaeiou".contains(String.valueOf(c))) {
                num_consoantes++;
                consoantes[num_consoantes-1] = c;
            }
        }

        System.out.println("Foram lidas " + num_consoantes + " consoantes.");
        if (num_consoantes > 0) {
            System.out.print("As consoantes lidas foram: ");
            for (int i = 0; i < num_consoantes; i++) {
                System.out.print(consoantes[i] + " ");
            }
        }
        
    }

}

