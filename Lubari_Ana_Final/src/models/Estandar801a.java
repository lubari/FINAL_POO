package models;

public class Estandar801a implements Estandar{
    private final int VELOCIDAD = 2000;
    @Override
    public int getVelocidadmbps(int cantDispositivos) {
        return VELOCIDAD;
    }
}
