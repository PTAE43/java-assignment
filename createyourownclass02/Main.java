package javaassignment.createyourownclass02;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setBrand("Toyota");
        myCar.setSpeed(120);

        myCar.displayInfo();

        System.out.println("Brand = " + myCar.getBrand());
        System.out.println("Speed = " + myCar.getSpeed() + " km/h");
    }
}
