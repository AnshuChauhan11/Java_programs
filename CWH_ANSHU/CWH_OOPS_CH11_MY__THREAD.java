package COM.CWH_ANSHU;
class myThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<30000){
            System.out.println("MyThread1 is Running");
            System.out.println("I am Happy");
            i++;
        }
    }
}class myThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<30000){
            System.out.println("Thread2  is Chatting ");
            System.out.println("I am Sad");
            i++;
        }
    }
}
public class CWH_OOPS_CH11_MY__THREAD {
    public static void main(String[] args) {
        myThread1 t1=new myThread1();
        myThread2 t2=new myThread2();
//        t1.run();
        t1.start();
        t2.start();
    }
}
