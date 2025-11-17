package COM.CWH_ANSHU;

abstract  class  telePhone {
    abstract void ring();
    abstract  void lift();
    abstract  void disconnected();
}
class SmartPhone extends telePhone {
     void ring(){
        System.out.println("Ringing...... ");
    }
     void lift(){
        System.out.println("lifting ..........");
    }
     void disconnected(){
        System.out.println("Disconnecting ........ ");
    }
}
public class CWH_OOPS_CH11_PS_QUES_4 {
    public static void main(String[] args) {
        telePhone t=new SmartPhone();
        t.ring();
        t.lift();
        t.disconnected();
    }
}
