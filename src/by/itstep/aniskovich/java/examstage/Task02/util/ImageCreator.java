package by.itstep.aniskovich.java.examstage.Task02.util;

import java.util.Scanner;

public class ImageCreator {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }
    public void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public char getRotationDirection() {
        return SCANNER.next().charAt(0);
    }

    public int[][] readMatrix() {
        System.out.print("Enter the matrix dimension and rotation: ");
        int rows = SCANNER.nextInt();
        int cols = SCANNER.nextInt();

        int[][] matrix = new int[rows][cols];

        MatrixInit.randomInitElement(matrix);
        displayMatrix(matrix);

        return matrix;
    }
}

