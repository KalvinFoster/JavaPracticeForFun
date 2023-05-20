package chapterThree;
import java.util.Scanner;
/**
 *
 * @author kalfo
 */
public class DayOfWeek5 {
    public static void main(String args []){
        // Initializing Scanner
        Scanner input = new Scanner(System.in);
        // prompt user for input on start day
        System.out.println("Please enter a number for a day of \n"
                + " the week starting with 0 - 6 // Sunday to Saturday:");
        
        //initialize the current day as an int
        int currentDay = input.nextInt();
        
        // prompt the user for a future day as an integer
        System.out.println("Please enter the number of days after todays day of week \n"
                + " for a future day of the week: ");
        // initialize future day as an int
        int futureDay = input.nextInt();
        // calculate the new date and store inside of new date variable
        int newDate = ((futureDay%7) + currentDay);
        // initialize string start day and string end day
        String startDay = "ok";
        String endDay = "okok";
        
        // create if else statments to find and asign the right day and value to start day 
        // off of current day value.
        if(currentDay == 0){
            startDay = "Sunday";
        }else if(currentDay == 1){
            startDay = "Monday";
        }else if(currentDay == 2){
            startDay = "Tuesday";
        }else if(currentDay == 3){
            startDay = "Wednesday";
        }else if(currentDay == 4){
            startDay = "Thursday";
        }else if(currentDay == 5){
            startDay = "Friday";
        }else if(currentDay == 6){
            startDay = "Saturday";
        }
        
        // instead of an if else statment structure i created a switch statment
        // using the new date variable to dicide which case then assigning a new 
        // value to the string variable end day.
        switch (newDate) {
            case 0:
                {
                    endDay = "Sunday";
                    break;
                }
            case 1:
                {
                    endDay = "Monday";
                    break;
                }
            case 2:
                {
                    endDay = "Tuesday";
                    break;
                }
            case 3:
                {
                    endDay = "Wednesday";
                    break;
                }
            case 4:
                {
                    endDay = "Thursday";
                    break;
                }
            case 5:
                {
                    endDay = "Friday";
                    break;
                }
            case 6:
                {
                    endDay = "Saturday";
                    break;
                }
            default:
                break;
        }
        
        
        // pop out result to user on terminal.
        System.out.println("Today is " + startDay + " and the future day is " + endDay );
        
       
    }
    
}
