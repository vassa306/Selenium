package src.main.java;

public class Car {
    int speed;
    double regularPrice;
    String color;

    public Car(int speed, double regularPrice, String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSalePrice(){

        return regularPrice;

    }

    static class Truck extends Car {
        static int weight;

        public Truck(int weight){
            super(300,300,"blue");
            this.weight = weight;
        }


        @Override
        public double getSalePrice() {
            if(weight> 2000){
                return regularPrice - (regularPrice * 0.1);
            }else{
                return regularPrice;
            }
        }

        public static int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

    static class Ford extends Car {
        int year;
        int manufacturerDiscount;

        public Ford(int year, int manufacturerDiscount){
            super(300,300,"blue");
            this.year = year;
            this.manufacturerDiscount = manufacturerDiscount;
        }

        @Override
        public double getSalePrice() {
            System.out.println(super.getSalePrice());
            return super.getSalePrice() - manufacturerDiscount;
        }

        public int getManufacturerDiscount() {
            return manufacturerDiscount;
        }

        public int getYear() {
            return year;
        }

        public void setManufacturerDiscount(int manufacturerDiscount) {
            this.manufacturerDiscount = manufacturerDiscount;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

    static class Sedan extends Car {
        int length ;

        public Sedan(int length){
            super(300,300,"blue");
            this.length = length;
        }

        public double getSalePrice(){
            if(length>20){
                return regularPrice - (regularPrice * 0.05);
            }else{
                return regularPrice - (regularPrice * 0.1);
            }
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }
    }






}


