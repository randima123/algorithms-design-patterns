package Sorting;

public class QuickSort {

    public void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int partitionIndex = partition(arr, start, end);

        quickSort(arr, start, partitionIndex - 1);
        quickSort(arr, partitionIndex + 1, end);
    }

    public int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int partitionIndex = start;

        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[partitionIndex];
                arr[partitionIndex] = temp;
                partitionIndex++;
            }
        }
        arr[end] = arr[partitionIndex];
        arr[partitionIndex] = pivot;
        return partitionIndex;
    }

}
