package models;

public class Tablet extends Dispositivo{
    private final int VALOR_VELOCIDAD = 2500;

    public Tablet(int macAddress, int velocidadPropia, Red red) {
        super(macAddress, velocidadPropia, red);
    }

    @Override
    public int getVelocidadRed(){
        return VALOR_VELOCIDAD;
    }

    @Override
    public String getNombre() {
        return "tablet";
    }
}
