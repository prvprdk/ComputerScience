import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] array) {

        if (array.length > 1) {
            int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
            int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);
            mergeSort(left);
            mergeSort(right);
            merge(left, right, array);
        }
    }

    public static void merge(int[] left, int[] right, int[] array) {
        int indexLeft = 0;
        int rightIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (indexLeft < (left.length) && (rightIndex >= right.length || left[indexLeft] < right[rightIndex])) {
                array[i] = left[indexLeft];
                indexLeft++;
            } else {
                array[i] = right[rightIndex];
                rightIndex++;
            }
        }
    }
}

