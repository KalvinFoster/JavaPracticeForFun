package chapterThree;
import java.util.Scanner;
/**
 * Write a program that prompts the user to enter a 3 digit integer
 * and determines whether it is a palindrome integer.
 * @author kalfo
 */


public class PalindromeInteger12 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        // prompt user to enter a 3 diget integer
        System.out.println("Please enter a 3 diget number: ");
        
        // store user input
        int palindrome = input.nextInt();
        
        int firstNum = ((palindrome%1000)/(100));
        int secondNum = ((palindrome%10)/(1));
        
        /* testing 
        System.out.println(firstNum);
        System.out.println(secondNum);*/
        
        
        // check if palindrome and tell user if it was or not
        if(firstNum == secondNum) {
            System.out.println(palindrome + " is a Palindrome!!!");
        }else{
            System.out.println(palindrome + " is not a Palindrome :<");
        }
    }
}
