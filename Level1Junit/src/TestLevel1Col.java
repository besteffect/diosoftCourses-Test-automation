import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLevel1Col {

    @Test //Task2 (1, 34, 3, 42, 4, 4, 4, 2, 9, 10, 11, 12, 13, 14, 15)
    public void testCountSpecificElements() {
        ArrayList<Integer> list = new ArrayList<Integer>() {
            {
                add(1);
                add(34);
                add(3);
                add(42);
                add(4);
                add(4);
                add(4);
                add(2);
                add(9);
                add(10);
                add(11);
                add(12);
                add(13);
                add(14);
                add(15);
            }
        };
        int expectedNumber = 15;
        int k = 5;
        Assert.assertEquals(expectedNumber, Level1Collections.countSpecificElements(list, k));
    }

    @Test //Task3
    public void testcountOfZeronumbersinarray() {
        ArrayList<Integer> input = new ArrayList<>(List.of(0, 33, 2, 5, 63, 3, 0, 0, 3, 0, 3, 3, 1, 0));
        List<Integer> expectedList = new ArrayList<>(List.of(0, 6, 7, 9, 13));
        Assert.assertEquals(expectedList, Level1Collections.countOfZeronumbersInArray(input));
    }

    @Test //Task4
    public void testFindWhichIsFirstPositiveOrNegative() {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 0, -2, 1, -4, 24, 53));
        String expectedText = "First number is negative";
        Assert.assertEquals(expectedText, Level1Collections.findWhichIsFirstPositiveorNegative(list));
    }

    @Test// task5
    public void testIsArraySorted() {
        List<Integer> list = new ArrayList<>(List.of(7, 8, 12, 22, 33, 51, 63, 64, 55));
        Assert.assertFalse(Level1Collections.isArraySorted(list));
    }

    @Test// task5
    public void testIsArraySorted1() {
        List<Integer> list = new ArrayList<>(List.of(7, 8, 12, 22, 33, 51, 63, 64, 65));
        Assert.assertTrue(Level1Collections.isArraySorted(list));
    }

    @Test //Task6
    public void testCreateArrayOfEvenNumbers() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 32, 1, 3, 51, 21));
        List<Integer> expectedList = new ArrayList<>(List.of(2, 32));
        Assert.assertEquals(expectedList, Level1Collections.createArrayOfEvenNumbers(list));
    }
}