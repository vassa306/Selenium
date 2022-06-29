package CarPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Start {


    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();


        List<Car> storeList;
        int counter = 0;
        int num = 0;
        int numsport = 0;
        int countferrari = 0;
        int numoffroad = 0;

        StringBuilder stringBuilder;

        storeList = warehouse.getInstance().storeCars();
        stringBuilder = new StringBuilder();

        System.out.println();
        for (int a = 0; a < storeList.size(); a++) {


            counter++;
            stringBuilder.append(counter).append("Car is:").append(storeList.get(a)).toString();
        }

        List<String> sportlist = new ArrayList<>();
        List<String> FerrariList = new ArrayList<>();
        List<String> OffroadList = new ArrayList<>();

        SportDecorator sport = new SportDecorator();
        RallyeDecorator rallye = new RallyeDecorator();
        System.out.println("Tuning Company allows to apply these packages: ");
        System.out.println("-" + sport.applySportPackage() + "\n" + "-" + rallye.applyOffroadPackage());
        System.out.println();
        if (storeList.isEmpty()) {
            System.out.println(WarningMessages.EMPTYWAREHOUSE);
        } else {
            for (int j = 0; j < storeList.size(); j++) {
                num++;

                stringBuilder = new StringBuilder();
                stringBuilder.append(num).append(". ").append(storeList.get(j).toString().toUpperCase());
                System.out.println(stringBuilder.toString());

                if (storeList.get(j).brand == Car.Brand.BMW || storeList.get(j).brand == Car.Brand.PORSCHE || storeList.get(j).brand == Car.Brand.FERRARI || storeList.get(j).brand == Car.Brand.AUDI || storeList.get(j).brand == Car.Brand.BUGATTI) {
                    sportlist.add(storeList.get(j) + sport.toString());
                    Collections.sort(sportlist);
                }
                if (storeList.get(j).brand == Car.Brand.FERRARI) {
                    FerrariList.add(storeList.get(j) + sport.toString());

                } else if (storeList.get(j).types == Car.Types.G || storeList.get(j).types == Car.Types.G63) {
                    OffroadList.add(storeList.get(j) + rallye.toString());
                }
            }
        }
        System.out.println("Print all Sport Cars:");
        if (sportlist.isEmpty()) {
            System.out.println(WarningMessages.SPORTEMPTY);
        }
        for (int i = 0; i < sportlist.size(); i++) {
            numsport++;
            stringBuilder = new StringBuilder();
            stringBuilder.append(numsport).append(".").append(sportlist.get(i)).toString().toUpperCase();
            System.out.println(stringBuilder.toString());

        }
        System.out.println();
        System.out.println("---------------------*Print all Ferrari models*-------------------------------");
        if (FerrariList.isEmpty()) {
            System.out.println(WarningMessages.NOFERRARIINWAREHOUSE);
        }
        for (int k = 0; k < FerrariList.size(); k++) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(countferrari).append(".").append(FerrariList.get(k).toString().toUpperCase());
            System.out.println(stringBuilder.toString());
        }
        System.out.println();
        if (FerrariList.isEmpty()) {
            System.out.println(WarningMessages.NOFERRARIINWAREHOUSE);
        } else {
            FerrariList.remove(1);
            System.out.println("Car has been deleted");
            for (int i = 0; i < FerrariList.size(); i++) {
                countferrari++;
                stringBuilder = new StringBuilder();
                System.out.println("State After deleted model");
                stringBuilder.append(countferrari).append(".").append(FerrariList.get(i)).toString();
                System.out.println(stringBuilder.toString());
            }
        }

        System.out.println("Print all Ferrari Cars: Sorted");

        System.out.println();
        for (int i = 0; i < FerrariList.size(); i++) {
            countferrari++;
            Collections.sort(FerrariList);
            stringBuilder = new StringBuilder();
            System.out.println("List of Ferrari after deleted record");
            stringBuilder.append(countferrari).append(".").append(FerrariList.get(i)).toString().toUpperCase();
            System.out.println(stringBuilder.toString());
        }
        System.out.println();
        System.out.println("List of Offroad cars");
        if (OffroadList.isEmpty()) {
            System.out.println(WarningMessages.OFFROADEMPTY);
        } else {
            for (int l = 0; l < OffroadList.size(); l++) {

                numoffroad++;
                Collections.sort(OffroadList);
                stringBuilder = new StringBuilder();
                stringBuilder.append(numoffroad).append(".").append(OffroadList.get(l)).toString();
                System.out.println(stringBuilder.toString());
            }
        }
    }
}










