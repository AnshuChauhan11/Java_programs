package COM.CWH_ANSHU;

import java.util.Scanner;

public class CWH_OOPS_CH14_EXCEPTION_ERROR {
    public static void main(String[] args) {
        /*
            THERE ARE 3 TYPES OF ERROR
            1.Syntax error :-
            2.Logical error :-
            3.Runtime error ( exception )
         */

        // Syntax error
        //int a=4 :- SEMICOLON ERROR
        // B=8;  :-  VARIABLE B IS NOR DECLARED

       // Logical error
        // print all prime number from 1 to 10
        System.out.println(2);
        for (int i = 1; i <5 ; i++) {
            System.out.println(2*i+1);   // LOGICAL ERROR IN THIS LINE BECAUSE IT'S PRINT THE NUMBER
                                        // 9 WHICH ARE NOT PRIME NUMBER
        }

        // RUNTIME ERROR

        int k;
        Scanner sc=new Scanner(System.in);
        k=sc.nextByte();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
    }
}
