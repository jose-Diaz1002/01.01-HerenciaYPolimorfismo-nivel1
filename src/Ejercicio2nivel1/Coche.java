package Ejercicio2nivel1;

public class Coche {
    private static final String marca = "Seat";
    private static String modelo = "Altea";
    private final  double potencia;

    public Coche(){

        potencia = 100;
    }
    public static String frenar(){

        return "El vehículo está frenando";
    }

    public String acelerando(){

        return "El vehículo está acelerando ";
    }

    @Override
    public String toString() {
        return "Coche{" +
                "potencia=" + potencia +
                '}'+ modelo + " " + marca;
    }
}

