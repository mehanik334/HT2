import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Task4Test {

    private Task4 task4 = new Task4();

    @Test
    public void arrPlusOneTest() {
        int[] arr = {1, 2, 3};
        int[] res = {1, 2, 4};
        assertArrayEquals(task4.arrPlusOne(arr), res);
    }
}
