package COM.CWH_ANSHU;


import java.util.Scanner;

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class CWH_OOPS_CH8_PS_Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        square s=new square();
        System.out.println("Enter the side of square = ");
        s.side=sc.nextInt();
        System.out.println("The area of square is = "+s.area());
        System.out.println("The perimeter of square is ="+s.perimeter());
    }
}
