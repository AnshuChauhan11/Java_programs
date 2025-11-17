package COM.CWH_ANSHU;

interface TV_remote{
    void on();
    void off();
}
interface  smartTV_remote extends TV_remote{
    default void on(){
        System.out.println("TV on..");
    }
    default void off(){
        System.out.println("TV off ");
    }
}
class   mySmartTv_remote implements smartTV_remote{

}

public class CWH_OOPS_CH11_PS_QUES_6 {
    public static void main(String[] args) {
      mySmartTv_remote s=new mySmartTv_remote();
      s.on();
      s.off();
    }
}
