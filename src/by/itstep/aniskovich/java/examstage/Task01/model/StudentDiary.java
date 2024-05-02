package by.itstep.aniskovich.java.examstage.Task01.model;

public class StudentDiary {
    public static final int RANGE_DAYS = 7;
    public static final int MARK_FIVE = 5;
    public static final int MARK_THREE = 3;

    public static int findSequenceWithMaxCountFives(int[] grades) {
        int maxSequence = 0;
        int currentSequence = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > MARK_THREE) {
                currentSequence++;
            } else {
                currentSequence = 0;
            }

            if (currentSequence >= RANGE_DAYS) {
                int countFives = countFivesInRange(grades, i - 6, i);
                maxSequence = Math.max(maxSequence, countFives);
            }
        }

        return maxSequence == 0 ? -1 : maxSequence;
    }

    private static int countFivesInRange(int[] grades, int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (grades[i] == MARK_FIVE) {
                count++;
            }
        }
        return count;
    }
}
