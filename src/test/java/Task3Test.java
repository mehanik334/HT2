import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Task3Test {

    private Task3 task3 = new Task3();

    @Test
    public void findIndexesTest() {
        int[] arr = {2, 7, 11, 15};
        int[] res = {0, 1};
        assertArrayEquals(task3.findIndexes(arr, 9), res);
    }
}
