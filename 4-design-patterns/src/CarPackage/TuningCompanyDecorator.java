package CarPackage;

public class TuningCompanyDecorator implements TuningCompany{
    private TuningCompany tuningCompany;


    public TuningCompanyDecorator(TuningCompany tuningCompany){
        this.tuningCompany = tuningCompany;


    }


    @Override
    public String TuneCar() {
        System.out.println("Car is tuned");
        return this.tuningCompany.TuneCar();

    }
}
