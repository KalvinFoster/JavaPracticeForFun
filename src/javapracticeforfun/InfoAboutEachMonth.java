package javapracticeforfun;
// Import Scanner class for user input
import java.util.Scanner;
/**
 *
 * @author kalfo
 */
public class InfoAboutEachMonth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        //Ask user for input on which month 1-12
        System.out.println("Please Enter a number 1-12 for a month: ");
        //set month vcariable as user input integer
        int month = input.nextInt();
        // set switch case for 0-11, break after each
        switch(month){
            case 1: System.out.println("January is named after the Roman god Janus. As you can see in this print,\n" +
                    " he had two faces so he could see the future and the past. He was also the god of doors."); break;
            case 2: System.out.println("February comes from the Roman festival of purification called Februa,\n" +
                    " during which people were ritually washed."); break; 
            case 3: System.out.println("The name of March comes from Martius, the first month of the earliest Roman calendar.\n" +
                    " It was named after Mars, the Roman god of war, and an ancestor of the Roman people through his sons Romulus and Remus."); break;
            case 4: System.out.println("One tradition had it that Romulus named April after the goddess Aphrodite,\n"  +
                    "who was born from the sea's foam (aphros in Ancient Greek)."); break;
            case 5: System.out.println("MAY. Named for the Roman goddess Maia, who oversaw the growth of plants. Also from the Latin word maiores,\n" +
                    "“elders,” who were celebrated during this month. Maia was considered a nurturer and an earth goddess, which may explain the connection with this springtime month."); break;
            case 6: System.out.println("June. June is named after the Roman goddess Juno – the god of marriage and childbirth,\n" +
                    "and the wife of Jupiter, king of the gods."); break;
            case 7: System.out.println("This month used to be called Quintilis – the Roman word for “fifth” as it was the fifth month of the Roman year.\n" +
                    "It was later changed to July by the ruler of Roman world, Julius Caesar, after his family name (Julius)."); break;
            case 8: System.out.println("Sextilis was renamed August in honor of Roman Emperor Augustus in 8 BC."); break;
            case 9: System.out.println("god Vulcan\n" +
                    "In calendar mosaics from Hellín in Roman Spain and Trier in Gallia Belgica, September is represented by the god Vulcan,\n" +
                    " the tutelary deity of the month in the menologia rustica, depicted as an old man holding tongs."); break;
            case 10: System.out.println("OCTOBER. In the ancient Roman calendar, October was the name of the eighth month of the year. \n" +
                    "Its name comes from octo, the Latin word for “eight.” When the Romans converted to a 12-month calendar, they tried to rename this month after various Roman emperors, but the name October stuck!"); break;
            case 11: System.out.println("In the Imperial period, the deity who often represents November in Roman art is Isis.\n" +
                    " The festival of Isis, which began October 28, continued through November 3. The Isia is first recorded on the menologia rustica,\n" +
                    " which date to the reign of either Caligula (36–39 AD) or Claudius (41–54)."); break;
            case 12: System.out.println("December got its name from the Latin word decem (meaning ten)\n" 
                    + " because it was originally the tenth month of the year in the calendar of Romulus c. 750 BC which began in March."); break;
        }
    }
}
