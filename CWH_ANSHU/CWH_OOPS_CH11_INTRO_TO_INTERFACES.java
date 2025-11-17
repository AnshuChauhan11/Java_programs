package COM.CWH_ANSHU;

interface bicycle{
      int x=80;   // default it is set on final, or you use the final keyword
    void applyBreak(int decrement);
    void speedUp(int increment);
}
class avonCycle implements bicycle{
    int speed=8;
    public void applyBreak(int decrement){
        speed=speed-decrement;
        System.out.println("applying break ○ ");
        System.out.println(speed);
      }
    public void speedUp(int increment){
                speed+=increment;
        System.out.println("applying speedUp ♣ ");
        System.out.println(speed);
    }
}
public class CWH_OOPS_CH11_INTRO_TO_INTERFACES {
    public static void main(String[] args) {
             avonCycle a=new avonCycle();
            a.applyBreak(1);
            a.speedUp(5);
            // you can create the properties in interfaces
        System.out.println(a.x);

        // you can not modify the properties in interfaces as they are final
//        a.x=98;  // this line show an error
//        System.out.println(a.x);


    }
}
