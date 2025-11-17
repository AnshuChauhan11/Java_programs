package Com_Sem.CodeWithAnshu;

import java.util.Scanner;

public class CWA_PROGRAM_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str=sc.nextLine();
        String rev=new StringBuilder(str).reverse().toString();
        if (str.equals(rev)){
            System.out.println("The String are palindrome . Thank You ♥");
        }else {
            System.out.println("The string are nor palindrome . Sorry ☺ ");
        }
    }
}
