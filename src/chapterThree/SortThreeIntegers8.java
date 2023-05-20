package chapterThree;
import java.util.Scanner;
/**
 *
 * @author kalfo
 */
public class SortThreeIntegers8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter an integer:");
        int a = input.nextInt();
        
        System.out.println("please enter another integer: ");
        int b = input.nextInt();
        
        System.out.println("Please enter one last integer: ");
        int c = input.nextInt();
        
        System.out.println("The three integers sorted in incresing order are.");
        
        if((a < b)&&(a < c)&&(b < c)){
            System.out.println("In increasing order your numbers are: " + a + " " + b + " " + c);
        }else
        if((a < b)&&(a < c)&&(c < b)){
            System.out.println("In increasing order your numbers are: " + a + " " + c + " " + b);
        }else
        if((b < a)&&(b < c)&&(a < c)){
            System.out.println("In increasing order your numbers are: " + b + " " + a + " " + c);
        }else
        if((b < a)&&(b < c)&&(c < a)){
            System.out.println("In increasing order your numbers are: " + b + " " + c + " " + a);
        }else
        if((c < b)&&(c < a)&&(b < a)){
            System.out.println("In increasing order your numbers are: " + c + " " + b + " " + a);
        }else
        if((c < b)&&(c < a)&&(a < b)){
            System.out.println("In increasing order your numbers are: " + c + " " + a + " " + b);
        }
    }
    
}
