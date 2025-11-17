package COM.CWH_ANSHU;

// WE IMPLEMENT THE RUNNABLE INTERFACE
class myRunnableThread1 implements Runnable{
    public void run(){
        for (int i = 0; i <20 ; i++) {


        System.out.println("I am a Thread Not a Threat 1");
    }
        }
}
class myRunnableThread2 implements Runnable{
    public void run() {
        for (int i = 0; i < 20; i++) {


            System.out.println("I am a Thread Not a Threat 2");
        }
    }
}
public class CWH_OOPS_CH11_RUNNABLE_THREAD {
    public static void main(String[] args) {

        myRunnableThread1 bullet1=new myRunnableThread1();
        Thread gun1=new Thread(bullet1);

        myRunnableThread2 bullet2=new myRunnableThread2();
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
