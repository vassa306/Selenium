public class Animal {
    String sound;
    String color;
    String name;


        public Animal(String sound, String color, String name) {
            this.sound = sound;
            this.color = color;
            this.name = name;

        }

        public String getSound() {
            return sound;
        }

        public String getColor() {
            return color;
        }

        public  String getName(String name) {
            return name;

        }

        public void setSound(String sound){
            this.sound = sound;
        }

        public void setColor(String color){
            this.color = color;
        }

        public void setName(String name) {
            this.name = name;
        }
    }



