package COM.CWH_ANSHU;

class phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is Java ");
    }
}

class smartPhone extends phone {
    public void welcome(){
        System.out.println("Your Welcome ....");
    }
    public void name(){
        System.out.println("My name is Java in class two ");
    }
}
public class CWH_OOPS_CH10_DYNAMIC_METHOD_DISPATCH {
    public static void main(String[] args) {

        // BOTH ARE ALLOWED BUT.....
//        phone vivo=new phone();
//        smartPhone smVivo=new smartPhone();
//        vivo.name();

                        // THIS IS NOT ALLOWED
                //        smartPhone ph2=new phone();

       phone ph=new smartPhone(); // this is allowed 
       ph.greet();
       ph.name();
    }
}
