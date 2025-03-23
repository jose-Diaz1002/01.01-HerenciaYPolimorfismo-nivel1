package Ejercicio2nivel1;

public class Car {
    private static final String brand = "Seat";
    private static String model = "Altea";
    private final double power;

    public Car() {
        power = 100;
    }

    public static String brake() {

        return "The vehicle is braking";
    }

    public String accelerating() {

        return "The vehicle is accelerating";
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                '}' + model + " " + brand;
    }
}

