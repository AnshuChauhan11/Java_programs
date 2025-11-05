package Com_Sem.CodeWithAnshu;

import java.util.Scanner;

public class CWA_FIND_FREQUENCY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size  of array : ");
        int size=sc.nextInt();
        int []arr=new int[size];
        int freq[]=new int[arr.length];
        int visited=-1;

        System.out.println("Enter the element of array : ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        // calculate the occur  of number
        for (int i = 0; i <arr.length ; i++) {
            int count=1;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    count++;
                    freq[j]=visited;
                }
            }
            if (freq[i]!=visited){
                freq[i]=count;
            }
        }
        System.out.println("Element "+" |  "+"Frequency");
        for (int i = 0; i <arr.length ; i++) {
            if (freq[i]!=visited){
                System.out.println(arr[i]+"       |      "+freq[i]);
            }
        }
    }
}
