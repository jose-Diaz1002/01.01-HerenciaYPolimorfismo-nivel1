package Ejercicio1Nivel1;

public class Wind extends Instrument {

    static {
        System.out.println("Wind instruments ready");
    }

    public Wind(String name, int price) {

        super(name, price);
    }

    @Override
    public String playInstruments() {

        return ("The wind instrument is playing.");
    }
}
