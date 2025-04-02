package Ejercicio1Nivel1;

public class Stringed extends Instrument {
    static {
        System.out.println("Stringed instruments ready");
    }

    public Stringed(String name, int price) {

        super(name, price);
    }

    @Override
    public String playInstruments() {

        return ("The stringed instrument is playing.");
    }
}
