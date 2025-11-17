package COM.CWH_ANSHU;

class rectangle_1{
    private int length;
    private int breadth;

    public rectangle_1() {
        this.length =5;
        this.breadth =4;
    }
    public rectangle_1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class CWH_OOPS_CH9_CONSTRUCTOR_PS_Q4 {
    public static void main(String[] args) {
        rectangle_1 rec=new rectangle_1(12,56);
        System.out.println(rec.getBreadth());
        System.out.println(rec.getLength());
    }
}
