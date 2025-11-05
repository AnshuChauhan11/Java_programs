package Com_Sem.CodeWithAnshu;


import java.util.Scanner;

public class CWA_PROGRAM_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String line=sc.nextLine().toLowerCase();
        String []words=line.split(" ");
        for (String word:words){
            if (word.matches("^[aeiou].*")){
                System.out.println(word);
            } else {
                System.out.println(word+" : "+"first character not starts with vowel ");

            }
        }
    }
}


