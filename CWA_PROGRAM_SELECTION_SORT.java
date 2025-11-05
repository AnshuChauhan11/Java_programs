package Com_Sem.CodeWithAnshu;

import java.util.Scanner;

public class CWA_PROGRAM_SELECTION_SORT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element of array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size-1; i++) {
            int min = i;
            for (int j = i+1; j < size ; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min!=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        System.out.println("The sorted array is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
