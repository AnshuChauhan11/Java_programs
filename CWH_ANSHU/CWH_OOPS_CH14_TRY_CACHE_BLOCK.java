package COM.CWH_ANSHU;

import java.util.Scanner;

public class CWH_OOPS_CH14_TRY_CACHE_BLOCK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number  : ");
        int a=sc.nextInt();
        System.out.println("Enter the second number for division : ");
        int b=sc.nextInt();
        try {
        int c=a/b;
        System.out.println("The Result is "+c);
        }
        catch (Exception e){
            System.out.println("We failed to divide : Reason");
            System.out.println(e);
        }

        System.out.println("The program is end ! ");
    }
}
