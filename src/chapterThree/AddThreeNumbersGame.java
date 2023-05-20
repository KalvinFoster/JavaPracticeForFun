
package chapterThree;

import java.util.Scanner;

/**
 *
 * @author kalfo
 */
public class AddThreeNumbersGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Initializing my goal variable outside of my loop so i can record 
         * all correct answers
         */
        int goal = 0;
        
        /**
         * Setting up a for loop that iterates 10 times for 10 new 
         * question
         */
        for(int i = 0; i < 10; i++){
            
            /**
             * Set variables for both of the numbers that would be added together,
             * make them random and different.
             */
            
            int number1 = (((int)(System.currentTimeMillis() % 11%10))) ;
            int number2 = (((int)(System.currentTimeMillis() % 35%10)));
            int number3 = (((int)(System.currentTimeMillis() % 88%10)));
            
            
            
            
            /**
             * Create a scanner to take in user input.
             */
            Scanner input = new Scanner(System.in);

            // print out what is number1 plus number2?
            System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + "?");

            /**
              * Store user input in a variable called answer.
             */
            int answer = input.nextInt(); 
            

            // number1 plus number2 = user answer
            System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " ");
            
            /**
             * check if user answered correctly
             */
            System.out.println(number1 + number2 + number3 == answer);

                //if answered correctly increment goal by 1
                if(number1 + number2 + number3 == answer){
                    goal++;
                }
        }
        /**
         * Use a multi way if else statement to assign a grade.
         */
        if(goal >= 9)
            System.out.println("YOU GET AN A!!!");
        else if(goal >= 8)
            System.out.println("YOU GET AN B!!!");
        else if(goal >= 7)
            System.out.println("YOU GET AN C!!!");
        else if(goal >= 6)
            System.out.println("YOU GET AN D!!!");
        else
            System.out.println("YOU GET AN F ;-;");
        /**
         * Tell the user how many questions they got right.
         */
        System.out.println("You got " + goal + " out of 10 right!");
        
    }
    
}
