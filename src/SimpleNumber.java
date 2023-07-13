import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SimpleNumber {

    public static boolean simpleNumber (int x){
        int [] array = new int[x-2];
        int c = 2;

        for (int i = 0; i<array.length; i++){
            array[i] = c;
            c++;
        }

        for (int number : array){
            if (x%number == 0){
                return false;
            }
        }
        return true;
    }
}
