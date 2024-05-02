package by.itstep.aniskovich.java.examstage.Task02.model.entity;

public class ImageProcessor {
    private int[][] matrix;

    public ImageProcessor(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] rotateClockwise() {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] rotatedMatrix = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                rotatedMatrix[i][j] = matrix[rows - j - 1][i];
            }
        }

        return rotatedMatrix;
    }

    public int[][] rotateCounterClockwise() {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] rotatedMatrix = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                rotatedMatrix[i][j] = matrix[j][cols - i - 1];
            }
        }

        return rotatedMatrix;
    }
}
