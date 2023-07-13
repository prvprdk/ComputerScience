import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class BiSearch {

    public static int searchBi(int x, int[] array) {
        Arrays.sort(array);

        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            if (array[middleIndex] == x) {
                return 1;
            } else if (array[middleIndex] < x) {
                firstIndex = middleIndex + 1;
            } else if (array[middleIndex] > x) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
