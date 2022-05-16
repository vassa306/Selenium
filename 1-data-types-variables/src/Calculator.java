public class Calculator {
    int first = 15;
    int second = 7;

    public static int summation(int first, int second) {
        int result = 0;
        result = first+second;
        System.out.println("result of summation " + result);
        return result;
    }


    public static int division(int first, int second) {
        int result = 0;
        result=first/second;
        System.out.println("Result of division " + result);
        return result;

    }

    public static int multiplication(int first, int second) {
        int result = 0;
        result = first*second;
        System.out.println("Result of multiplication is " + result);
        return result;
    }


    public static int remainder(int first, int second) {
        int result = 0;
        result = first % second;
        System.out.println("remains " + result);
        return result;
    }




    public static void parseMinutesToDaysAndYears(int minutes) {
        int day = minutes/1440;
        int year = (int) (minutes / 525948.766);
        System.out.println("Count of days is: " + day );
        System.out.println("Count of years is " + year);
    }
}

