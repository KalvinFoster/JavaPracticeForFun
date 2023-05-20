package chapterThree;
import java.util.Scanner;
/**
 *
 * @author kalfo
 * Write a program that promptsw the user to enter a weight of the package and displays the shipping cost. 
 * if the weight is negative or zero, display message "Invalid input". If weight is greater than 20lbs
 * display message "The package cannot be shipped"
 */
public class CostOfShipping {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is the weight of your object in pounds? ");
        int weight = input.nextInt();
        
        if(weight <= 0 )
            System.out.println("Invalid input");
        if(weight > 0 && weight <= 1)
            System.out.println("Your items cost for shipping is $3.50");
        if(weight > 1 && weight <= 3)
            System.out.println("Your items cost for shipping is $5.50");
        if(weight > 3 && weight <= 10)
            System.out.println("Your items cost for shipping is $8.50");
        if(weight > 10 && weight <= 20)
            System.out.println("Your items cost for shipping is $10.50");
        if(weight > 20)
            System.out.println("The package cannot be shipped.");
    }
    
}
