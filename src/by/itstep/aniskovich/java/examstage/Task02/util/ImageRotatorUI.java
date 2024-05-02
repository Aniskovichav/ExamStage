package by.itstep.aniskovich.java.examstage.Task02.util;

public class ImageRotatorUI {
    public void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static String inputMessage() {
        return "Enter the number of rows, columns in the matrix " +
                "and rotation direction (R for clockwise, " +
                "L for counterclockwise): ";
    }

    public static int[][] readMatrix() {
        int rows = InputValue.getInt();
        int cols = InputValue.getInt();

        int[][] matrix = new int[rows][cols];

        MatrixInit.randomInitElement(matrix);

        return matrix;
    }

    public static char readDirection() {
        return InputValue.getChar();
    }

    public void displayResult(int[][] matrix) {
        System.out.println("The result of the rotation is: ");
        displayMatrix(matrix);
    }

}

