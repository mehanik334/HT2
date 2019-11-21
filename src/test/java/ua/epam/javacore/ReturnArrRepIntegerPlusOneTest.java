package ua.epam.javacore;

import org.junit.Test;
import ua.epam.javacore.ReturnArrRepIntegerPlusOne;

import static org.junit.Assert.assertArrayEquals;

public class ReturnArrRepIntegerPlusOneTest {

    private ReturnArrRepIntegerPlusOne task4 = new ReturnArrRepIntegerPlusOne();
    private int[] arr = {1, 2, 3};

    @Test
    public void arrPlusOneRightTest() {

        int[] res = {1, 2, 4};
        assertArrayEquals(task4.arrPlusOne(arr), res);
    }

    @Test
    public void arrPlusOneFalseTest() {

        int[] res = {1, 2, 5};
        assertArrayEquals(task4.arrPlusOne(arr), res);
    }
}
