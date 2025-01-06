import java.util.Stack;

public class StackClosingBracketProgram {

    public static void main(String[] args) {
        String s = "{()}[]";
        if (isValidParentheses(s))
            System.out.println("true");
        else
            System.out.println("false");
    }

    private static boolean isValidParentheses(String s) {

        Stack<Character> stack = new Stack();
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='{' ||s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else{
                if(!stack.isEmpty() && ((stack.peek() == '(' && s.charAt(i) == ')') ||
                        (stack.peek() == '{' && s.charAt(i) == '}') ||
                        (stack.peek() == '[' && s.charAt(i) == ']'))){
                    stack.pop();

                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
