package chapterThree;
import java.util.Scanner;

/**
 *
 * @author kalfo
 */
public class AlgerbraQuadraticEquations1 {
    
    public static void main(String[] args){
        
        // initalize Scanner input
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter a value for a
        System.out.println("Lets compute the roots of a quadratic equation!!\n" +
                "Please enter an integer for a: ");
        
        // Intialize a as an double and store user input.
        double a = input.nextDouble();
        
        // Prompt user to enter a value for b.
        System.out.println("Please enter an integer for b: ");
        
        // Intialize b as an double and store user input.
        double b = input.nextDouble();
        
        // Prompt user to enter a value for c.
        System.out.println("Please enter an integer for c: ");
        
        // Intialize b as an double and store user input.
        double c = input.nextDouble();
        
        // initalize discriminant
        double discriminant = ((Math.pow(b,2)) - 4*a*c);
        
        // set up IF statment for cating if the discriminant is positive, zero, or negative
        if(discriminant > 0){
            // initalizing root 1 and root 2 variables
            double r1 = 0;
            double r2 = 0;
            
            // write equations 1 for root 1 and store in root 1 = r1
            r1 = (( (-b)+(Math.pow(discriminant,0.5)) )/2*a);
            
            // write equations 2 for root 2 and store in root 2 = r2
            r2 = (( (-b)-(Math.pow(discriminant,0.5)) )/2*a);
            
            //display root 1 and root 2
            System.out.println("Root1: " + r1);
            System.out.println("Root2: " + r2);
        }else if(discriminant == 0){
            // initalize the sigle root
            double r1 = 0;
            
            // write equation to store root 1
            r1 = (( (-b)+(Math.pow(discriminant,0.5)) )/2*a);
            
            //display root 1 
            System.out.println("Root1: " + r1);
        }else if(discriminant < 0){
            System.out.println("There are no Roots for this equation!");
        }
        
    }
    
}
