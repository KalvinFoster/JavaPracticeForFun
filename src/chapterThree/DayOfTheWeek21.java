package chapterThree;
import java.util.Scanner;
/**
 *
 * @author kalfo
 * Use Zeller's congruence algorithm to determane the day of the week.
 */
public class DayOfTheWeek21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter year: ");
        int year = input.nextInt();
        
        System.out.print("What is the month: ");
        int m = input.nextInt();
        
        System.out.println("Enter day of the month:  1-31: ");
        int q = input.nextInt();
        
        int j = year/100;
        
        int k = year % 100;
        
        int h = 0;
        
        if(m == 1){
            m = m + 12;
            year = year - 1;
            h = ( (q + ((26 * (m +1))/10) + k + (k/4) + (j/4) + 5 * j) % 7 );
            h = h-1;
        } 
        else if (m == 2){
            m = m + 12;
            year = year - 1;
            h = ( (q + ((26 * (m +1))/10) + k + (k/4) + (j/4) + 5 * j) % 7 );
            h = h-1;
        }
        
        
        switch (h) {
            case 0: System.out.println("Saturday"); break;
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
        }
    }
    
}
