import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
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
        Assert.assertEquals(Level1.countSpecificElements(array), expectedNumber);
    }

    @Test  //Task3  Я пока не разобрался почему фейлится
    public void testCountOfZeronumbersinarray() {
        int[] array = {0, 33, 2, 5, 63, 3, 0, 0, 3, 0, 3, 3, 1, 0};
        int[] expectedArray = {0, 6, 7, 9, 13};
        boolean b= Arrays.equals(Level1.countOfZeronumbersinarray(array),expectedArray );
        Assert.assertTrue("Task3 result ", b);
    }

    @Test// Task4 If first number is positive
    public void testFindWhichIsFirstPositiveorNegative() {
        int[] array = {0, 0, 2, -4, 24, 53};
        String expectedResult = "First number is positive";
        Assert.assertEquals(Level1.findWhichIsFirstPositiveorNegative(array), expectedResult);
    }

    @Test// Task4 If first number is negative
    public void test1FindWhichIsFirstPositiveorNegative() {
        int[] array = {0, 0, -2, -4, 24, 53};
        String expectedResult = "First number is negative";
        Assert.assertEquals(Level1.findWhichIsFirstPositiveorNegative(array), expectedResult);
    }

    @Test //Task5 If array is not sorted
    public void testIsArraySorted() {
        int[] array = {7, 8, 12, 22, 33, 51, 63, 64, 55};
        String expectedresult ="Array is not sorted";
        Assert.assertEquals(Level1.isArraySorted(array),expectedresult);
    }
    @Test //Task5 If array is sorted
    public void test1IsArraySorted() {
        int[] array = {7, 8, 12, 22, 33, 51, 63, 64, 65};
        String expectedresult ="Array is sorted";
        Assert.assertEquals(Level1.isArraySorted(array),expectedresult);
    }
    @Test //Task6
    public void testCreateArrayOfEvenNumbers(){
        int[] array = {1, 1, 2, 32, 1, 3, 51, 21};
        int[] expectedArray={2,32};
        Assert.assertArrayEquals(Level1.createArrayOfEvenNumbers(array),expectedArray);
    }
    @Test //Task7
    public void testChangeAllElementsToZ() {
        int[] array = {1, 2, -5, 4, 6, 44, 3, -13, -4, 44};
    int expectedResult=3;
        Assert.assertEquals(Level1.changeAllElementsToZ(array),expectedResult);
    }
    @Test //Task8
    public void test1CalculateTheNumberOfPositiveNegativeNulls(){
        int[] array = {5, 0, -8, -43, 8, 12, 32, 65, 0, 4, 0, 0};
        String expectedResult="6,2,4";
        Assert.assertEquals(Level1.calculateTheNumberOfPositiveNegativeNulls(array),expectedResult);
    }
    @Test //Task9
    public void testChangeBiggestWithSmallest() {
        int[] array = {1, 4, 1, 3, 76};
        int expectedArray[]={76,4,76,3,1};
        Assert.assertArrayEquals(Level1.changeBiggestWithSmallest(array),expectedArray);
    }
    @Test //Task10
    public void testPrintOnlyArrayIisLessOrEqualToI() {
    int [] array={25, 1, 2, 1, 2, 1, 4, 11, 44};
        int expectedArray[]={1,2,1,2,1,4};
        Assert.assertArrayEquals(Level1.printOnlyArrayIisLessOrEqualToI(array), expectedArray);
    }
}
