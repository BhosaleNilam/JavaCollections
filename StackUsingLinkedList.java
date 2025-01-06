class Node {

    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack{
    Node head;

    Stack(){
        this.head = null;
    }

    void Push(int new_data){
        Node new_node = new Node(new_data);
        if(head == null){
            head = new_node;
        }
        new_node.next = head;
        head = new_node;
        System.out.println("Data Pushed to the LinkedList");
    }
   /* void PrintLinkedList(){
        Node temp = head;
        if(head == null ){
            System.out.println("LL does not exists");
        }else{
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }*/

    void pop(){
        if(head == null){
            System.out.println("LL does not exists");

        }else{
            Node temp = head;
            head = head.next;
            temp = null;
        }
    }

    int peek(){

        if(head != null){

            return head.data;
        }
        return 0;
    }


}





public class StackUsingLinkedList {
    public static void main(String args[]) {

        Stack s = new Stack();
        s.Push(10);
        s.Push(20);
        s.Push(30);
        s.Push(40);
        s.Push(50);
        s.pop();
        System.out.println(s.peek());

    }
}
