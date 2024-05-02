package by.itstep.aniskovich.java.examstage.Task01.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentDiaryTest {
    @Test
    public void testFindMaxSequenceFivesEmpty() {
        // Arrange
        int[] grades = {};
        int expected = 0;

        // Act
        int actual = StudentDiary.findMaxSequenceFives(grades);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxSequenceFives_AllFives() {
        // Arrange
        int[] grades = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        int expected = 7;

        // Act
        int actual = StudentDiary.findMaxSequenceFives(grades);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxSequenceFives_NoFives() {
        // Arrange
        int[] grades = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int expected = -1;

        // Act
        int actual = StudentDiary.findMaxSequenceFives(grades);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxSequenceFives_NoFives1() {
        // Arrange
        int[] grades = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        int expected = -1;

        // Act
        int actual = StudentDiary.findMaxSequenceFives(grades);

        // Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testFindMaxSequenceFives_NoFives2() {
        // Arrange
        int[] grades = {2, 3, 2, 3, 2, 3, 2};
        int expected = -1;

        // Act
        int actual = StudentDiary.findMaxSequenceFives(grades);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxSequenceFives_NoFives3() {
        // Arrange
        int[] grades = {4, 4, 4, 4, 4, 4, 4, 4};
        int expected = 0;

        // Act
        int actual = StudentDiary.findMaxSequenceFives(grades);

        // Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testFindMaxSequenceFives_GradesWithFives() {
        // Arrange
        int[] grades = {5, 5, 3, 2, 5, 5, 5};
        int expected = -1;

        // Act
        int actual = StudentDiary.findMaxSequenceFives(grades);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxSequenceFives_MixedGrades() {
        // Arrange
        int[] grades = {5, 5, 4, 5, 5, 4, 4, 5, 5, 5};
        int expected = 5;

        // Act
        int actual = StudentDiary.findMaxSequenceFives(grades);

        // Assert
        assertEquals(expected, actual);
    }


}

