package COM.CWH_ANSHU;

import java.util.Scanner;

class rectangle{
    int length;
    int width;

   public int area(){
       return length*width;
   }
   public int perimeter(){
       return 2*(length+width);
   }
}

public class CWH_OOPS_CH8_PS_Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        rectangle rc=new rectangle();
        System.out.println("Enter the length of rectangle = ");
        rc.length=sc.nextInt();
        System.out.println("Enter the width of rectangle = ");
       rc.width =sc.nextInt();
        // create the object

        System.out.println("The area of rectangle is = "+rc.area());
        System.out.println("The perimeter of rectangle is = "+rc.perimeter());
    }
}
