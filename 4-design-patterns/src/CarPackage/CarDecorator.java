package CarPackage;

public class CarDecorator implements ITuningCompany {

    protected Car car;;

    public CarDecorator(Car car) {
        super();
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String decorate() {
        return "configuration";
    }
}
