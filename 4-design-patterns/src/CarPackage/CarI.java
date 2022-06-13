package CarPackage;

public interface CarI {

    //created because in Car is Builder in constructor
    Car.Brand getBrand();

    String getYear();

    Car.Types getTypes();

    Car.Color getColor();

    @Override
    String toString();
}
