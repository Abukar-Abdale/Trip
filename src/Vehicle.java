public abstract class Vehicle {

    private String brand;
    private String model;
    private int speed;
    private int year;


    public Vehicle(String brand, String model, int speed, int year) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    public abstract float getFuelConsumption();

    public abstract void getMaxSpeed();

}




