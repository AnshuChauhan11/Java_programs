package COM.CWH_ANSHU;

/* question  3 :  create a class monkey with jump() and bite() methods.
create a class human which inherit the monkey class and implement BasicAnimal interface
with eat and sleep method

question  5: demonstrate polymorphism using monkey class from question 3
 */
class  monkey{
    void jump(){
        System.out.println("Jumping ...");
    }
    void bite(){
        System.out.println("Biting.....");
    }
}
interface  basicAnimal{
    void eat();
    void sleep();
}
class Human extends monkey implements basicAnimal{
    void sound(){
        System.out.println("crying monkey  ,, ");
    }
    @Override
    public  void eat(){
        System.out.println("Eating animal  ...");
    }
    @Override
    public  void sleep(){
        System.out.println("Sleeping animal");
    }
}
public class CWH_OOPS_CH11_PS_QUES_3 {
    public static void main(String[] args) {
        Human h=new Human();
        h.eat();
        h.sleep();
        h.sound();
        h.eat();
        h.jump();
    }
}
