package Sorting;

public class BinarySearch {

    public int binarySearchRecursive(int[] arr, int start, int end, int num) {
        int index = -1;
        if (start > end) {
            return index;
        }

        int mid = (start + end) / 2;

        if (num == arr[mid]) {
            index = mid;
            return index;
        }

        if (num < arr[mid]) {
            index = binarySearch(arr, start, mid - 1, num);
        } else {
            index = binarySearch(arr, mid + 1, end, num);
        }

        return index;
    }

    public int binarySearch(int[] arr, int start, int end, int num) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num == arr[mid]) {
                return mid;
            }

            if (num < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
