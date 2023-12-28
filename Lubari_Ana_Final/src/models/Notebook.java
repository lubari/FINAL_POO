package models;

public class Notebook extends Dispositivo{
    private final int VALOR_VELOCIDAD = 10000;

    public Notebook(int macAddress, int velocidadPropia, Red red) {
        super(macAddress, velocidadPropia, red);
    }

    @Override
    public int getVelocidadRed(){
        if(this.red.getCantDispositivos()==0){
            return 0;
        }
        return VALOR_VELOCIDAD/this.red.getCantDispositivos();
    }

    @Override
    public String getNombre() {
        return "Notebook";
    }
}
