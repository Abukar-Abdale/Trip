
    public class Motorcycle extends Vehicle {
        private boolean windShield;

        public Motorcycle(String brand, String model, int speed, int year, boolean windShield) {
            super(brand, model, speed, year);
            this.windShield = windShield;
        }

        public boolean isWindShield() {
            return windShield;
        }

        @Override
        public float getFuelConsumption() {
            switch (getModel()) {
                case "MT-07":
                    return 4.5f;
                default:
                    return 0.0f;
            }
        }

        @Override
        public void getMaxSpeed() {
            getSpeed();
        }
    }


