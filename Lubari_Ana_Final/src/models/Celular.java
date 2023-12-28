package models;

public class Celular extends Dispositivo {
    private final int VALOR_VELOCIDAD = 500;

    public Celular(int macAddress, int velocidadPropia, Red red) {
        super(macAddress, velocidadPropia, red);
    }

    @Override
    public int getVelocidadRed(){
        return VALOR_VELOCIDAD * red.getCantDispositivos();
    }

    @Override
    public String getNombre() {
        return "Celular";
    }
}
