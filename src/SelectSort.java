
import java.util.Arrays;

public class SelectSort {
    public static void selectSort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            int indexMin = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[indexMin] > arrays[j]) {
                    indexMin = j;
                }
            }
            int temp = arrays[indexMin];
            arrays[indexMin] = arrays[i];
            arrays[i] = temp;
        }
    }
}

