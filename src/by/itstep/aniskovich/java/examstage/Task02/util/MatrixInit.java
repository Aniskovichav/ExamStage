package by.itstep.aniskovich.java.examstage.Task02.util;

import java.util.Random;

public class MatrixInit {
    private static final Random RND;
    private static final int RANGE_START = 10;
    private static final int RANGE_END = 99;

    static {
        RND = new Random();
    }

    public static int[][] randomInitElement(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = RND.nextInt(RANGE_START, RANGE_END);
            }
        }
        return matrix;
    }
}
