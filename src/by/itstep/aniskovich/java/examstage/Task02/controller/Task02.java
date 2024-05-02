package by.itstep.aniskovich.java.examstage.Task02.controller;

import by.itstep.aniskovich.java.examstage.Task02.model.entity.ImageProcessor;
import by.itstep.aniskovich.java.examstage.Task02.model.logic.ImageRotator;
import by.itstep.aniskovich.java.examstage.Task02.util.ImageCreator;

public class Task02 {
    public static void main(String[] args) {
        ImageProcessor image = new ImageProcessor(new int[][] {});
        ImageCreator view = new ImageCreator();

        ImageRotator rotator = new ImageRotator(image, view);

        rotator.rotateMatrix();
    }
}
