import java.util.Scanner;

public class Caesar {
    static final int SHIFT = 3;

    public static void main(String[] args) {

        System.out.println("enter a word or phrase");

        Scanner scanner = new Scanner(System.in);

        for (;;){

        String name = scanner.next();
        System.out.println(caesar(name));
    }

}

    private static int search(char x, char[] chars) {

        int index = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == x) {
                index = i;
                break;
            }
        }
        return index;
    }



    private static String caesar (String name){
        char [] encoder = name.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : encoder) {
            int newIndex;
            if (Character.isUpperCase(c)) {
                newIndex = search(c, charABC()) + SHIFT;

                if (newIndex > charABC().length) {
                    newIndex = newIndex % charABC().length;
                    stringBuilder.append(charABC()[newIndex]);
                } else {
                    stringBuilder.append(charABC()[newIndex]);
                }

            } else {
                newIndex = search(c, charABCLow()) + 3;
                if (newIndex > charABCLow().length) {
                    newIndex = newIndex % charABCLow().length;
                    stringBuilder.append(charABCLow()[newIndex]);
                } else {
                    stringBuilder.append(charABCLow()[newIndex]);
                }
            }
        }
        return stringBuilder.toString();
    }
    private static char [] charABC (){
        StringBuilder str = new StringBuilder();
        for (char i = 'A'; i <= 'Z'; i++) {
            str.append(i);
        }
        return str.toString().toCharArray();
    }
    private static char [] charABCLow (){
        StringBuilder str = new StringBuilder();
        for (char i = 'A'; i <= 'Z'; i++) {
           str.append(Character.toLowerCase(i));

        }
        return str.toString().toCharArray();
    }
}

