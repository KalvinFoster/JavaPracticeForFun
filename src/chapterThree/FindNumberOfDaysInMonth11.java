
package chapterThree;
import java.util.Scanner;
/**
 *
 * @author kalfo
 */
public class FindNumberOfDaysInMonth11 {
    
    /*
    *leap year every 4 years. 2024 is leap year
    30 days = april, june, september, november
    31 days = january, march, may, july, august, october, december
    febuary has 28 days unless it is a leap year then it has 29
    */
    
    public static void main(String[] args){
        
        // initalize Scanner;
        Scanner input = new Scanner(System.in);
        
        //Prompt user to enter a month. 
        System.out.println("Please enter a month out of the year as an Integer: ");
        
        // store user month input
        int userMonth = input.nextInt();
        
        //Prompt user to enter a year 
        System.out.println("Please enter a year for the month I.E 2015: ");
        
        //Store user year value
        int userYear = input.nextInt();
        //Define month days for each month
        int january = 31;
        int febuary = 28;
        int march = 31;
        int april = 30;
        int may = 31;
        int june = 30;
        int july = 31;
        int august = 31;
        int september = 30;
        int october = 31;
        int november = 30;
        int december = 31;
        
        //Define LEAP Year
        double leapYear = userYear%4;
        
        //System.out.println("LEAP YEAR!!! " + leapYear);
        // Write if statment for Febuary = 2 - to have 28 days eavery year except LEAP year it has 29 days
        if(leapYear == 0.0){
            febuary = 29;
            System.out.println("The year you have choosen is also a LEAP YEAR!!! ");
        }
        
        // check user values to leap year and months
        
        // despay how many days are in that year month pair for user.
        switch (userMonth) {
            case 1: System.out.println("January " + userYear + " has " + january + " days "); break;
            case 2: System.out.println("Febuary " + userYear + " has " + febuary + " days "); break;
            case 3: System.out.println("March " + userYear + " has " + march + " days "); break;
            case 4: System.out.println("April " + userYear + " has " + april + " days "); break;
            case 5: System.out.println("May " + userYear + " has " + may + " days "); break;
            case 6: System.out.println("June " + userYear + " has " + june + " days "); break;
            case 7: System.out.println("July " + userYear + " has " + july + " days "); break;
            case 8: System.out.println("August " + userYear + " has " + august + " days "); break;
            case 9: System.out.println("September " + userYear + " has " + september + " days "); break;
            case 10: System.out.println("October " + userYear + " has " + october + " days "); break;
            case 11: System.out.println("November " + userYear + " has " + november + " days "); break;
            case 12: System.out.println("December " + userYear + " has " + december + " days "); break;
        }
        
        
    }
    
}
