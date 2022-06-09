package CarPackage;

import java.util.ArrayList;
import java.util.List;

import static CarPackage.WarningMassage.WarningMessages.EMPTYLINE;
import static CarPackage.WarningMassage.WarningMessages.EMPTYWAREHOUSE;

public class Start {


    public static void main(String... args) {

    List<Car> storeList = new ArrayList<>();
    List<Car> carList = new ArrayList<>();
    int num = 0;
    int samebrand = 0;



        System.out.println("-------------------------------Factory------------------------------------------------------------------------------");
    carList= Factory.getInstance().assembleCar();
    //iterate through list and get assemble cars
        if (carList.isEmpty()){
        System.out.println(EMPTYLINE);
    }else{
        System.out.println("Currently assembled cars: ");

        for (int i = 0; i<carList.size(); i++){
            System.out.println(carList.get(i).getBrand()+ "/ " + carList.get(i).getTypes() + " Color: " +  carList.get(i).getColor());
            if (carList.get(i).getBrand().equals("Ferrari")){
                samebrand ++;
            }
        }
    }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println();


        System.out.println("-------------------------------Warehouse---------------------------------------------------------------------------------");
    storeList = Warehouse.getInstance().storeCars();

        System.out.println("There are " + storeList.size() + " cars at warehouse");
        if (storeList.isEmpty()) {
        System.out.println(EMPTYWAREHOUSE);
    }else{
        for (int j = 0; j<storeList.size(); j++){
            num ++;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(num).append(". ").append(storeList.get(j).getBrand()).append("/").append(storeList.get(j).getTypes()).append("/").append("Color :").append(storeList.get(j).getColor());
            System.out.println(stringBuilder.toString());

        }
    }

}


}
