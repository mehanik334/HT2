import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task2Test {

    private Task2 task2 = new Task2();

    @Test
    public void removeAllInstanceFromArrayTest() {
        int[] arr = {1, 2, 3, 2};
        assertEquals(task2.removeAllInstanceFromArray(arr, 2), "Lenght = 2 New array : 1 3 ");
    }
}
