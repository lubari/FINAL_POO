package models;

public class CAT5 implements Estandar {
    private final int VALOR_PARA_VELOCIDAD = 3000;
    @Override
    public int getVelocidadmbps(int cantDispositivos) {
        return VALOR_PARA_VELOCIDAD/cantDispositivos;
    }
}
