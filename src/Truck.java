
    public class Truck extends Vehicle {
        private int doors;
        private int capacity;

        public Truck(String brand, String model, int speed, int year, int doors, int capacity) {
            super(brand, model, speed, year);
            this.doors = doors;
            this.capacity = capacity;
        }

        public int getDoors() {
            return doors;
        }

        public int getCapacity() {
            return capacity;
        }
        @Override
        public float getFuelConsumption() {
            switch (getModel()) {
                case "R450":
                    return 35.0f;
                default:
                    return 0.0f;
            }
        }

        @Override
        public void getMaxSpeed() {
            getSpeed();
        }




    }
