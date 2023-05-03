import java.util.Random;

/*
Gerir e imprimir uma matriz M 4x4 com valores aleatórios entre 0-9.
*/
public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];  //1-[]=Linha 1-[]=coluna

        for(int i = 0; i < M.length; i++) {
            for( int c = 0; c < M[i].length; c++) { // (c = coluna)
                M[i][c] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M  ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

    }


}

