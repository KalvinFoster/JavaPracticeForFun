package chapterThree;
import java.util.Scanner;

/**
 *
 * @author kalfo
 * 
 * Write a small rock paper scissors game - user enter 0, 1, 2 for rock paper scissors 
 * scissors > paper
 * paper > rock
 * rock > scissors
 * 
 * display a message indicating if the user or the computer wins, loses, or draws
 * 
 */
public class GameRockPaperScissors {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Generate a random number between 0,1,2 & Store computers number
        int computerAnswer = (int)(Math.random() * 3 );
        // Test: System.out.println(computerAnswer);
        
        
        // prompt user for input - rock paper or scissors 0,1,2
        System.out.println("Please enter 0 for rock, 1 for paper, or 2 for Sissors: ");
        // Store user input
        int userAnswer = input.nextInt();
        // Ditermain if user wins loses or draws - display results
        if(computerAnswer == userAnswer)
            System.out.println("Its a DRAW!!! the computer answered " + computerAnswer + " And you answered " + userAnswer);
        else if((userAnswer == 0) && (computerAnswer == 2))
            System.out.println("You win!!! you answered rock and the computer answered Scissors!");
        else if((userAnswer == 1) && (computerAnswer == 0))
            System.out.println("You win!!! you answered paper and the computer answered Rock!");
        else if((userAnswer == 2) && (computerAnswer == 1))
            System.out.println("You win!!! you answered Scissors and the computer answered paper!");
        // if you lose
        else if((userAnswer == 0) && (computerAnswer == 1))
            System.out.println("You Lose!!! you answered rock and the computer answered Paper!");
        else if((userAnswer == 1) && (computerAnswer == 2))
            System.out.println("You Lose!!! you answered paper and the computer answered Sissors!");
        else if((userAnswer == 2) && (computerAnswer == 0))
            System.out.println("You Lose!!! you answered Scissors and the computer answered rock!");
    }
    
}
