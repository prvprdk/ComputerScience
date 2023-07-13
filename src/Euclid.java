import java.util.Arrays;

public class Euclid {


    private static int euclid(int x, int y) {

        while (y != 0) {
            int c = x % y;
            x = y;
            y = c;
        }
        return x;
    }
}
