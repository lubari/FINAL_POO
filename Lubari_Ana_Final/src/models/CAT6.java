package models;

public class CAT6 implements Estandar{
    private final int VALOR_100M = 10000;
    private final int VALOR_10M = 10000;

    @Override
    public int getVelocidadmbps(int cantDispositivos) {
        return (VALOR_100M/cantDispositivos)+VALOR_10M;
    }
}
