package CarPackage;

import java.util.ArrayList;
import java.util.List;

public class CarList {


        static Car.Builder cars = new Car.Builder();

        public static List<CarI> getCarList(List<CarI> carList){


            Car boxer =  new Car.Builder().brand(Car.Brand.PORSCHE).color(Car.Color.BLACK).types(Car.Types.BOXER).year("1997").build();
            Car mustang = new Car.Builder().brand(Car.Brand.FORD).color(Car.Color.BLACK).types(Car.Types.MUSTANG).year("1967").build();
            Car carreragt = new Car.Builder().brand(Car.Brand.PORSCHE).color(Car.Color.WHITE).types(Car.Types.CARERRAGT).year("2002").build();
            Car fiestars = new Car.Builder().brand(Car.Brand.FORD).color(Car.Color.RED).types(Car.Types.FIESTARS).year("2017").build();
            Car focus = new Car.Builder().brand(Car.Brand.FORD).color(Car.Color.BLUE).types(Car.Types.FOCUS).year("1999").build();
            Car mondeo = new Car.Builder().brand(Car.Brand.FORD).color(Car.Color.GREEN).types(Car.Types.MONDEO).year("2009").build();
            Car enzo = new Car.Builder().brand(Car.Brand.FERRARI).color(Car.Color.RED).types(Car.Types.ENZO).year("2002").build();
            Car fforty = new Car.Builder().brand(Car.Brand.FERRARI).color(Car.Color.RED).types(Car.Types.F40).year("1992").build();

            //add values in carlist
            carList.add(boxer);
            carList.add(carreragt);
            carList.add(fiestars);
            carList.add(mustang);
            carList.add(focus);
            carList.add(mondeo);
            carList.add(enzo);
            carList.add(fforty);


            // for(Car o:carList){
            //  System.out.println("Brand: " + o.getBrand() + " Color:" + o.getColor() + " Type: " +o.getTypes() +" YEAR" + o.getYear());




            return carList;
        }

        public static void main(String[] args) {
            List<CarI>carList = new ArrayList<>();
            getCarList(carList);





        }

}
