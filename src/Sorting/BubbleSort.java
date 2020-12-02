package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSorting(int[] arr) {
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int maxIndex = 0;
            int max = arr[0];
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = max;
            arr[maxIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    //comparing with each element and getting the max to the last
    public static void swapSort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void recursiveBubble(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        recursiveBubble(arr, n - 1);
    }

    public static int fibonacci(int n) {
        //given number plus the number -1
        //stop when number = 1 and return 1
        if (n == 1) {
            return 1;
        }
        return (n + fibonacci(n - 1));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSortRecursion(int[] arr, int n) {
        if (n == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int j = n; j > 0; j--) {
            if (arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            } else {
                break;
            }
        }
        insertionSortRecursion(arr, n + 1);
    }

}
