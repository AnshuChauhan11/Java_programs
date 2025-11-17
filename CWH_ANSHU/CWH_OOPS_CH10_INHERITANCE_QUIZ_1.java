package COM.CWH_ANSHU;

class animal{
   void eat(){
       System.out.println("Eating...........");
   }
}

class dog extends animal{
       void bark(){
        System.out.println("Barking.......");
           }
}

public class CWH_OOPS_CH10_INHERITANCE_QUIZ_1 {
    public static void main(String[] args) {
        animal an=new animal();
        dog d=new dog();
        an.eat();
        d.bark();
    }
}
