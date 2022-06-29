package CarPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Warehouse {
    private volatile static Warehouse uniqueWarehouseInstance;
    List<Car> storeList = new ArrayList<>();

    protected Warehouse() {
    }

    public static Warehouse getInstance() {
        if (uniqueWarehouseInstance == null) {
            synchronized ((Warehouse.class)) {
                uniqueWarehouseInstance = new Warehouse();
            }
            if (uniqueWarehouseInstance == null) {
                uniqueWarehouseInstance = new Warehouse();
            }
        }
        return uniqueWarehouseInstance;
    }

    public List<Car> storeCars() {
        storeList = CarManufacture.getInstance().assembleCarlist();
        if (storeList.isEmpty()) {
            System.out.println(WarningMessages.EMPTYLINE);
        }
        for (int i = 0; i < storeList.size(); i++) {
            storeList.sort(Comparator.comparing(Car::toString));
        }
        return storeList;
    }

    public static void main(String[] args) {
        Warehouse war = new Warehouse();
        war.storeCars();
    }
}
