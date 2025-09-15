package COM.AI_CHAT_GPT;

//Q13-> Reverse an array
import java.util.Scanner;

// Q3-> reverse an array  ?
public class ARRAYS_AI_GEN_QUES_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the element of array : ");
        for (int i = 0; i < size; i++) {
         arr[i]=sc.nextInt();
        }
        System.out.println("Array element -----------------------");
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After --------reverse------------ an array ");
        for (int i = size-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
