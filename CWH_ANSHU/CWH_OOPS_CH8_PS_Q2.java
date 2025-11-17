package COM.CWH_ANSHU;

class cellphone{
    public void ring() {
        System.out.println("Ringing.....");
    }

    public  void vibrate(){
        System.out.println("Vibrating....");
    }
}

public class CWH_OOPS_CH8_PS_Q2 {
    public static void main(String[] args) {
        cellphone vivo=new cellphone();
        vivo.ring();
        vivo.vibrate();
    }
}
