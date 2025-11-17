package COM.CWH_ANSHU;

import static COM.CWH_ANSHU.STACK_LL.Stack1.isEmpty;

public class STACK_LL {

    static  class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next=null;
        }
    }

    static class Stack1{
        public static Node head;

        public static boolean isEmpty(){
            return head==null;
        }

        // push function

        public static void push(int data){
            Node newNode =new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        // pop function

        public static int  pop(){
            if (isEmpty()) {
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        // peek function

        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;

        }
    }
    public static void main(String[] args) {

        Stack1 s=new Stack1();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

