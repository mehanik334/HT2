package ua.epam.javacore;

import org.junit.Test;
import ua.epam.javacore.ArrayWithoutRemoveInstanceByValue;

import static org.junit.Assert.assertEquals;


public class ArrayWithoutRemoveInstanceByValueTest {

    private ArrayWithoutRemoveInstanceByValue task2 = new ArrayWithoutRemoveInstanceByValue();

    @Test
    public void returnRightLenArrWithoutInst() {
        int [] arr = {1,2,2,3};
        int num = 2;
        assertEquals(task2.findLenArrWithoutInst(arr,num),2);
    }

    @Test
    public void returnFalseLenArrWithoutInst() {
        int [] arr = {1,2,2,3};
        int num = 2;
        assertEquals(task2.findLenArrWithoutInst(arr,num),3);
    }
}
