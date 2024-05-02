package by.itstep.aniskovich.java.examstage.Task02.controller;

import by.itstep.aniskovich.java.examstage.Task02.model.entity.Image;
import by.itstep.aniskovich.java.examstage.Task02.model.logic.ImageRotator;
import by.itstep.aniskovich.java.examstage.Task02.util.ImageRotatorUI;
import by.itstep.aniskovich.java.examstage.Task02.view.Printer;

import static by.itstep.aniskovich.java.examstage.Task02.util.
        ImageRotatorUI.inputMessage;

public class Task02 {
    public static void main(String[] args) {

        Printer.print(inputMessage());

        Image image = new Image(ImageRotatorUI.readMatrix());
        Printer.print(image.displayImage());

        ImageRotator rotator = new ImageRotator(image);

        rotator.rotateMatrix();
    }
}
