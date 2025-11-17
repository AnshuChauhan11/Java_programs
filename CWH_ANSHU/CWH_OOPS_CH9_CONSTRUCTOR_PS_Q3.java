package COM.CWH_ANSHU;


class  cylinder_2{
    private int radius;
    private int height;

    public cylinder_2(int radius, int height) {
        this.radius = radius;
        this.height = height;
        System.out.println("The radius of cylinder is : "+radius);
        System.out.println("The height of cylinder is : "+height);
    }
}

public class CWH_OOPS_CH9_CONSTRUCTOR_PS_Q3 {
    public static void main(String[] args) {
        cylinder_2 cly=new cylinder_2(5,9);

    }
}
