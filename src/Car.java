
    public class Car extends Vehicle {
        private int doors;

        public Car(String brand, String model, int speed, int year, int doors) {
            super(brand, model, speed, year);
            this.doors = doors;
        }

        public int getDoors() {
            return doors;
        }

        @Override
        public float getFuelConsumption() {

            switch (getModel()) {
                case "m5":
                    return 10.0f;
                default:
                    return 0.0f;

            }
        }

        @Override
        public void getMaxSpeed() {
            getSpeed();
        }
}


