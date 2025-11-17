package COM.CWH_ANSHU;
class myThr extends Thread{
    // this is the thread constructor
    public myThr(String  name ){
        super(name);
    }

    public  void run(){
        int i=34;
        System.out.println("Thank You ");
//        while (true){
//            System.out.println("I am a Thread ");
//
//        }
    }
}
public class CWH_OOPS_CH11_THREAD_CONSTRUCTOR {
    public static void main(String[] args) {
        myThr t=new myThr("Anshu");
        t.start();
        System.out.println("The id of the 't' thread is "+t.getId());
        System.out.println("The name of the 't' thread is "+t.getName());
        System.out.println("The priority of the 't' thread is "+t.getPriority());
    }
}
