package by.itstep.aniskovich.java.examstage.Task02.model.logic;

import by.itstep.aniskovich.java.examstage.Task02.model.entity.Image;
import by.itstep.aniskovich.java.examstage.Task02.util.ImageRotatorUI;

public class ImageRotator {
//    private Image image;
//
//    public ImageRotator(Image image) {
//        this.image = image;
//
//    }

    public void rotateMatrix() {
        int[][] matrix;
        char direction;
        try {
            matrix = view.readMatrix();
            direction = ImageRotatorUI.readDirection();
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
            return;
        }

        try {
            image = new Image(matrix);

            int[][] rotatedMatrix;
            if (direction == 'R') {
                rotatedMatrix = image.rotateClockwise();
            } else if (direction == 'L') {
                rotatedMatrix = image.rotateCounterClockwise();
            } else {
                System.out.println("Invalid rotation direction.");
                return;
            }

            view.displayMatrix(rotatedMatrix);
        } catch (Exception e) {
            System.out.println("Error rotating matrix: " + e.getMessage());
        }
    }
}
