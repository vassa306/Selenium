import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Conditions {

    public void theGreatest() {
        Scanner sc = new Scanner(System.in);

        int first;
        System.out.print("Enter number 1: ");
        while (true)
            try {
                first = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Invalid number try again: ");
            }
       int second;
        do {
            System.out.print("Enter number 2: ");
            while (true)
                try {
                    second = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("Invalid number try again: ");
                }
        } while (second < 0|| first < 0);
        if (first>second){
            System.out.println("Greatest is " + first);

        }else if(second > first){
            System.out.println("Greatest is " + second);

        }else {
            System.out.println("The same numbers have been entered:" + "\n"  + "First number is " + first + "\n"  + "Second number is: " + second);
        }

    }

    public void isLeapYear() {
        LocalDate currentdate = LocalDate.now();
        int currentyear = currentdate.getYear();
        if (currentyear % 4 > 0) {
            System.out.println("This year is not leap year");
        } else {
            System.out.println("This year is leap year");
        }
    }


    public void noteForTheDay() {
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        String dayOfTheWeek = new SimpleDateFormat("EEEE").format(date);
        System.out.println(dayOfTheWeek);
        switch (dayOfTheWeek) {
            case "Monday":
                System.out.println("Planning for Tuesday.");
                break;
            case "Tuesday":
                System.out.println("Just work.");
                break;

            case "Wednesday":
                System.out.println("Wednesday is a little Friday.");
                break;
            case "Thursday":
                System.out.println("Changing plans from Monday");
                break;
            case "Friday":
            case "Sunday":
                System.out.println("One should never release on Friday.");
                break;
            case "Saturday":
                System.out.println("Fixing Friday's release.");
                break;
            default:
                System.out.println("not a valid name of days");
        }
    }
}


