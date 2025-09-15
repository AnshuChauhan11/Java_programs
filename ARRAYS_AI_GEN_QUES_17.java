package COM.AI_CHAT_GPT;

// Q7-> Merged two arrays into one
import java.util.Scanner;

public class ARRAYS_AI_GEN_QUES_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array 1 : ");
        int n1=sc.nextInt();
        System.out.println("Enter the size of array 2 : ");
        int n2=sc.nextInt();
        int ar1[]=new  int[n1];
        int ar2[]=new int[n2];
        int merged[]=new int[n1+n2];
        System.out.println("Enter the element of array 1st ☻:");
        for (int i = 0; i <n1 ; i++) {
            ar1[i]=sc.nextInt();
        }
        System.out.println("Enter the element of array 2nd : ♥ ");
        for (int i = 0; i <n2 ; i++) {
            ar2[i]=sc.nextInt();
        }
        for (int i = 0; i <n1 ; i++) {
            merged[i]=ar1[i];
        }
        for (int i = 0; i <n2 ; i++) {
            merged[n1+i]=ar2[i];
        }
        System.out.println("The merged array is : ♥  ");
        for(int x:merged){
            System.out.print(x+" ");
        }
    }
}
