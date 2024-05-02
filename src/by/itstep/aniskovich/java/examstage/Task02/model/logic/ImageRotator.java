package by.itstep.aniskovich.java.examstage.Task02.model.logic;

import by.itstep.aniskovich.java.examstage.Task02.model.entity.ImageProcessor;
import by.itstep.aniskovich.java.examstage.Task02.util.ImageCreator;

public class ImageRotator {
    private ImageProcessor image;
    private ImageCreator view;

    public ImageRotator(ImageProcessor image, ImageCreator view) {
        this.image = image;
        this.view = view;
    }

    public void rotateMatrix() {
        int[][] matrix = view.readMatrix();
        char direction = view.getRotationDirection();

        image = new ImageProcessor(matrix);

        int[][] rotatedMatrix;
        try {
            if (direction == 'R') {
                rotatedMatrix = image.rotateClockwise();
            } else if (direction == 'L') {
                rotatedMatrix = image.rotateCounterClockwise();
            } else {
                throw new IllegalArgumentException("Invalid rotation direction.");
            }
            view.displayMatrix(rotatedMatrix);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
