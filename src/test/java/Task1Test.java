import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Task1Test {

    private Task1 task1 = new Task1();

    @Test
    public void findCountSubarrayTest() {
        int[] arrTest = {1, 2, 3, 4, 5};
        int[] arrActual = {3, 4};
        assertArrayEquals(task1.findContSubarray(arrTest, 7), arrActual);
    }
}
