package CarPackage;

public class SportDecorator extends CarDecorator {

    private static final Car car = null;
    private final TuningCompany tuningCompany;

    public SportDecorator(TuningCompany tuningCompany) {
        super(tuningCompany, car);
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

    public String toString() {
        return applySportPackage() + super.tuningCompany.decorate();
    }


    @Override
    public String decorate() {
       return applySportPackage();

    }

    private String applySportPackage(){
        return "SPORT";
    }
}


