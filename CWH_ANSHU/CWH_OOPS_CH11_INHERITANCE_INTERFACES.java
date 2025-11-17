package COM.CWH_ANSHU;

interface sampleInterface{
    void meth1();
    void meth2();
}

interface  chileSampleInterface extends  sampleInterface{
    /*
    meth1 and meth2 is inherit form the smapleInterface
    because childSampleInterface is extends the samplInterface

     */
    void meth3();
    void meth4();
}
class  MySampleClass implements  chileSampleInterface{
        public void meth1(){
            System.out.println("Meth1");
        }
        public void meth2(){
            System.out.println("Meth2");
        }
        public void meth3(){
            System.out.println("Meth3");
        }
        public void meth4(){
            System.out.println("Meth4");
        }
}
public class CWH_OOPS_CH11_INHERITANCE_INTERFACES {
    public static void main(String[] args) {
        MySampleClass ms=new MySampleClass();
        ms.meth1();
        ms.meth2();
        ms.meth3();
        ms.meth4();
    }
}
