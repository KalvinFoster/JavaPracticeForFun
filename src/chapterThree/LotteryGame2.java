package chapterThree;
import java.util.Scanner;
/**
 * 
 * @author kalfo
 * This lottery program involves generating random numbers, comparing digits, and using boolean operators.
 * Write a program that generates a 3 diget number, and determains if the user wins according to the following rules.
 * 1. if the user input matches the number exactly the award is $10,000
 * 2. if all digits match but are not in order, user only wins $3,000
 * 3. if one diget matches the user only wins $1,000
 */
public class LotteryGame2  {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Generate a lottery number
        int lottery = (int)(Math.random() * 100);
          System.out.println(lottery);
        // Prompt the user to guess
        System.out.println("Enter your lottery pick (up to 3 digits): ");
        int guess = input.nextInt();
        
        // Get digits from lottery
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = lottery / 10;
        int lotteryDigit3 = lottery % 10;
        
        /*System.out.println(lotteryDigit1);
        System.out.println(lotteryDigit2);
        System.out.println(lotteryDigit3);*/
        // Get digits from guess
        int guessDigit1 = guess / 100;
        int guessDigit2 = guess / 10;
        int guessDigit3 = guess % 10;
        // Check the Guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if ((guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit3) && (guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) && (guessDigit3 == lotteryDigit2 || guessDigit1 == lotteryDigit1))
            System.out.println("Matched all digits!! you win $3,000!!!");
        else if (guessDigit1 == lotteryDigit1 ||
                 guessDigit1 == lotteryDigit2 ||
                 guessDigit1 == lotteryDigit3 ||
                 guessDigit2 == lotteryDigit1 ||
                 guessDigit2 == lotteryDigit2 ||
                 guessDigit2 == lotteryDigit3 ||
                 guessDigit3 == lotteryDigit1 ||
                 guessDigit3 == lotteryDigit2 ||
                 guessDigit3 == lotteryDigit3)
            System.out.println("You Matched 1 digits that will be $1,000!!!");
        else 
            System.out.println("No Match Sorry");
    }
    
}


    

/*This still needs to be completed working
on boolen opperators, not hard jsut tedious
and will take some time but its 1am. going to bed*/