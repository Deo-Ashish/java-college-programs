package DAACodes;

import java.util.Arrays;

public class IterativeMergeSort {

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        // size of subarrays to merge: 1, 2, 4, 8, ...
        for (int size = 1; size < n; size *= 2) {

            // pick starting point of left subarray
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * size) {

                int mid = Math.min(leftStart + size - 1, n - 1);
                int rightEnd = Math.min(leftStart + 2 * size - 1, n - 1);

                merge(arr, temp, leftStart, mid, rightEnd);
            }
        }
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;      // left subarray pointer
        int j = mid + 1;   // right subarray pointer
        int k = left;      // temp array pointer

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // copy back to original array
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}



