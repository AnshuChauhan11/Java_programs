package COM.CWH_ANSHU;

class rectangle1{
    public int length ;
    public int width;

    public int getLength() {
        return length;
    }

//    public void setLength(int length) {
//        this.length = length;                         // NOT REQUIRED BECAUSE IS ALREADY IN CONSTRUCTOR
//    }

    public int getWidth() {
        return width;
    }

//    public void setWidth(int width) {
//        this.width = width;                            // NOT REQUIRED BECAUSE IS ALREADY IN CONSTRUCTOR
//    }

    rectangle1(int len, int wid) {
         System.out.println("I am parametrized constructor of rectangle1 class ");
        this.length = len;
        this.width = wid;
    }

    public  int  area(){
      return length*width;
    }
}


class cuboid extends rectangle1{
    public int breadth;
    public int height;

    public int getBreadth() {
        return breadth;
    }

    public int getHeight() {
        return height;
    }

    public cuboid(int len, int wid, int breadth, int height) {
        super(len, wid);
        this.breadth = breadth;
        this.height = height;
    }

    public int volume(){
        return length*height*breadth;
    }

}
public class CWH_OOPS_CH10_PS_QUES_2_4 {
    public static void main(String[] args) {
        rectangle1 rec1=new rectangle1(3,4);
        cuboid cube=new cuboid(3,4,6,7);
        System.out.println("The area of rectangle1 is = "+rec1.area());
        System.out.println("The volume of cuboid is = "+cube.volume());
    }
}
