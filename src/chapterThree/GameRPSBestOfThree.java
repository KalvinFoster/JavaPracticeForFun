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
 * ALTER GAME TO BEST OUT OF 3
 * 
 * display a message indicating if the user or the computer wins, loses, or draws
 * 
 */
public class GameRPSBestOfThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        
        int player1 = 0;
        int computer = 0;
        int draws = 0;
        
        while((player1 < 3) && (computer < 3)){
            // Generate a random number between 0,1,2 & Store computers number
            int computerAnswer = (int)(Math.random() * 3 );
            // Test: System.out.println(computerAnswer);


            // prompt user for input - rock paper or scissors 0,1,2
            System.out.println("Please enter 0 for rock, 1 for paper, or 2 for Sissors: ");
            // Store user input
            int userAnswer = input.nextInt();
            // Ditermain if user wins loses or draws - display results
            if(computerAnswer == userAnswer){
                draws++;
                System.out.println("Its a DRAW!!! the computer answered " + computerAnswer + " And you answered " + userAnswer);
            }
            else if((userAnswer == 0) && (computerAnswer == 2)){
                player1++;
                System.out.println("You win!!! you answered rock and the computer answered Scissors!");
            }
            else if((userAnswer == 1) && (computerAnswer == 0)){
                player1++;
                System.out.println("You win!!! you answered paper and the computer answered Rock!");
            }
            else if((userAnswer == 2) && (computerAnswer == 1)){
                player1++;
                System.out.println("You win!!! you answered Scissors and the computer answered paper!");
            }
            // if you lose
            else if((userAnswer == 0) && (computerAnswer == 1)){
                computer++;
                System.out.println("You Lose!!! you answered rock and the computer answered Paper!");
            }
            else if((userAnswer == 1) && (computerAnswer == 2)){
                computer++;
                System.out.println("You Lose!!! you answered paper and the computer answered Sissors!");
            }
            else if((userAnswer == 2) && (computerAnswer == 0)){
                computer++;
                System.out.println("You Lose!!! you answered Scissors and the computer answered rock!");
            }
            
        }
        if(player1 > computer)
        System.out.println("The WINNER is The Player!!! with " + player1 + " wins while the computer is at " + computer + " wins. You had this many draws this game! " + draws);
        else 
            System.out.println("The WINNER is The Computer!!! with " + computer + " wins while the player is at " + player1 + " wins. You had this many draws this game! " + draws);
    }
    
}


    

