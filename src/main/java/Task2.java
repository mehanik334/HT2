import java.util.Arrays;

public class Task2 {

    public String removeAllInstanceFromArray(int[] arr, int num) {
        String res;
        Arrays.sort(arr);
        int newLenght = arr.length;
        int start = 0;
        int stop = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                if (newLenght == arr.length) {
                    start = i;
                    stop = start;
                    newLenght--;
                    continue;
                }
                stop++;
                newLenght--;
            }
        }
        res = "Lenght = " + newLenght + " New array : ";
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i >= start && i <= stop) {
                continue;
            }
            res += arr[i] + " ";
        }
        return res;
    }


}
