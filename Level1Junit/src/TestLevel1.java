import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 *
 */
public class TestLevel1 {
    @Test //Task1
    public void testFindMinimum() {
        Assert.assertEquals(Level1.findMinimum(4, 10), 4);
    }

    @Test //Task2
    public void testCountSpecificElements() {
        int[] array = {1, 34, 3, 42, 4, 4, 4, 2, 9, 10, 11, 12, 13, 14, 15};
        int expectedNumber = 15;
        Assert.assertEquals(expectedNumber,Level1.countSpecificElements(array));
    }

    @Test  //Task3  Я пока не разобрался почему фейлится
    public void testCountOfZeronumbersinarray() {
        int[] array = {0, 33, 2, 5, 63, 3, 0, 0, 3, 0, 3, 3, 1, 0};
        int[] expectedArray = {0, 6, 7, 9, 13};
        boolean b = Arrays.equals(expectedArray,Level1.countOfZeronumbersinarray(array));
        Assert.assertTrue("Task3 result ", b);
    }

    @Test// Task4 If first number is positive
    public void testFindWhichIsFirstPositiveorNegative() {
        int[] array = {0, 0, 2, -4, 24, 53};
        String expectedResult = "First number is positive";
        Assert.assertEquals(expectedResult,Level1.findWhichIsFirstPositiveorNegative(array));
    }

    @Test// Task4 If first number is negative
    public void test1FindWhichIsFirstPositiveorNegative() {
        int[] array = {0, 0, -2, -4, 24, 53};
        String expectedResult = "First number is negative";
        Assert.assertEquals(expectedResult,Level1.findWhichIsFirstPositiveorNegative(array));
    }

    @Test //Task5 If array is not sorted
    public void testIsArraySorted() {
        int[] array = {7, 8, 12, 22, 33, 51, 63, 64, 55};
        String expectedResult = "Array is not sorted";
        Assert.assertEquals(expectedResult, Level1.isArraySorted(array));
    }

    @Test //Task5 If array is sorted
    public void test1IsArraySorted() {
        int[] array = {7, 8, 12, 22, 33, 51, 63, 64, 65};
        String expectedresult = "Array is sorted";
        Assert.assertEquals(expectedresult, Level1.isArraySorted(array));
    }

    @Test //Task6
    public void testCreateArrayOfEvenNumbers() {
        int[] array = {1, 1, 2, 32, 1, 3, 51, 21};
        int[] expectedArray = {2, 32};
        Assert.assertArrayEquals(expectedArray, Level1.createArrayOfEvenNumbers(array));
    }

    @Test //Task7
    public void testChangeAllElementsToZ() {
        int[] array = {1, 2, -5, 4, 6, 44, 3, -13, -4, 44};
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, Level1.changeAllElementsToZ(array));
    }

    @Test //Task8
    public void test1CalculateTheNumberOfPositiveNegativeNulls() {
        int[] array = {5, 0, -8, -43, 8, 12, 32, 65, 0, 4, 0, 0};
        String expectedResult = "6,2,4";
        Assert.assertEquals(expectedResult, Level1.calculateTheNumberOfPositiveNegativeNulls(array));
    }

    @Test //Task9
    public void testChangeBiggestWithSmallest() {
        int[] array = {1, 4, 1, 3, 76};
        int expectedArray[] = {76, 4, 76, 3, 1};
        Assert.assertArrayEquals(expectedArray, Level1.changeBiggestWithSmallest(array));
    }

    @Test //Task10
    public void testPrintOnlyArrayIisLessOrEqualToI() {
        int[] array = {25, 1, 2, 1, 2, 1, 4, 11, 44};
        int expectedArray[] = {1, 2, 1, 2, 1, 4};
        Assert.assertArrayEquals(expectedArray, Level1.printOnlyArrayIisLessOrEqualToI(array));
    }

    @Test //Task11
    public void testPrintAllModuleEqualsM() {
        int[] array = {23, 12, 2, 1, 4, 1, 17, 11, 44};
        int m = 5;
        int l = 2;
        int[] expectedArray = {12, 2, 17};
        Assert.assertArrayEquals(expectedArray, Level1.printAllModuleEqualsM(array,m,l));
    }
}
