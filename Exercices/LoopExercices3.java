package Exercices;

import java.util.Scanner;

public class LoopExercices3{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.print("Digite o número que deseja buscar: ");
        int search = scanner.nextInt();

        boolean found = false;
        int row = -1;
        int column = -1;

        searchLoop:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == search) {
                    found = true;
                    row = i;
                    column = j;
                    break searchLoop;
                }
            }
        }
        if (found) {
            System.out.println("Número encontrado!");
            System.out.println("Linha: " + row);
            System.out.println("Coluna: " + column);
        } else {
            System.out.println("Número não encontrado.");
        }

        scanner.close();
    }
}