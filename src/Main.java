import java.time.LocalDate;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

/*
 * Student Name: Samarth Sharma
 * Student Number: 041059081
 * Section: 304
 * Lab proffessor: Hesham Saadhvi
 * Due date: 23/09/2022
 * Description: Generating Javadoc Lab 1
 * @author: Samarth
 * @see: samsharma
 * @version: java 1.8
 */

public class Main{

    /**
     *this method calculates the results of remaining weeks if the student number is odd
     * and if the student number is even it gives the remaining month in this year
     * @param args a ray of string that fetch data from the terminal
     * */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter your name.");
        String name = keyboard.nextLine();

        System.out.println("enter your student number.");
        int studentNumber = keyboard.nextInt();

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2022, 12, 30);

        // If number is divisible by 2 then it's an even number
        //else it is an odd number
        if(studentNumber%2==0) {

            long Month = ChronoUnit.MONTHS.between(date1, date2);
            System.out.println();
            System.out.println("Months remaining in the year: "+Month);
            System.out.println();

        }else {

            long diffInDays = ChronoUnit.DAYS.between(date1, date2);
            long weeks = (diffInDays / 7) -1 ;
            System.out.println("Weeks between "+date1+" and "+date2+": "+weeks);


        }

        System.out.println("Two reasons why are you taking the course.");
        System.out.println("First reason");
        String reasonFirst = keyboard.next();

        System.out.println("second reason");
        String reasonSecond = keyboard.next();

        keyboard.close();

    }
}


	


