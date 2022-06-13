package CarPackage;

import java.util.ArrayList;
import java.util.List;

import static CarPackage.Car.Brand.FERRARI;
import static CarPackage.WarningMassage.WarningMessages.EMPTYLINE;
import static CarPackage.WarningMassage.WarningMessages.EMPTYWAREHOUSE;

public class Start {


    public static void main(String... args) {

        List<CarI> storeList = new ArrayList<>();
        List<CarI> carList = new ArrayList<>();
        int num = 0;
        TuningCompany tuningCompany = null;


        System.out.println("-------------------------------Factory----------------------------------------------------------------------------");
        carList = Factory.getInstance().assembleCar();
        //iterate through list and get assemble cars
        if (carList.isEmpty()) {
            System.out.println(EMPTYLINE);
        } else {
            System.out.println("Currently assembled cars: ");

            for (int i = 0; i < carList.size(); i++) {
                System.out.println(carList.get(i).toString().toUpperCase());
            }
        }

        System.out.println("-------------------------------Warehouse--------------------------------------------------------------------------");
        storeList = Warehouse.getInstance().storeCars();
        List<String> sportList = new ArrayList<>();
        TuningCompany sport = new SportDecorator(new TuningImpl());
        TuningCompany offroad = new OffroadDecorator(new TuningImpl());
        TuningCompany rallye = new RallyeDecorator(new TuningImpl());

        System.out.println("There are " + storeList.size() + " cars at warehouse");
        if (storeList.isEmpty()) {
            System.out.println(EMPTYWAREHOUSE);
        } else {
            for (int j = 0; j < storeList.size(); j++) {
                num++;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(num).append(". ").append(storeList.get(j).toString().toUpperCase());
                System.out.println(stringBuilder.toString());
                if (storeList.get(j).equals(FERRARI)){

                }

            }
        }
        System.out.println();
        System.out.println("Entering Tuning Company with stored cars");

        System.out.println("possible packages: "  + "\n" + " * " + sport.decorate() + "\n"+ " * " +offroad.decorate());
        System.out.println();
        sportList.add(storeList.get(0)+sport.toString());
        System.out.println(sportList.get(0));



    }
    
}











