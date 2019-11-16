import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task5Test {

    private Task5 task5 = new Task5();

    @Test
    public void findDublicateInArrayTest() {
        int[] arr = {1, 2, 3};
        assertEquals(task5.findDublicateInArray(arr), false);
    }
}
