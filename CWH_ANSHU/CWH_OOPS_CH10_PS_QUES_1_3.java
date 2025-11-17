package COM.CWH_ANSHU;

class circle1{
    public int rad;
        // non parametrized constructor
    circle1(){
        System.out.println("I am non parametrized constructor of circle class ");
    }
        // it is parametrized constructor
   circle1(int r) {
        System.out.println("I am parameterized constructor of circle class  ! ");
        this.rad = r;
    }

    public double area(){
        return Math.PI*rad*rad;
    }
}
class cylinder1 extends circle1{
    public int height;
    cylinder1(int r,int h){
        super(r);
        System.out.println("I am cylinder1 parametrized constructor ");
        this.height=h;
    }
    public void volume(){
        double result;
        result=Math.PI*rad*rad*height;
        System.out.println("The volume of cylinder is : "+result);
    }
}
public class CWH_OOPS_CH10_PS_QUES_1_3 {
    public static void main(String[] args) {
        // problem 1
        circle1 cir=new circle1(5);
        cylinder1 cy1=new cylinder1(4,5);
        System.out.println("The area of circle is : "+cir.area());
        cy1.volume();

    }
    // this code is solution of problem 3rd
}
