package models;

public class Estandar801b implements Estandar{
    private final int VALOR_200M = 20000;
    private final int VALOR_20M = 10000;
    @Override
    public int getVelocidadmbps(int cantDispositivos) {
        return (VALOR_200M/cantDispositivos)+VALOR_20M;
    }
}
