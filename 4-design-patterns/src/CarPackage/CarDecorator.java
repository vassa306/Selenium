package CarPackage;




public class CarDecorator implements CarI,TuningCompany {
    protected TuningCompany tuningCompany;
    private Car car;

    public CarDecorator(TuningCompany tuningCompany, Car car){
        super();
        this.car = car;
        this.tuningCompany = tuningCompany;

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
    public String decorate() {
        return tuningCompany.decorate();
    }
}

