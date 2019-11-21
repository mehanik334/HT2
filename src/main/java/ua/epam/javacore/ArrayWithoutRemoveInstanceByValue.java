package ua.epam.javacore;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithoutRemoveInstanceByValue {

    public int findLenArrWithoutInst(int[] arr, int num) {
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
        allInstanceMoveEndArr(arr, start, stop);
        return newLenght;
    }

    public  void allInstanceMoveEndArr(int[] arr, int begin, int stop) {
        int countInst = stop - begin + 1;
        for (int i = begin; i < countInst; i++) {
            int temp;
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
        }
    }

    public void showResult() {
        int[] arr = getArray();
        int gettingNum = getNumber();
        int newLenght = findLenArrWithoutInst(arr, gettingNum);
        if (newLenght != 0) {
            System.out.println("New lenght array without instance - " + newLenght);
            System.out.print("{ ");
            for (int i = 0; i < newLenght; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("}");
        } else {
            System.out.println("Match not found");
        }
    }

    public int[] getArray() {
        int[] arr = new int[6];
        System.out.println("Enter 6 integer number");
        for (int i = 0; i < arr.length; i++) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();
            } else {
                System.out.println("return enter");
                i--;
            }
        }
        return arr;
    }

    public int getNumber() {

        int num = 0;
        System.out.println("Enter the number you want to remove from the array");
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                break;
            } else {
                System.out.println("return enter");
            }
        }
        return num;
    }


}
