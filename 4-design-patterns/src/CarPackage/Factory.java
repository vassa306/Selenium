package CarPackage;

import java.util.ArrayList;
import java.util.List;

import static CarPackage.CarList.getCarList;

    public class Factory {
        public Car.Types types;
        public Car.Color color;
        public Car.Brand brand;
        private volatile static Factory uniqueFactoryInstance;

        private Factory() {
            this.brand = CarList.cars.brand;
            this.types = CarList.cars.types;
            this.color = CarList.cars.color;
        }

        public static Factory getInstance() {
            if (uniqueFactoryInstance == null) {
                synchronized ((Factory.class)) {
                    if (uniqueFactoryInstance == null) {
                        uniqueFactoryInstance = new Factory();
                    }
                }

            }
            return uniqueFactoryInstance;
        }


        public List<Car> assembleCar() {
            List<Car> carList = getCarList(new ArrayList<>());
            return carList;

        }
    }


