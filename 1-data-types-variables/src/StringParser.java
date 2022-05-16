public class StringParser {
    String firstText = "Hello, I am a: ";
    String secondText = "parameter=robot";

    public void splitting(String firstText, String secondText) {
        String [] array = {};
        String robot = secondText.split("=")[1];
        System.out.println(firstText + robot);
    }

    public void replacement(String firstText,String secondText) {
        String [] array = {};
        String human = secondText.split("=")[1].replace("robot","human");
        System.out.println();
        System.out.println(firstText+human);


    }

    public void concatenation() {
        System.out.println(firstText+secondText);
    }
}
