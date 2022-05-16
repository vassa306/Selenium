public class Start {

    public static void main(String... args) {

        System.out.println("----------------------------------Animal----------------------------------------------------------------");
        Animal animal = new Animal("hoo ", "white", "Eagle");
        System.out.println("Animal name :" + animal.name.toUpperCase()+ "\n" + "Color :"+ animal.color + "\n" + "Sound: " + animal.sound);
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("------------------------Calculator------------------------------------------------------------------");
        int first = 15;
        int second = 7;
        Calculator.summation(first,second);
        Calculator.division(first,second);
        Calculator.multiplication(first,second);
        Calculator.remainder(first,second);
        Calculator.parseMinutesToDaysAndYears(70000);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("--------------------------String Parser---------------------------------------------------------------");

        //create new instance of StringParser Class
        StringParser stringParser = new StringParser();
        String firstText = "Hello, I am a: ";
        String secondText = "parameter=robot";

        stringParser.splitting(firstText,secondText);
        stringParser.replacement(firstText,secondText);
        stringParser.concatenation();
    }



}
