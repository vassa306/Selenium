package CarPackage;

public class SportDecorator extends CarDecorator {

    public static Car car = null;

    public SportDecorator() {
        super(car);
    }

    public static Car getCar(Car car) {
        return SportDecorator.car;
    }

    public void setCar(Car car) {
        SportDecorator.car = car;
    }

    @Override
    public String toString() {
        return  super.decorate() + applySportPackage();
    }

    @Override
    public String decorate() {
        return "";
    }

    public String applySportPackage(){
        return " Sport";
    }

}
