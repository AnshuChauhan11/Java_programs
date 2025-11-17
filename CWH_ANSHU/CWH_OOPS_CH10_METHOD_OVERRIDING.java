package COM.CWH_ANSHU;

class A{
    public int a;
    public int meth1(){
        return 1;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A ");
    }
}

class B extends A{
    @Override
    public void meth2(){  // This line different method from meth2 in class A because it parts of class B
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of Class B");
    }
}
public class CWH_OOPS_CH10_METHOD_OVERRIDING {
    public static void main(String[] args) {
        A a=new A();
        a.meth2();

        B b=new B();
        b.meth2();
    }
}
