package CarPackage;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private volatile static Warehouse uniqueWarehouseInstance;
    List<CarI> storeList = new ArrayList<>();


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




    public List<CarI> storeCars() {
        storeList = Factory.getInstance().assembleCar();
        return storeList;
    }
}


