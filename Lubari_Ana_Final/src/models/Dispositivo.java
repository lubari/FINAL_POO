package models;

import Views.DispositivoView;

public abstract class Dispositivo {
    protected int macAddress;
    protected int velocidadPropia;
    protected Red red;

    Dispositivo(int macAddress, int velocidadPropia, Red red){
        this.macAddress = macAddress;
        this.velocidadPropia = velocidadPropia;
        this.red = red;
    }

    public DispositivoView toView(){
        return new DispositivoView(this.macAddress, this.red.nombre, this.getNombre(), this.getVelocidadMaxima());
    }
    public int getVelocidadMaxima(){
        if(this.velocidadPropia < this.getVelocidadRed()){
            return this.velocidadPropia;
        }
        return this.getVelocidadRed();
    }

    abstract int getVelocidadRed();
    abstract String getNombre();
    public int getMacAddress(){
        return this.macAddress;
    }

    public Red getRed(){
        return this.red;
    }
}
