package COM.CWH_ANSHU;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CWH_OOPS_CH14_SPECIFIC_EXCEPTION {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[5];
        marks[0]=4;
        marks[1]=45;
        marks[2]=66;
        marks[3]=56;
        marks[4]=87;

        System.out.println("Enter the array index : ");
        int ind=sc.nextByte();

        System.out.println("Enter the number you want to divide with : ");
        int number =sc.nextInt();
        try{
            System.out.println("The Value at array index entered is : "+marks[ind]);
            System.out.println("The Value of array-value/number is  : "+marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("Some Arithmetic exception occur ");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException  occur ");
            System.out.println(e);
        }
//        catch (InputMismatchException e){
//            System.out.println("InputMismatchException  occur ");
//            System.out.println(e);
//        }

        catch (Exception e){
            System.out.println("Some other exception occur ");
            System.out.println(e);
        }
    }
}
