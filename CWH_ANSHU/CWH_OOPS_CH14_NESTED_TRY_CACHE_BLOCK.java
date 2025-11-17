package COM.CWH_ANSHU;

import java.util.Scanner;

public class CWH_OOPS_CH14_NESTED_TRY_CACHE_BLOCK {
    public static void main(String[] args) {
        int marks[]=new int[5];
        Scanner sc=new Scanner(System.in);
        marks[0]=4;
        marks[1]=45;
        marks[2]=66;
        marks[3]=56;
        marks[4]=87;

        System.out.println("Enter the index : ");
        int ind=sc.nextByte();

        try {
            System.out.println("Hey I love my 💕💕(❁´◡`❁) India ");
            try {
                System.out.println("The value at the index "+ind+" : "+marks[ind]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry : This index does not exist : ");
                System.out.println("Exception in level 2 ");
            }
        }

        catch (Exception e){
            System.out.println("Exception  in level 1 ");
        }
    }
}
