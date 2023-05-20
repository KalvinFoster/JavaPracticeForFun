package chapterThree;
import java.util.Scanner;
/**
 * 
 * @author kalfo
 * This lottery program involves generating random numbers, comparing digits, and using boolean operators.
 * Write a program that generates a 2 digit number, and determains if the user wins according to the following rules.
 * 1. if the user input matches the number exactly the award is $10,000
 * 2. if all digits match but are not in order, user only wins $3,000
 * 3. if one digit matches the user only wins $1,000
 */
public class LotteryGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Generate a lottery number
        int lottery = (int)(Math.random() * 10);
         //Test: System.out.println(lottery);
        // Prompt the user to guess
        System.out.println("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();
        
        // Get digits from lottery
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;
        
        // Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
        // Check the Guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Matched all digits!! you win $3,000!!!");
        else if (guessDigit1 == lotteryDigit1 
              || guessDigit1 == lotteryDigit2 
              || guessDigit2 == lotteryDigit1
              || guessDigit2 == lotteryDigit2)
            System.out.println("You Matched 1 digits that will be $1,000!!!");
        else 
            System.out.println("No Match Sorry");
    }
    
}
