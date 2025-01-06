import java.util.Stack;

public class StackUsingArrays {

    static final int MAX = 1000;
    int top = -1;
    int[] a = new int [MAX];

    boolean push (int element){
       if(top >=MAX-1){
           System.out.println("Stack is overflow");
           return false;
       }else{
           a[++top] = element;
           System.out.println("Element pushed to the Stack.");
           return true;
       }
    }
    void print(){
        for(int i =top;i>-1; i-- ){
            System.out.print(" " +a[i]);
        }
    }

    int pop(){
        if(top == -1){
        System.out.println("Stack is empty");
        return 0;

        }else{
            int x = a[top--];
            System.out.println("Popped Element" +x);
            return x;
        }
    }

    int peek(){
        if(top == -1) {
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            int x = a[top];
            System.out.println("Peeked Element" +x);
            return x;
            }

    }
    public static void main(String args[]){
        StackUsingArrays s = new StackUsingArrays();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.pop();
        s.peek();
        s.print();

    }
}
