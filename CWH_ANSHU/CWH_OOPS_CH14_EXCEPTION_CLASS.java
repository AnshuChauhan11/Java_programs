package COM.CWH_ANSHU;
import java.util.Scanner;

class myException extends  Exception{
    @Override
    public String toString() {
        return "I am toString () method ";
    }

    @Override
    public String getMessage() {
        return "I am getMessage() method ";
    }
}
public class CWH_OOPS_CH14_EXCEPTION_CLASS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number b/w 1 to 9 ");
        int a = sc.nextInt();
        if (a < 9) {
            try {
//                throw new myException();
                throw  new ArithmeticException("Hey I am arithmetic exception ");
            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);
                System.out.println("finish 😒");
                e.printStackTrace();
            }
            System.out.println("complete finished (❁´◡`❁)");
        }
    }
}
