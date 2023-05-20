package javapracticeforfun;
import java.util.Scanner;
/**
 *
 * @author kalfo
 */
public class ComputeChange {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        // Prompt the user to enter the amount as a decimal number, such as 11.56.
        System.out.println("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        //Convert the amount (e.g., 11.56) into cents 1156.
        double amountChange = amount * 100;

        /**
         * Divide the cents by 100 to find the number of dollars.
         * Obtain the remaining cents using cents remainder 100.
         */
        int dollars = (int) (amountChange/100);
System.out.println(dollars);
        /**
         * Divide the remaining cents by 25 to find the number of quarters.
         * Obtain the remaining cents using remainder 25.
         */
        int quarters = (int) (amountChange%100)/25;
System.out.println(quarters);


        // do the same with dimes
        int dimes = (int) ((amountChange%100)%25)/10;
System.out.println(dimes);


        // do the same with nickles
         int nickles = (int) (((amountChange%100)%25)%10)/5;
System.out.println(nickles);


        // remaining cents are pennies
         int pennies = (int) ((((amountChange%100)%25)%10)%5)/1;
System.out.println(pennies);
        // display result
    
        
        
        System.out.println("Your amount in monetary units from " + amount + " consists of:\n"
                + dollars + " Dollars \n"
                + quarters + " Quarters \n"
                + dimes + " Dimes \n"
                + nickles + " Nickles \n"
                + pennies + " Pennies");
    }
}
