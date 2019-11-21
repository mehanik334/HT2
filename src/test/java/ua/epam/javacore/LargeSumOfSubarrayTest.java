package ua.epam.javacore;

import org.junit.Test;
import ua.epam.javacore.LargeSumOfSubarray;

import static org.junit.Assert.assertArrayEquals;

public class LargeSumOfSubarrayTest {

    private LargeSumOfSubarray task1 = new LargeSumOfSubarray();
    private int[] arrTest = {1, 2, 3, 4, 5};

    @Test
    public void findRightCountSubarrayTest() {

        int[] arrActual = {3, 4};
        assertArrayEquals(task1.findContSubarray(arrTest, 7), arrActual);
    }

    @Test
    public void findFalseCountSubarrayTest() {
        int[] falseArr = {2,3};
        assertArrayEquals(task1.findContSubarray(arrTest,7),falseArr);
    }
}
