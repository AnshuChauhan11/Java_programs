import java.util.Scanner;

public class LINKED_LIST {
    
//Scanner sc=new Scanner(System.in);
//Node head=null;


    Node head;
    private int size;


    // CREATE THE CONTRUCTOR OF OUR CLASS 
    LINKED_LIST(){
        this.size=0;
    }


    // CREATING OUR NODE CLASS 
    class Node{
        String data;
        Node next;

        // NODE CLASS CUSNTROCTOR 
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
      
        // ADD AT FIRST 
        public void addFirst(String data){
            // System.out.println("Enter the data in string : ");
            // data=sc.nextLine();
            Node newNode= new Node(data);
            if (head==null) {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        // ADD AT END 
       public void addLast(String data){
            // System.out.println("Enter the data in string : ");
            // data=sc.nextLine();
             Node newNode= new Node(data);
            if (head==null) {
                head=newNode;
                return;
            }
            Node currNode=head;
            while (currNode.next!=null) {
                currNode=currNode.next;
            }
            currNode.next=newNode;
        }

        // PRINTING LIST 
        public void printList(){

            if (head==null) {
                System.out.println("List is empty : ");
                return;
            }
             Node currNode=head;
            while (currNode!=null) {
                System.out.print(currNode.data+"->");
                currNode=currNode.next;
            }
            System.out.println("NULL");
        }

        // DELETE FROM FIRST 
        public void deleteFirst(){
            if (head==null) {
                System.out.println("List is empty ");
                return;
            }
            size--;
          head=head.next;
        }

        // DELETE FROM LAST 
        public void deleteLast(){
            if (head==null) {
                System.out.println("List is empty :");
                return;
            }

            size--;

            // THIS CONDITION FOR WHEN ONLY ONE LIST ARE EXIST. THEN DELETE 
            if (head.next==null) {
                head=null;
                return;
            }

            Node secLastNode=head;
            Node lastNode=head.next;
            while (lastNode.next!=null) {
                lastNode=lastNode.next;
                secLastNode=secLastNode.next;
            }
            secLastNode.next=null;
            
        }

        // FOR FIND THE SIZE OF LINKED LIST : 
        public int getSize(){
            return size;
        }  
    
    public static void main(String[] args) {
        LINKED_LIST list=new LINKED_LIST();

        list.printList();
        System.out.println("---------------Result after add at first or bigining ------------------------ ");
        
        list.addFirst("is");
        list.addFirst("This");
        list.printList();

     
        System.out.println("---------------Result after add at end or last ------------------------ ");

        list.addLast("a");
        list.addLast("List");
        list.printList();

        System.out.println("---------------After delete from first------------------------ ");
        
        list.deleteFirst();
        list.printList();
        
        System.out.println("---------------After delete from  last ------------------------ ");

        list.deleteLast();
        list.printList();

        System.out.println("------------------------------------");

        System.out.println("The size of list is : "+list.getSize()); 
        list.addFirst("This");
        System.out.println("The size of list is (after add element)  : "+list.getSize()); 
    }
}
