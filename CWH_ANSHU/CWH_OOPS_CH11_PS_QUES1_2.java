package COM.CWH_ANSHU;
/*
   question 1:create a abstract class pen with method write() and refill()
   as abstract class

   question 2: use the pen class from question 1 to create a concert class
   fountainPen with additional method changeNib()

 */
abstract  class pen{
    abstract  void write();
    abstract  void refill();

}

class FountainPen extends pen{
    void write(){
        System.out.println("Writing ");
    }
    void refill(){
        System.out.println("Refill...");
    }
    void changeNib(){
        System.out.println("Changing the nib : ");
    }
}
public class CWH_OOPS_CH11_PS_QUES1_2 {
    public static void main(String[] args) {
        pen p=new FountainPen() ;
        p.refill();
        p.write();
        FountainPen f=new FountainPen();
        f.changeNib();
    }
}
