package Com_Sem.CodeWithAnshu;

class  parent1{
    final  int a=100;
    void display(){
        System.out.println("I am method of parent class ");
    }
}

class  chile1 extends parent1{
    void  show(){
        super.display();
        System.out.println("I am method of chile class ");
    }
}
public class CWA_PROGRAM_14 {
    public static void main(String[] args) {
    //parent1 p=new parent1();
    chile1 c=new chile1();
    //p.display();
    c.show();
        System.out.println("The final value is = "+c.a);
    }
}
