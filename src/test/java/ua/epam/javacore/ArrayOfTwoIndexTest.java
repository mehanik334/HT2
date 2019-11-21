package ua.epam.javacore;

import org.junit.Test;
import ua.epam.javacore.ArrayOfTwoIndex;

import static org.junit.Assert.assertArrayEquals;

public class ArrayOfTwoIndexTest {

    private ArrayOfTwoIndex task3 = new ArrayOfTwoIndex();
    private int[] arr = {2, 7, 11, 15};

    @Test
    public void findRightIndexesTest() {

        int[] res = {0, 1};
        assertArrayEquals(task3.findIndexes(arr, 9), res);
    }

    @Test
    public void findFalseIndexesTest() {
        int [] res = {1,2};
        assertArrayEquals(task3.findIndexes(arr,9),res);
    }
}
