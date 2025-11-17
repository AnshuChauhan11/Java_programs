package COM.CWH_ANSHU;

abstract  class parent1{
    parent1(){
        System.out.println("I am a constructor of parent1 class ☻ ! ");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet1();
}

class child1 extends parent1{
    @Override
    public void greet(){
        System.out.println("Good Morning ! ♥ ");
    }
    @Override
    public void greet1(){
        System.out.println("Good Afternoon");
    }
}

abstract  class chile2 extends parent1{
    public void sayHii(){
        System.out.println("Hii ♥ ");
    }
}
public class CWH_OOPS_CH11_ABSTRACT_CLASSES {
    public static void main(String[] args) {
//      parent1 p=new parent1(); --- through an error because parent1 class is an abstract class
      child1 ch=new child1();
      ch.greet();
      ch.greet1();
      ch.sayHello();
//      child2 ch2= new child2(); --- This line show an error because child1 class is an abstract class
    }
}