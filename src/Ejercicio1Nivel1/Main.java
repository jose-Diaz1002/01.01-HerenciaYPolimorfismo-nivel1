package Ejercicio1Nivel1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Instrument wind1 = new Wind("Flute",50);
        wind1.playInstruments();
        Instrument stringed1 = new Stringed("Guitar",400);
        stringed1.playInstruments();
        Instrument percussion1 = new Percussion("Drum", 150);
        percussion1.playInstruments();
        System.out.println(wind1.playInstruments());
        System.out.println(stringed1.playInstruments());
        System.out.println(percussion1.playInstruments());
    }
}