package Ejercicio2nivel1;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Altea",300);
        Car car2 = new Car("Leon",400);
        System.out.println(car1);
        System.out.println(car2);

        System.out.println(car1.accelerating());
        System.out.println(Car.brake());


    }
}
