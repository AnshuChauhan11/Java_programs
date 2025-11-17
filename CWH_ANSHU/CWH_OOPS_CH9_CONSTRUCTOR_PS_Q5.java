package COM.CWH_ANSHU;

import java.util.Scanner;

class sphere{
     int rad;
     public double sphereArea(){
         return 4*3.14*rad*rad;
     }
}
public class CWH_OOPS_CH9_CONSTRUCTOR_PS_Q5 {
    public static void main(String[] args) {
        sphere sp=new sphere();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of sphere = ");
        sp.rad=sc.nextInt();
        System.out.println("The Area of sphere is = "+sp.sphereArea());
    }
}
