package CarPackage;

    public class CarBuilder {
        private Car.Brand brand;
        private String spz;
        private Car.Color color;
        private Car.Types types;

        public CarBuilder setBrand(Car.Brand brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setSpz(String spz) {
            this.spz = spz;
            return this;
        }

        public CarBuilder setColor(Car.Color color) {
            this.color = color;
            return this;
        }

        public CarBuilder setTypes(Car.Types types){
            this.types = types;
            return this;
        }

        public Car createCar() {
            return new Car(brand, types, spz, color) {




                @Override
                public void tune() {

                }
            };
        }

    }

