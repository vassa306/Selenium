package CarPackage;

public class RallyeDecorator extends CarDecorator{
    private static final Car car = null;

    public RallyeDecorator(TuningCompany tuningCompany) {
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
        return applyRallyePackage()+super.tuningCompany.decorate();
    }

    @Override
    public String decorate() {
        return applyRallyePackage();
    }

    public String applyRallyePackage(){
        return "RALLYE";
    }
}

