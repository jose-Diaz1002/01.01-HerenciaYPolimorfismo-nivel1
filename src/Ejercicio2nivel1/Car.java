package Ejercicio2nivel1;

public class Car {
    private static final String BRAND = "Seat";
    private static String model;
    private final int POWER;

    public Car(String model, int power) {
        this.POWER = power;
        Car.model = model;
    }

    public static String brake() {
        return "The vehicle is braking";
    }

    public String accelerating() {
        return "The vehicle is accelerating";
    }

    @Override
    public String toString() {
        return "Car: " + Car.BRAND + "\nmodel: " + model +
                "\npower= " + POWER + " Hp\n";
    }
}

