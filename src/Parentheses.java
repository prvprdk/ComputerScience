import java.util.Stack;


// check balance of parentheses in the string
public class Parentheses {

    private static boolean checkParentheses (String str){

        char [] array = str.toCharArray();
        Stack <Character> stackCheck = new Stack<>();

        for (char ch : array){

            if (ch == '('){
                stackCheck.push(ch);
            }
            if (ch == ')'){
                if (stackCheck.size() == 0){
                    return false;
                }else {
                    stackCheck.pop();
                }
            }
        }
        return stackCheck.size() == 0;
    }
}
