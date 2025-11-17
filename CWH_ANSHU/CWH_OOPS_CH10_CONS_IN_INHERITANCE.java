package COM.CWH_ANSHU;

class base1{
// CREATING THE CONSTRUCTOR
    // it is automatic invoke
    base1(){
        System.out.println("I am a constructor ");
    }
    base1(int x){
        System.out.println("I am a overloaded constructor with the value of x as : "+x);
    }

}

class derived1 extends base1{
    // constructor
    /*
        when we run the argument constructor of base class the
        We use the ( super ) keyword for execute
     */
    derived1(){
//        super(0);
        System.out.println("I am a constructor of derived class ");
    }

    derived1(int x,int y){
        super(x);
        System.out.println("I am a overloaded constructor of derived class with the value of y as : "+y);

    }
}

class chileOfDerived extends  derived1{
    chileOfDerived(){
        System.out.println("I am a child of derived constructor ");
    }
    chileOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am a overloaded constructor of childOfDerived  with the value of z as : "+z);

    }
}
public class CWH_OOPS_CH10_CONS_IN_INHERITANCE {
    public static void main(String[] args) {
//        base1 b=new base1();
//        derived1 d=new derived1();
//        derived1 d1=new derived1(15,88);
//        chileOfDerived cd=new chileOfDerived();
        chileOfDerived cd=new chileOfDerived(15,34,55);
    }
}
