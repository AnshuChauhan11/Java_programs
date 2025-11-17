package COM.CWH_ANSHU;


import java.util.Random;
import java.util.Scanner;

class game_1{
    public int number;
    public int inputNumber;
    public int numberOFGuesses;


        // getter's of noOFGuesses
    public int getNumberOFGuess() {
        return numberOFGuesses;
    }

    public void setNumberOFGuess(int numberOFGuess) {
        this.numberOFGuesses = numberOFGuess;
    }
            // USING THE CONSTRUCTOR WE SOLVE THE GUESSES NUMBER PROBLEM
        game_1(){
        Random random=new Random();

        this.number=random.nextInt(100);
    }

    // CREATE THE takeUserInput METHOD
    void takeUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your input =");
        inputNumber=sc.nextInt();
    }

    // CREATE IS isCorrectNumber METHOD
    boolean isCorrectNumber(){
        if (inputNumber==number){
            return true;
        }
        else if (inputNumber<number){
            System.out.println("Too low.......");
        } else if (inputNumber>number){
            System.out.println("Too high........... ");
        }
        return  false;
        }
    }


public class CWH_EXERCISE_3_GUESS_NUMBERS {
    public static void main(String[] args) {
        /*
            create a class Game,which allows a user to play "Guess the Number:
            game once.Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNUmber() to detect whether the number entered by the user is true
            4.getter & setter's for noOfGuesses
            use properties such as noOfGuesses(int),etc to get this task done!
         */
        game_1 g = new game_1();
        boolean b=false;
        while (b!=true) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
