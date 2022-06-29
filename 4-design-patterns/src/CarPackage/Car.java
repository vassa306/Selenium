package CarPackage;

public abstract class Car  {

    public abstract void tune();

    public enum Color {
        yellow, blue, red, green,black,white,blackmatte;
    }

    public String spz = null;

    public enum Brand {
        BMW, AUDI, MERCEDES, PORSCHE,FORD,FERRARI,BUGATTI;
    }



    public enum Types {
        E36, E92, E30, E46, EClass2007, C220, S32004, A52015, A8, Q7, S52015,CAYMAN,CARRERA,CARRERAGT,P911,MUSTANG,
        GT,FIESTA,F40,CALIFORNIA,FFX,MONDEO,G63, G,VEYRON;
    }

    Brand brand;
    Color color;
    Types types;

    public Car(Brand brand, Types types, String spz, Color color) {
        this.brand = brand;
        this.types = types;
        this.spz = spz;
        this.color = color;

    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getSpz() {
        return spz;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "Car: " +
                " brand=" + brand +
                " color=" + color +
                " type=" + types +
                " spz=" + spz +
                " package="+
                "\n"
                ;
    }
}


