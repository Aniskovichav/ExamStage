package by.itstep.aniskovich.java.examstage.Task01.model;

public class StudentDiary {
    public static final int RANGE_DAYS = 7;
    public static final int MARK_FIVE = 5;
    public static final int MARK_FOUR = 4;
    public static final int MARK_THREE = 3;
    public static final int MARK_TWO = 2;

    public static int findMaxSequenceFives(int[] grades) {
        int maxSequence = 0;
        int currentSequence = 0;
        int countDay = 0;
        int countMarkFour = 0;

        for (int i = 0; i < grades.length && countDay < RANGE_DAYS; i++) {
            countDay++;

            if (grades[i] == MARK_FIVE) {
                currentSequence++;
            }

            if (grades[i] == MARK_FOUR) {
                countMarkFour++;
            }
            if (grades[i] == MARK_TWO || grades[i] == MARK_THREE) {
                currentSequence = 0;
                countDay = 0;
            }
            if (currentSequence > maxSequence) {
                maxSequence = currentSequence;
            }
            if (countDay > RANGE_DAYS) {
                break;
            }
        }

        if ((maxSequence == 0 && countDay == RANGE_DAYS)
                || (maxSequence == 0 && countDay < RANGE_DAYS)
                || (maxSequence != 0 && countDay < RANGE_DAYS)) {
            return -1;
        }

        return maxSequence;
    }
}
