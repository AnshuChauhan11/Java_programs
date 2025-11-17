package Com_Sem.CodeWithAnshu;

interface  animal{
    void sound();
}
class  dog implements animal{
    public void sound(){
        System.out.println("Dog barks ");
    }
}
public class CWA_PROGRAM_13 {
    public static void main(String[] args) {
//        animal d=new dog();
        // both way are right
        dog d=new dog();
        d.sound();
    }
}
