package CarPackage;

import java.util.ArrayList;
import java.util.List;

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

        System.out.println("There are " + storeList.size() + " cars at warehouse");
        if (storeList.isEmpty()) {
            System.out.println(EMPTYWAREHOUSE);
        } else {
            for (int j = 0; j < storeList.size(); j++) {
                num++;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(num).append(". ").append(storeList.get(j).toString().toUpperCase());
                System.out.println(stringBuilder.toString());

            }
        }
        System.out.println();
        System.out.println("Entering Tuning Company with stored cars");
        TuningCompany sport = new SportDecorator(new TuningImpl());
        TuningCompany offroad = new OffroadDecorator(new TuningImpl());
        System.out.println("possible packages: "  + "\n" + " *" + sport.decorate() + "\n"+ " *" +offroad.decorate());
        System.out.println();

        String sp = sport.toString().substring(0, 5).toUpperCase();
        String off = offroad.toString().substring(0, 7).toUpperCase();
        System.out.println(storeList.get(0)+sp);
        System.out.println(storeList.get(2)+ off);
        System.out.println(storeList.get(3)+ sp);
        System.out.println(storeList.get(4)+ sp);


    }
}










