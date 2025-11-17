package COM.CWH_ANSHU;

import java.util.Scanner;

class  cylinder_1{
    int rad;
    int height;

    // METHOD OF CALCULATE SURFACE AREA OF CYLINDER
    public double surfaceArea(){
        return 2*3.14*rad*rad + 2+3.14*rad*height;
    }

    // METHOD OF CALCULATE VOLUME OF CYLINDER
    public double volume(){
        return 3.14*rad*rad*height;
    }
}

public class CWH_OOPS_CH9_CONSTRUCTOR_PS_Q2 {
    public static void main(String[] args) {
        cylinder_1 myCyl=new cylinder_1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of cylinder = ");
        myCyl.rad=sc.nextInt();
        System.out.println("Enter the height of cylinder = ");
        myCyl.height=sc.nextInt();
        System.out.println("The surface Area of cylinder is : "+myCyl.surfaceArea());
        System.out.println("The volume of cylinder is : "+myCyl.volume());
    }
}
