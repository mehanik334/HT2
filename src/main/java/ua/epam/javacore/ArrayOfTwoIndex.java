package ua.epam.javacore;

public class ArrayOfTwoIndex {

    public int[] findIndexes(int[] arr, int target) {
        int[] arrIndex = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    arrIndex[0] = i;
                    arrIndex[1] = j;
                }
            }
        }
        return arrIndex;
    }
}
