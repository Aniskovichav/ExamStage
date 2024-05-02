package by.itstep.aniskovich.java.examstage.Task02.util;

import java.util.Scanner;

public class InputValue {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int getInt() {
        return SCANNER.nextInt();
    }

    public static char getChar() {
        return SCANNER.next().charAt(0);
    }
}
