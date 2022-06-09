package CarPackage;

public class Car {

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

    public Brand getBrand() {
        return brand;
    }

    public String getYear() {
        return year;
    }

    public Types getTypes() {
        return types;
    }

    public Color getColor() {
        return color;
    }

    public enum Types {
        F40, F50, ENZO, BOXER, CARERRAGT, GT3RS, FOCUS, GT, FIESTARS, MONDEO,MUSTANG, P911, CAYMAN,CAYENNE,;
    }


    public enum Color {
        BLACK, WHITE, RED, GREEN, YELLOW,PINK,BLUE;
    }

    public enum Brand{
        BMW, AUDI,FERRARI,FORD,PORSCHE,LAMBORGHINI,TESLA;
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