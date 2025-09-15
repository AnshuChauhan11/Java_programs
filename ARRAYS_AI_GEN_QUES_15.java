package COM.AI_CHAT_GPT;


//Q5-> Count even and odd numbers in an array
import java.util.Scanner;

public class ARRAYS_AI_GEN_QUES_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter the element of array : ");
        int even=0,odd=0;
        for (int i = 0; i <size ; i++) {
            ar[i]=sc.nextInt();
        }
        for (int i = 0; i <size ; i++) {
            if (ar[i]%2!=0){
                even++;
            } else odd++;
        }
        System.out.println("The total count of even number is : "+even);
        System.out.println("The total count of odd number is : "+odd);
    }
}
