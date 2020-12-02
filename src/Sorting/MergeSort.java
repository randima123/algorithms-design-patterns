package Sorting;

public class MergeSort {

    public void mergeSort(int[] arr, int f, int l) {
        if (l <= f) {
            return;
        }
        System.out.println(f + " " + l);

        int m = (f + l) / 2;

        mergeSort(arr, f, m);
        mergeSort(arr, m + 1, l);
        merge(arr, f, m + 1, l);
    }

    public void merge(int[] arr, int f, int m, int l) {
        int[] oneArr = new int[m - f];
        int[] twoArr = new int[l - m + 1];

        for (int i = 0; i < oneArr.length; i++) {
            oneArr[i] = arr[f + i];
        }

        for (int i = 0; i < twoArr.length; i++) {
            twoArr[i] = arr[m + i];
        }

        int i = 0;
        int j = 0;
        int k = f;
        while (i < oneArr.length && j < twoArr.length) {

            if (oneArr[i] <= twoArr[j]) {
                arr[k] = oneArr[i];
                i++;
            } else {
                arr[k] = twoArr[j];
                j++;
            }

            k++;
        }

        while (i < oneArr.length) {
            arr[k] = oneArr[i];
            i++;
        }

        while (j < twoArr.length) {
            arr[k] = twoArr[j];
            j++;
        }
    }


}
