package javaassignment.create_your_own_class02;

public class Car {
    private String brand;
    private int speed;

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed + " km/h");
    }
}
