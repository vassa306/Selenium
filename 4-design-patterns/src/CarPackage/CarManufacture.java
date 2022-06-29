package CarPackage;

import java.util.ArrayList;
import java.util.List;


public class CarManufacture extends Carlist {
    public Car.Types types;
    public Car.Color color;
    public Car.Brand brand;
    private volatile static CarManufacture uniqueFactoryInstance;

    List<Car> manufactureList = getCarList();

    CarManufacture() {
        this.types = types;
        this.color = color;
        this.brand = brand;
    }

    public static CarManufacture getInstance() {
        if (uniqueFactoryInstance == null) {
            synchronized ((CarManufacture.class)) {
                if (uniqueFactoryInstance == null) {
                    uniqueFactoryInstance = new CarManufacture();
                }
            }

        }
        return uniqueFactoryInstance;
    }

    public List<Car> assembleCarlist() {
        return manufactureList;
    }

}



