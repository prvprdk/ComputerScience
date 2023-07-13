import java.util.Scanner;

public class LinearSearch {
    private static final Integer numberForRandom = 6;


    public static void main(String[] args) {

        System.out.println(searchElement(5, createArray()));


    }

    private static Boolean searchElement(int x, int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                return true;
            }
        }
        return  false;
    }


    private static int[] createArray() {
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * numberForRandom);
        }
        return array;
    }
}

