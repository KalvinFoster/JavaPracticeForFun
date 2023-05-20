package chapterThree;
import java.util.Scanner;
/**
 *
 * @author kalfo
 */
public class ComputeTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the length of the First Edge: ");
        int t1 = input.nextInt();
        
        System.out.println("Please enter the length of the second side of the triangle as an integer: ");
        int t2 = input.nextInt();
        
        System.out.println("Please enter the the length of the last side of the triangle: ");
        int t3 = input.nextInt();
        
        if((t1 + t2) > t3){
            System.out.println("This is a true triangle with perimeter " + (t1 + t2 + t3));
        }
        else if((t1 + t3) > t2){
            System.out.println("This is a true triangle with perimeter " + (t1 + t2 + t3));
        }
        else if((t2 + t3) > t1){
            System.out.println("This is a true triangle with perimeter " + (t1 + t2 + t3));
        }
        else{
            System.out.println("Input is invalid " + (t1 + t2 + t3));
        }
         
    }
    
}
