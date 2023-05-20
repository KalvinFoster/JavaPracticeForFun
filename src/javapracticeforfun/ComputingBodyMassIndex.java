package javapracticeforfun;
import java.util.Scanner;
/**
 *
 * @author kalfo
 */
public class ComputingBodyMassIndex {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        /**
         * Prompt the user for their weight in pounds
         */
        System.out.println("What is your weight in Pounds: ");
        double weight = input.nextDouble();
        
        /**
         * Prompt the user for their height in inches
         */
        System.out.println("What is your Hight in Inches: ");
        double height = input.nextDouble();
        
        /**
         * Set Constants for Kilograms per pound, and Meters per inch
         */
        final double kilogramsPerPound = 0.45359237; // Constant
        final double metersPerInch = 0.0254; // Constant
        
        /**
         * Compute BMI
         */
        double weightInKilograms = weight * kilogramsPerPound;
        double heightInMeters = height * metersPerInch;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        
       
        /**
         * Display result
         */
        
        System.out.println("BMI is " + bmi);
        if(bmi < 18.5)
            System.out.println("UnderWeight");
        else if(bmi < 25)
            System.out.println("Normal");
        else if(bmi < 30   )
            System.out.println("OverWeight");
        else
            System.out.println("Obese");
        
    }
    
}
