package CarPackage;

public class OffroadDecorator extends CarDecorator {


    private static final Car car = null;

    //new constructor
    public OffroadDecorator(TuningCompany tuningCompany) {
        super(tuningCompany, car);
    }
    @Override
    public Car.Brand getBrand() {
        return null;
    }

    @Override
    public String getYear() {
        return null;
    }

    @Override
    public Car.Types getTypes() {
        return null;
    }

    @Override
    public Car.Color getColor() {
        return null;
    }

    @Override
    public String toString() {
        return applyOffroadPackage() + super.toString();
    }

    @Override
    public String decorate() {
       return applyOffroadPackage();
    }

    public String applyOffroadPackage(){
        return "OFFROAD";
    }
}
