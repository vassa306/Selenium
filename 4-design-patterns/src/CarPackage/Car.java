package CarPackage;

public class Car implements CarI {

    Brand brand;
    Color color;
    Types types;
    private String year;

    public Car(Builder builder){
        this.brand = builder.brand;
        this.types = builder.types;
        this.color = builder.color;
        this.year = builder.year;
    }

    @Override
    public Brand getBrand() {
        return brand;
    }

    @Override
    public String getYear() {
        return year;
    }

    @Override
    public Types getTypes() {
        return types;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car: " +
                "  BRAND=" + brand +
                ", COLOR=" + color +
                ", TYPES=" + types +
                ", YEAR=" + year +
                ", PACKAGE= ";
    }

    public enum Types {
        F40, F50, ENZO, BOXER, CARERRAGT, GT3RS, FOCUS, GT, FIESTARS, MONDEO,MUSTANG, P911, CAYMAN,CAYENNE,;
    }


    public enum Color {
        BLACK, WHITE, RED, GREEN, YELLOW,PINK,BLUE;
    }

    public enum Brand{
        FERRARI,FORD,PORSCHE;
    }

    static class Builder{
        Brand brand;
        Color color;
        Types types;
        private String year;


        public Car build(){
            return new Car(this);
        }

        public Builder(){

        }

        public Builder brand (Brand brand){
            this.brand = brand;
            return this;
        }

        public Builder types (Types types){
            this.types = types;
            return this;
        }

        public Builder color(Color color){
            this.color = color;
            return  this;
        }

        public Builder year(String year){
            this.year = year;
            return this;
        }
    }

}