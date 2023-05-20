package javapracticeforfun;
// Import Scanner
import java.util.Scanner;
/**
 *
 * @author kalfo
 */
public class DayOfTheWeekSwitch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Prompt user to input a number 0 - 6 for day of week.
        System.out.println("Enter a number 0 - 6 to see what day of the Week it will be: ");
        // Store user variable as an Integer
        int dayOfWeek = input.nextInt();
        // using a switch statment rather than a nested if to avoid clutter.
        switch(dayOfWeek){
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
        }
        
    }
    
    
}
