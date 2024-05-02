package by.itstep.aniskovich.java.examstage.Task01.controller;

import by.itstep.aniskovich.java.examstage.Task01.model.StudentDiary;

public class Task01 {
    public static void main(String[] args) {
        int[] grades = {5, 5, 4, 5, 5, 4, 4, 5, 5, 5};

        int result = StudentDiary.findSequenceWithMaxCountFives(grades);
        System.out.println(result);



    }
}