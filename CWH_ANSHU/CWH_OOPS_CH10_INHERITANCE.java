package COM.CWH_ANSHU;

class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am setting x  now ");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am method ");
    }

}
// INHERED THE BASE CLASS  USING extend KEYWORD
class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class CWH_OOPS_CH10_INHERITANCE {
    public static void main(String[] args) {
//        derived d=new derived();
        base b=new base();
        b.setX(45);
        System.out.println(b.getX());
    }
}
