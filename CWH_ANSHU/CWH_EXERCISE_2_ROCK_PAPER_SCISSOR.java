package COM.CWH_ANSHU;

import java.util.Random;
import java.util.Scanner;

public class CWH_EXERCISE_2_ROCK_PAPER_SCISSOR {
    public static void main(String[] args) {
        /*
        0 for ROCK
        1 for PAPER
        2 for SCISSOR
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for Rock,1 for Paper , 2 for Scissor = ");
        int userInput=sc.nextInt();
        Random random=new Random();
        int computerChoice=random.nextInt(3);
        if (computerChoice==userInput){
            System.out.println("Draw the match.....let's Try again .....");
        } else if((userInput==0 && computerChoice==2) || (userInput==1 && computerChoice==0) ||
                (userInput==2 && computerChoice==1)){
            System.out.println("You Won the match....enjoy the Game .. Thank_You...");
        }
        else {
            System.out.println("You lost the Match...Try again.....  OR  computer Win the match...");
        }
        System.out.println("Computer choice : "+computerChoice);
    }
}
