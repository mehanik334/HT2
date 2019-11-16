import java.util.Arrays;

public class Task5 {


    public boolean findDublicateInArray(int[] arr) {
        boolean result = false;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
