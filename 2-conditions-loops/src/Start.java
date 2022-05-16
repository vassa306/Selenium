public class Start {

    public static void main(String... args) {
        Conditions conditions = new Conditions();
        System.out.println("The Greatest-----------------------------------------1");
        conditions.theGreatest();
        System.out.println();
        System.out.println("Is Lear Year?----------------------------------------");
        conditions.isLeapYear();
        System.out.println();
        System.out.println("Note for the Day-------------------------------------");
        conditions.noteForTheDay();
        System.out.println();

        System.out.println("-Condition Loops-------------------------");
        Loops.countSumOf10();
        System.out.println();

        System.out.println("Printing Pyramids----------------------------------------------------");
        Loops.pyramids();

    }
}
