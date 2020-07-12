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

    @Test //Task7
    public void testChangeAllElementsToZ() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, -5, 4, 6, 44, 3, -13, -4, 44));
        int z = 4;
        int expectedNumber = 3;
        Assert.assertEquals("Test 7 ", expectedNumber, Level1Collections.changeAllElementsToZ(list, z));
    }

    @Test //Task8
    public void testCalculateTheNumberOfPositiveNegativeNulls() {
        List<Integer> list = new ArrayList<>(List.of(5, 0, -8, -43, 8, 12, 32, 65, 0, 4, 0, 0));
        int positiveNumbers = 6;
        int negativeNumbers = 2;
        int zeros = 4;
        String expectedResult = "Positive: " + positiveNumbers + " Negative: " + negativeNumbers + " Zeros: " + zeros;

        Assert.assertEquals(expectedResult, Level1Collections.calculateTheNumberOfPositiveNegativeNulls(list));
    }

    @Test //Task9
    public void testChangeBiggestWithSmallest() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 1, 3, 76, 34, 3, 2, 53, 2, 43, 3, 43, 76));
        List<Integer> expectedList = new ArrayList<>(List.of(76, 4, 76, 3, 1, 34, 3, 2, 53, 2, 43, 3, 43, 1));
        Assert.assertEquals(expectedList, Level1Collections.changeBiggestWithSmallest(list));
    }

    @Test //10
    public void testPrintOnlyArrayIisLessOrEqualToI() {
        List<Integer> list = new ArrayList<>(List.of(0, 3, 1, 1, 3, 6, 4, 11, 3, 39, 7));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(0, 1, 1, 3, 4, 3, 7));
        Assert.assertEquals(expectedList, Level1Collections.printOnlyArrayIisLessOrEqualToI(list));
    }

    @Test //11
    public void testPrintAllModuleEqualsM() {
        List<Integer> list = new ArrayList<>(List.of(23, 12, 2, 1, 4, 1, 17, 11, 44));
        int m = 5;
        int l = 2;
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(12, 2, 17));
        Assert.assertEquals(expectedList, Level1Collections.printAllModuleEqualsM(list, m, l));
    }

    @Test //Task12
    public void testChangeElementsPlaces() {
        List<Integer> list = new ArrayList<>(List.of(25, 12, 2, 1, 4, 1, 4, 11, 44));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(12, 25, 1, 2, 1, 4, 11, 4, 44));
        Assert.assertEquals(expectedList, Level1Collections.changeElementsPlaces(list));
    }

    @Test //Task13
    public void testPrintAllIncludingNull() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, -33, 2, 1, 4, 0, 11, 44));
        List<Integer> expectedList = new ArrayList<>(List.of(1, 4, -33, 2, 1, 4, 0));
        Assert.assertEquals(expectedList, Level1Collections.printAllIncludingNull(list));
    }

    @Test //14
    public void testFindMaxEvenPlusMinOdd() {
        List<Integer> list = new ArrayList<>(Arrays.asList(4, -34, -21, 2, 1, 4, 0, 11, 41));
        int expectedResult = 45;
        Assert.assertEquals(expectedResult, Level1Collections.findMaxEvenPlusMinOdd(list));
    }

    @Test //Task15
    public void testFindMultiplOfNumbersBuggerThenM() {
        List<Integer> list = new ArrayList<>(List.of(4, 10, 10, 2, 1, 4, 11, 21));
        int m = 10;
        int expectedResult = 231; //11*21
        Assert.assertEquals(expectedResult, Level1Collections.findMultiplOfNumbersBuggerThenM(list, m));
    }

    @Test //16
    public void testFindBiggestNumberByModule() {
        List<Integer> list = new ArrayList<>(List.of(4, -36, -40, 2, 1, 35, 11, 21));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(4, 0, 0, 2, 1, 35, 11, 21));
        Assert.assertEquals(expectedList, Level1Collections.findbiggestnumberbyModule(list));
    }

    @Test //17
    public void testFindMultiplOfMinAnMinusNumbers() {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, -1, -401, 2, -1, 1, 10, 10)); //positive 400
        String expectedResult = "Negative numbers multiplication is bigger";
        Assert.assertEquals(expectedResult, Level1Collections.findMultiplOfMinAnMinusNumbers(list));
    }
}