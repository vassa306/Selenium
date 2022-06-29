package CarPackage;

import java.util.ArrayList;
import java.util.List;

public class Carlist {

    List<Car> carList = new ArrayList<>();

    public List<Car> getCarList() {
        Car AudiS3 = new CarBuilder().setBrand(Car.Brand.AUDI).setTypes(Car.Types.S32004).setSpz("0000000").setColor(Car.Color.red).createCar();
        Car BMWE36 = new CarBuilder().setBrand(Car.Brand.BMW).setTypes(Car.Types.E36).setSpz("9999998").setColor(Car.Color.blue).createCar();
        Car Porsche911 = new CarBuilder().setBrand(Car.Brand.PORSCHE).setTypes(Car.Types.P911).setSpz("AAAA111").setColor(Car.Color.blue).createCar();
        Car MONDEO = new CarBuilder().setBrand(Car.Brand.FORD).setTypes(Car.Types.MONDEO).setSpz("3333000").setColor(Car.Color.red).createCar();
        Car MUSTANG = new CarBuilder().setBrand(Car.Brand.FORD).setTypes(Car.Types.MUSTANG).setSpz("BOSS192").setColor(Car.Color.green).createCar();
        Car F40 = new CarBuilder().setBrand(Car.Brand.FERRARI).setTypes(Car.Types.F40).setSpz("0909090").setColor(Car.Color.blue).createCar();
        Car F4ORED = new CarBuilder().setBrand(Car.Brand.FERRARI).setTypes(Car.Types.F40).setSpz("1111111").setColor(Car.Color.red).createCar();
        Car MERG = new CarBuilder().setBrand(Car.Brand.MERCEDES).setTypes(Car.Types.G).setSpz("0000222").setColor(Car.Color.yellow).createCar();
        Car MerG63 = new CarBuilder().setBrand(Car.Brand.MERCEDES).setTypes(Car.Types.G63).setSpz("11122221").setColor(Car.Color.blackmatte).createCar();
        Car VEYRON = new CarBuilder().setBrand(Car.Brand.BUGATTI).setTypes(Car.Types.VEYRON).setSpz("0909008").setColor(Car.Color.white).createCar();
        Car GT = new CarBuilder().setBrand(Car.Brand.FORD).setTypes(Car.Types.FIESTA).setSpz("0989890").setColor(Car.Color.black).createCar();

        carList.add(AudiS3);
        carList.add(BMWE36);
        carList.add(Porsche911);
        carList.add(MONDEO);
        carList.add(MUSTANG);
        carList.add(F40);
        carList.add(F4ORED);
        carList.add(MERG);
        carList.add(MerG63);
        carList.add(VEYRON);
        carList.add(GT);
        return carList;
    }
}


