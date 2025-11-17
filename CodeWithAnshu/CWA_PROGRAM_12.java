package Com_Sem.CodeWithAnshu;



class overload {
    public static void sh() {
        System.out.println("☻☻☻ no parameter : ♥♥♥♥");
    }

    void sh(int a) {
        System.out.println("Integer : " + a);
    }
}

      class  parent{
        void display(){
            System.out.println("I am parent class method : ");
        }
    }

    class child extends parent{
        void display(){
            System.out.println("I am child class method : ");
        }
    }

public class CWA_PROGRAM_12 {
    public static void main(String[] args) {
        overload o=new overload();
        parent p=new child();
        o.sh();
        o.sh(3);
        p.display();
    }
}
