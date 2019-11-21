package ua.epam.javacore;

import org.junit.Test;
import ua.epam.javacore.DublicatesInArraySearcher;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class DublicatesInArraySearcherTest {

    private DublicatesInArraySearcher task5 = new DublicatesInArraySearcher();

    @Test
    public void findDublicateInArrayFalseTest() {
        int[] arr = {1, 2, 3};
        assertFalse(task5.findDublicateInArray(arr));
    }

    @Test
    public void findDublicateInArrayTrueTest() {
        int[] arr = {1,1,2,3};
        assertTrue(task5.findDublicateInArray(arr));
    }
}
