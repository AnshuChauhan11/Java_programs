import java.util.LinkedList;
// import java.util.*;

public class LL_WITH_COLLECTION {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();

        // ADD IN FIRST 
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        System.out.println(list);
        
        System.out.println("----------------------------------");
        // ADD AT END OR LAST   
        list.addLast("my");
       // list.addLast("List");
        // or second way to add element in last 
        list.add("list");
        System.out.println(list);

        System.out.println("----------------------------------");
        // FIND THE SIZE OF LIST 
        int s=list.size();
        System.out.println("The size of list is : "+s);
        
        System.out.println("----------------------------------");
        // PRINT THE LIST 
        for (int i = 0; i < list.size(); i++) {
            // .get(index) -> is used for get or fetch the element form 
            // list  
            System.out.print(list.get(i)+"-> ");
        }
        System.out.println("NULL");


        System.out.println("----------DELETE SPECIFIC ELEMENT ---------------------");

        // DELETE THE SPECIFIC ELEMENT 
        list.remove(3);
        System.out.println(list);
        
        System.out.println("----------------DELETE FIRST ------------------");
        //  DELETE  FROM FIRST 
        /*
        FOR  delete the first element we use the .remove() function 
        */
        
        list.removeFirst();
        System.out.println(list);
        
        System.out.println("---------------DELETE LAST -------------------");
        // DELETE FORM LAST OR END 
        list.removeLast();
        System.out.println(list);
        
    }
}
