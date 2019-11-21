package ua.epam.javacore;

public class LargeSumOfSubarray {

    public int[] findContSubarray(int[] arr, int n) {
        int sum = 0;
        int startIndex = 0;
        int finishIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == n) {
                    startIndex = i;
                    finishIndex = j;
                }
            }
        }
        int lenghtArrayContSub = finishIndex - startIndex + 1;
        int[] contSubarray = new int[lenghtArrayContSub];
        System.arraycopy(arr, startIndex, contSubarray, 0, lenghtArrayContSub);
        return contSubarray;
    }
}
