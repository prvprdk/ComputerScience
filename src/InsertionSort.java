import java.util.Arrays;

public class InsertionSort {

    public static void insertSort(int[] arrays) {

        for (int i = 0; i < arrays.length; i++) {
            int index = i;
            int temp = arrays[i];

            while (index > 0 && arrays[index - 1] > temp) {
                arrays[index] = arrays[index - 1];
                index--;
            }
            arrays[index] = temp;

        }
    }
}
