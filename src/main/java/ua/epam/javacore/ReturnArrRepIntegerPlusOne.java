package ua.epam.javacore;

import java.util.Arrays;

public class ReturnArrRepIntegerPlusOne {


    public int[] arrPlusOne(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[arr.length - 1] == 9 || arr[i] == 10) {
                if (i == 0) {
                    arr[i] = 0;
                    arr = Arrays.copyOf(arr, arr.length + 1);
                    arr[i] = 1;
                    arr[arr.length - 1] = 0;
                } else {
                    arr[i] = 0;
                    arr[i - 1] += 1;
                }
            } else {
                if (i == arr.length - 1) {
                    arr[i] += 1;
                }
                break;
            }
        }
        return arr;
    }
}
