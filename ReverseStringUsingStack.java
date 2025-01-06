

public class ReverseStringUsingStack {
    public static void main(String args[]) {
        // create a new string
        StringBuffer s = new StringBuffer("GeeksQuiz");
        reverseStringUsingStack(s);
        System.out.println("Reversed string is " + s);


    }

    private static void reverseStringUsingStack(StringBuffer s) {

        int n = s.length();
        ReverseStack stack = new ReverseStack(n);

        for(int i= 0; i<s.length(); i++){
            stack.push(s.charAt(i));
        }
        for(int i= 0; i<s.length(); i++){
            char ch = stack.pop();
            s.setCharAt(i, ch);
        }
    }
}
class ReverseStack {
    int top = -1;
    int size;
    char[] a;

    ReverseStack(int size){
        this.size = size;
        a = new char[size];
    }


    public void push(char c) {

        if(top >= size){
            System.out.println("Stack is overflow");
        }else{
            a[++top]= c;
        }
    }

    public char pop() {
        if(top == -1){
            System.out.println("Stack is overflow");
            return 0;

        }else{
            return a[top--];
        }

    }
}
