package Com_Sem.CodeWithAnshu;

import java.util.Scanner;
class  addMethod{
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
       return a+b+c;
    }
    public static int add(int a,int b,int c,int d){
      return a+b+c+d;
    }
}
public class CWA_PROGRAM_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        addMethod ad=new addMethod();
        System.out.println(ad.add(2,3));
        System.out.println(ad.add(2,3,4));
        System.out.println(ad.add(1,2,3,4));
//        System.out.println("Enter the element : ");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        int d=sc.nextInt();

    }
}
