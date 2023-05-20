package chapterThree;
import java.util.Scanner;
/**
 *
 * @author kalfo
 */
public class BusinessCheckISBN9 {
    public static void main(String[] args){
    
    // initialize scanner input
    Scanner input = new Scanner(System.in);
    // Prompt user to enter 9 digit ISBN number as integer
    System.out.println("Please enter the first 9 digits of an ISBN as integer: ");
    
    // store isbn number as integer
    int isbn = input.nextInt();
    // store every digite including leading 0s
    // without using an array and input has to be integer
    int d1 = ((isbn%1000000000)/100000000);
    int d2 = ((isbn%100000000)/10000000);
    int d3 = ((isbn%10000000)/1000000);
    int d4 = ((isbn%1000000)/100000);
    int d5 = ((isbn%100000)/10000);
    int d6 = ((isbn%10000)/1000);
    int d7 = ((isbn%1000)/100);
    int d8 = ((isbn%100)/10);
    int d9 = ((isbn%10)/1);
    
    // create the 10th digit from the first 9 givin the formula
    int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)%11;
    
    // set up if statment if d10 is == 10 then d10 displays as X else display int d10
    if (d10 == 10){
        System.out.println( d1 +""+ d2 +""+ d3 +""+ d4 +""+ d5 +""+ d6 +""+ d7 +""+ d8 +""+ d9 +"X");
    }else{
        System.out.println( d1 +""+ d2 +""+ d3 +""+ d4 +""+ d5 +""+ d6 +""+ d7 +""+ d8 +""+ d9 +""+ d10 );
    }
    
    }
    
}
