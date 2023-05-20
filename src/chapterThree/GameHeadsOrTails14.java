package chapterThree;
import java.util.Scanner;
/**
 *
 * @author kalfo
 * Create a Heads or Tails game by generating a number between 0 and 1 
 * ask user to guess by getting an input of 0 or 1, tell user if they guessed right
 */
public class GameHeadsOrTails14 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        // Code for coin flip and store the value
        int coin = (int)(Math.random() * 2);
        //System.out.println(coin);
        // prompt the user for input
        System.out.println("Please enter you guess if the coin is heads or tails--- 0 or 1: ");
        // store user input
        int answer = input.nextInt();
        // validate user input output result
        if (answer == coin){
            System.out.println("Congrats!! you guessed right! the coin was " + coin);
        }
        else{
            System.out.println("Wrong you guessed " + answer + " While the coin actually landed on " + coin);
        }
       
        
        
        
    }
    
}
