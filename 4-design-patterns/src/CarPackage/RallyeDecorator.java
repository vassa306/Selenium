package CarPackage;

public class RallyeDecorator extends CarDecorator {
    private static Car car = null;

    public RallyeDecorator(){
        super(car);
    }


    public String applyOffroadPackage(){
        return " rallye";
    }

    @Override
    public String toString() {
        return super.decorate()+applyOffroadPackage();
    }
}
