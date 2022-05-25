import java.sql.SQLOutput;

public class MyOwnAutoShop {

    public static void main(String... args) {

        // new instance of class CAR
        Car Car = new Car(300,300,"blue");
        System.out.println(Car.getColor() + ", " + Car.regularPrice + "," + Car.getSpeed());



        System.out.println("-------------------Create two instances of Sedan class-------------------------------------------------------");
        System.out.println();


        Car Sedan = new Car.Sedan(30);
        Car Sedan1 = new Car.Sedan(15);
        // lengt > 20
        System.out.println("SalesPrice is " + Sedan.getSalePrice());

        //lenght < 20 Discount
        System.out.println("SalesPrice is "  + Sedan1.getSalePrice());

        //Two instances of Ford
        Car Escort = new Car.Ford(1990, 20);
        Car Focus = new Car.Ford(1999, 10);

        System.out.println("Prize of Escort : " + Escort.getSalePrice());
        System.out.println("Prize of Focus : " + Focus.getSalePrice());

        //Instance of Trucks with displayed Prices
        Car Tatra = new Car.Truck(3000);
        System.out.println("Prize of Tatra truck is: " + Tatra.getSalePrice());
        System.out.println(((Car.Truck) Tatra).getWeight());

        Car Man = new Car.Truck(1999);
        System.out.println("Prize of Main is " +  Man.getSalePrice());
        System.out.println(((Car.Truck) Man).getWeight());





    }




}
