package COM.CWH_ANSHU;

class ekClass{
    int a;
    // this is getter of a
    public int getA() {
        return a;
    }

    ekClass(int a){  // this line creating the constructor
        this.a=a;
    }
    public int return1(){
        return 1;
    }
}

class doClass extends ekClass{
    doClass(int c){
        super(c);
        /*
                ( super ) keyword work on only argumented  constructor which is extends from
                for example:
                            In the ( ekClass) the constructor (ekClass) is want to take one
                            argument so in (doClass) the Constructor (doClass) using the (Super )
                            keyword for execute the constructor (ekClass)
         */
        System.out.println("Hey! i am a constructor ");
    }
}
public class CWH_OOPS_CH10_THIS_SUPER_KEYWORD{
    public static void main(String[] args) {
        ekClass ek=new ekClass(45);
        doClass d=new doClass(77);
//        System.out.println(ek.getA());
    }
}
