import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestLevel1Col {

    @Test //Task2 (1, 34, 3, 42, 4, 4, 4, 2, 9, 10, 11, 12, 13, 14, 15)
    public void TestCountSpecificElements() {
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
        int k=5;
        Assert.assertEquals(expectedNumber,Level1Collections.countSpecificElements(list,k));
    }
}
