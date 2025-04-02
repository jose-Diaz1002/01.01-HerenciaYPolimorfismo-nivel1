package Ejercicio1Nivel1;

abstract class Instrument {
    static {
        System.out.println("\n\nthe band is getting ready to play\n");
    }

    private String name;
    private int price;

    public Instrument(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract String playInstruments();

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
