package COM.CWH_ANSHU;

import java.util.Scanner;

class circle{
    int rad;
    public float area(){
        return 3.14f*rad*rad;
    }
    public float perimeter(){
        return 2*3.14f*rad;
    }
}

public class CWH_OOPS_CH8_PS_Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        circle cir=new circle();
        System.out.println("Enter the radius of circle = ");
        cir.rad=sc.nextInt();
        System.out.println("The area of circle is = "+cir.area());
        System.out.println("The perimeter of circle is = "+cir.perimeter());
    }
}
