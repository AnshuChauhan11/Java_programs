package COM.CWH_ANSHU;


class cylinder{
    private int rad;
    private int height;

    public int getRad() {return rad;}

    public void setRad(int rad) {this.rad = rad;}

    public int getHeight() {return height;}

    public void setHeight(int height) {this.height = height;}
}
public class CWH_OOPS_CH9_CONSTRUCTOR_PS_Q1 {
    public static void main(String[] args) {
      cylinder myCylinder=new cylinder();
      myCylinder.setHeight(45);
      myCylinder.setRad(5);
        System.out.println("The height of cylinder = "+myCylinder.getHeight());
        System.out.println("The radius of cylinder="+myCylinder.getRad());
    }
}
