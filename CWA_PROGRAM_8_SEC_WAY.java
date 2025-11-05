package Com_Sem.CodeWithAnshu;

import java.util.Scanner;

public class CWA_PROGRAM_8_SEC_WAY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String  str=sc.nextLine();
        String []word=str.split(" ");
        for (int i = 0; i <str.length() ; i++) {
//            char ch=word[i].charAt(0);
            char ch=str.charAt(0);
            if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                System.out.println("String are start with vowel : ");
//                System.out.println(word[i]);
                break;

            }
            else {
                System.out.println("String are not start with vowel ");
                break;
            }
        }
    }
}
