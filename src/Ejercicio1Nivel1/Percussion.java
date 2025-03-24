package Ejercicio1Nivel1;

public class Percussion extends Instrument {
    static {
        System.out.println("the percussion instruments ready\n");
    }

    public Percussion(String name, int price){

        super(name, price);
    }

    public String playInstruments() {

        return ("The percussion instrument is playing.");
    }
}