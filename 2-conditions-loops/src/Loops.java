public class Loops {

    public static void countSumOf10() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;

        }
        System.out.println(sum);
    }

    public static void pyramids() {
        int i;
        int space = 0;
        int rows = 5;
        int star = 0;


        for (i = 1; i <= rows; i++) {
            for (space = 1; space <= rows - i; space++) {
                //4,3,2,1

                System.out.print(" " + "  ");
            }
            //while 9==9 print stars
            while (star != (2 * i - 1)) {
                // print * and space
                System.out.print("*" + "  ");
                star++;
            }
            star = 0;
             System.out.print("\n");
        }
    }


}


