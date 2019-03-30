import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/**
 */
public class TestLevel1_2 {
    @Test // Task11
    public void testPrintAllModuleEqualsM() {
        int[] array = {23, 12, 2, 1, 4, 1, 17, 11, 44};
        int[] expectedarray = {12, 2, 17};
        Assert.assertEquals(Level1.printAllModuleEqualsM(array, 5, 2), expectedarray);

    }

    @Test // Task 12
    public void testChangeElementsPlaces() {
        int[] array = {25, 12, 2, 1, 4, 1, 4, 11, 44};
        int[] expectedarray = {12, 25, 1, 2, 1, 4, 11, 4, 44};
        Assert.assertEquals(Level1.changeElementsPlaces(array), expectedarray);
    }

    @Test //Task 13
    public void testPrintAllIncludingNull() {
        int[] array = {1, 4, -33, 2, 1, 4, 0, 11, 44};
        int[] expectedArray = {1, 4, -33, 2, 1, 4, 0};
        Assert.assertEquals(Level1.printAllIncludingNull(array), expectedArray);

    }

    @Test //Task 14
    public void testFindMaxEvenPlusMinOdd() {
        int[] array = {4, -34, -21, 2, 1, 4, 0, 11, 41};
        int expectedResult = 7;
        Assert.assertEquals(Level1.findMaxEvenPlusMinOdd(array), expectedResult);
    }

    @Test  //Task15
    public void testFindMultiplOfNumbersBuggerThenM() {
        int expectedResult = 231;
        int[] array = {4, 10, 10, 2, 1, 4, 11, 21};// задаем массив
        int m = 10; // m- переменная, с которой мы сравниваем числа в массиве
        Assert.assertEquals(Level1.findMultiplOfNumbersBuggerThenM(array, m), expectedResult);
    }

    @Test //Task16
    public void testFindbiggestnumberbyModule() {
        int[] array = {4, -36, -40, 2, 1, 35, 11, 21};
        int[] expectedArray = {4, 0, 0, 2, 1, 35, 11, 21};
        Assert.assertEquals(Level1.findbiggestnumberbyModule(array), expectedArray);
    }

    @Test //Task17. Test1
    public void testFindMultiplOfMinAnMinusNumbers() {
        int[] array = {2, -5, -450, 2, -1, 5, 10, 10};
        String expectedResult = "Multiplication of minus numbers is bigger";
        Assert.assertEquals(Level1.findMultiplOfMinAnMinusNumbers(array), expectedResult);
    }

    @Test //Task17. Test2
    public void test2FindMultiplOfMinAnMinusNumbers() {
        int[] array = {2, -5, 450, 2, -1, 5, 10, 10};
        String expectedResult = "Multiplication of plus numbers is bigger";
        Assert.assertEquals(Level1.findMultiplOfMinAnMinusNumbers(array), expectedResult);
    }

    @Test //Task18
    public void testFindFirstMaxElementOfArray() {
        int[] array = {2, -5, 45, 2, -1, 5, 10, 10, 45, 5};
        int[] expectedArray = {2, -5, 0, 2, -1, 5, 10, 10, 45, 5};
        Assert.assertEquals(Level1.findFirstMaxElementOfArray(array), expectedArray);
    }

    @Test //Task19
    public void testCreateNewArrayWhenEndsK() {
        int[] array = {2, -5, 45, 2, -1, 5, 16, 10, 125, 1015, 45, 5, 12505};
        int k = 5;
        int[] expectedArray = {45, 5, 125, 1015, 45, 5, 12505};
        Assert.assertEquals(Level1.createNewArrayWhenEndsK(array, k), expectedArray);
    }

    @Test (dataProvider = "testDataForTestChangeBigLettersToSmall")// ChangeBiglettersToSmall
    public void testChangeBigLettersToSmall(char[] array, char[] expectedArray) {
        Assert.assertEquals(ChangeBigLettersToSmall.changeBigLettersToSmall(array), expectedArray);
    }
    @DataProvider(name = "testDataForTestChangeBigLettersToSmall")
    public static Object[][] testData() {
        return new Object[][]{
                {new char[]{'A', 'n', 'b', 'v', 'F', 'F', 'v', 'K'}, new char[]{'a', 'n', 'b', 'v', 'f', 'f', 'v', 'k'}},
                {new char[]{'A', 'n', 'B', 'v', 'F', 'F', 'v', 'K'}, new char[]{'a', 'n', 'b', 'v', 'f', 'f', 'v', 'k'}},
                {new char[]{'N', 'n', 'b', 'v', 'F', 'F', 'v', 'K'}, new char[]{'n', 'n', 'b', 'v', 'f', 'f', 'v', 'k'}}
        };
    }


    @Test (dataProvider ="testDataForPrintMonthNumber") //testPrintMonthNumber
            public void testPrintMonthNumber(int month, String expectedMonthName) {
                Assert.assertEquals(PrintMonthNumber.printMonthByNumber(month),expectedMonthName);
    }
            @DataProvider (name ="testDataForPrintMonthNumber" )
    public static  Object[][] testData1() {
                return new Object[][]{
                        {1, "January"},
                        {2,"February"},
                        {3,"March"},
                        {4,"April"},
                        {5,"May"},
                        {6,"June"},
                        {7,"July"},
                        {8,"August"},
                        {9,"September"},
                        {10, "October"},
                        {11, "November"},
                        {12, "December"},
                };
            }

    @Test (dataProvider = "testDataForSortArrayByIncrease") //test for SortArrayByIncrease
    public void testSortArrayByIncrease (int[]array, int[]expectedArray){
        Assert.assertEquals(SortArrayByIncrease.sortArrayByIncrease(array),expectedArray);
    }
    @DataProvider(name ="testDataForSortArrayByIncrease")
    public static Object[][] testData3(){
        return new Object[][]{
                {new int[] {1090, 100, 84, 12, 22, 33, 1, 3, 64, 85, -3}, new int[] {-3, 1, 3, 12, 22, 33, 64, 84, 85, 100, 1090}},
                {new int[] {5,4,3,12,13,14,15,16,17,18,20}, new int[] {3,4,5,12,13,14,15,16,17,18,20}},
                {new int[] {34,4,-1,6,12,13,14,15,16,17,18,20}, new int[] {-1,4,6,12,13,14,15,16,17,18,20,34}},
        };
    }
}