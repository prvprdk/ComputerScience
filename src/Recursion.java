public class Recursion {
    public static int fac(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * fac(a - 1);
        }
    }

    public static void printNumbersDown (int a){
        if (a == 0){
            return;
        }else {
            System.out.print(a + "|");
            printNumbersDown(a-1);
        }

    }
    public static void printNumbersUp (int a){
        if (a == 0){
            return;
        }else {
            printNumbersUp(a - 1);
            System.out.print(a + "|");
        }
    }
    ////factorial factorial not recursion
    private static int facTo(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return  result;
    }

}
